<?php

namespace App\Http\Controllers;

use App\Models\Category;
use App\Models\Product;
use Illuminate\Http\Request;

class CategoryController extends FrontendController
{
    public function __construct()
    {
        parent::__construct();
    }
   public function getListProduct(Request $request)
   {
       $url = $request->segment(2);
       $url = preg_split('/(-)/i',$url);

       $sanpham = Product::where("pro_hoatdong",Product::STATUS_PUBLIC);

       $cateProduct = [];

       if ($id = array_pop($url))
       {
           $cateProduct = Category::find($id);
           $sanpham->where('pro_loaisanpham_id',$id);
       }
       if ($request->key)
       {
           $sanpham->where('pro_tensp','like','%'.$request->key.'%');
       }

       if ($request->price)
       {
           $price = $request->price;
           switch ($price)
           {
               case '1':
                   $sanpham->where('pro_dongia','<',1000000);
                   break;

               case '2':
                   $sanpham->whereBetween('pro_dongia',[1000000,3000000]);
                   break;

               case '3':
                   $sanpham->whereBetween('pro_dongia',[3000000,5000000]);
                   break;

               case '4':
                   $sanpham->whereBetween('pro_dongia',[5000000,7000000]);
                   break;

               case '5':
                   $sanpham->whereBetween('pro_dongia',[7000000,10000000]);
                   break;

               case '6':
                   $sanpham->where('pro_dongia','>',10000000);
                   break;
           }
       }

       if ($request->orderby)
       {
           $orderby =$request->orderby;
           switch ($orderby)
           {
               case'desc':
                   $sanpham->orderBy('id','DESC');
                   break;

               case'asc':
                   $sanpham->orderBy('id','ASC');
                   break;

               case'price_max':
                   $sanpham->orderBy('pro_dongia','ASC');
                   break;

               case'price_min':
                   $sanpham->orderBy('pro_dongia','DESC');
                   break;

               default:
                   $sanpham->orderBy('id','DESC');

           }
       }

       $sanpham = $sanpham->paginate(9);

       $viewData = [
           'sanpham' => $sanpham,
           'cateProduct' => $cateProduct,
           'query'    =>$request->query()
       ];
       return view('product.index',$viewData);

   }
}
