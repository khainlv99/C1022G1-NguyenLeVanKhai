<?php

namespace App\Http\Controllers;

use App\Models\Product;
use App\Models\Rating;
use Carbon\Carbon;
use Illuminate\Http\Request;

class RatingController extends Controller
{
    public function saveRating(Request $request,$id)
    {
        if ($request->ajax())
        {
            Rating::insert([
                'ra_sanpham_id'=> $id,
                'ra_sodanhgia'    => $request->number,
                'ra_noidung'   => $request->r_content,
                'ra_khachhang_id'   => get_data_user('web'),
                'ngaytao'   =>Carbon::now(),
                'ngaycapnhap'   =>Carbon::now(),
            ]);

            $product = Product::find($id);

            $product->pro_tongsodiemdanhgia += $request->number;
            $product->pro_tongdanhgia += 1;
            $product->save();

           return response()->json(['code'=>'1']);
        }
    }
}
