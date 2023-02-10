<?php

namespace Modules\Admin\Http\Controllers;

use App\Models\Rating;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Routing\Controller;

class AdminRatingController extends Controller
{
    /**
     * Display a listing of the resource.
     * @return Response
     */
    public function index()
    {
        $binhluan = Rating::with('user:id,name','product:id,pro_tensp')->paginate(10);

        $viewData = [
          'binhluan' => $binhluan
        ];
        return view('admin::rating.index',$viewData);
    }

    public function action($action,$id)
    {
        $messages ='';
        if($action) {
            $rating = Rating::find($id);

            switch ($action)
            {
                case 'delete':
                    $rating->delete();
                    $messages = 'Xóa dữ liệu thành công';
                    break;
            }
        }
        return redirect()->back()->with('success',$messages);
    }
}
