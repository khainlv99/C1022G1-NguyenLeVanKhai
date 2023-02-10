<?php

namespace App\Http\Controllers;

use App\Models\Article;
use App\Models\Category;
use App\Models\Product;
use Illuminate\Http\Request;

class HomeController extends FrontendController
{
    public function __construct()
    {
        parent::__construct();
    }

    public function index()
    {
        $productHot = Product::where([
           'pro_sphot'=>Product::HOT_ON,
           'pro_hoatdong'=>Product::STATUS_PUBLIC
        ])->limit(8)->get();

        $articleNews = Article::orderBy('id','DESC')->limit(6)->get();

        $loaisanphamHome = Category::with('sanpham')
            ->where('c_noibat',Category::HOME)
            ->limit(3)
            ->get();

        $viewData = [
          'productHot' => $productHot,
          'articleNews' => $articleNews,
          'loaisanphamHome' => $loaisanphamHome
        ];
        return view('home.index',$viewData);
    }
}
