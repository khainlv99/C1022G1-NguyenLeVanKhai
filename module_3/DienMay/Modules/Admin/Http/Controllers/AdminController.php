<?php

namespace Modules\Admin\Http\Controllers;

use App\Models\Contact;
use App\Models\Rating;
use App\Models\Transaction;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Routing\Controller;

class AdminController extends Controller
{
    /**
     * Display a listing of the resource.
     * @return Response
     */
    public function index()
    {
        $binhluan = Rating::with('user:id,name','product:id,pro_tensp')->limit(10)->get();

        $lienhe = Contact::limit(10)->get();

        // doanh thu ngay

        $moneyDay = Transaction::whereDay('ngaycapnhap',date('d'))
            ->where('str_trangthaidonhang',Transaction::STATUS_DONE)
            ->sum('tr_tongtien');

        // doanh thu thang

        $moneyMonth = Transaction::whereMonth('ngaytao','=',date('m'))
            ->where('str_trangthaidonhang',Transaction::STATUS_DONE)
            ->sum('tr_tongtien');

        // doanh thu nam
        $moneyYear = Transaction::whereYear('ngaycapnhap',date('Y'))
            ->where('str_trangthaidonhang',Transaction::STATUS_DONE)
            ->sum('tr_tongtien');

        $dataMoney = [
            [
                "name" => "Doanh thu ngày",
                 "y"   => (int)$moneyDay
            ],
            [
                "name" => "Doanh thu tháng",
                "y"   => (int)$moneyMonth
            ],
            [
                "name" => "Doanh thu năm",
                "y"   => (int)$moneyYear
            ],
        ];

        // danh sách đơn hàng mới
        $donhangNews = Transaction::with('user:id,name')
            ->limit(5)
            ->orderByDesc('id')
            ->get();

        $viewData = [
            'binhluan' =>$binhluan,
            'lienhe' =>$lienhe,
            'moneyDay' =>$moneyDay,
            'moneyMonth'=>$moneyMonth,
            'moneyYear' =>$moneyYear,
            'dataMoney' =>json_encode($dataMoney),
            'donhangNews'=>$donhangNews

        ];
        return view('admin::index',$viewData);
    }

}
