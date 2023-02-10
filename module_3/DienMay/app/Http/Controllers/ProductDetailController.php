<?php

namespace App\Http\Controllers;

use App\Models\Category;
use App\Models\Product;
use App\Models\Rating;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class ProductDetailController extends FrontendController
{
    public function __construct()
    {
        parent::__construct();
    }

    /**
     * @param Request $request
     * @return \Illuminate\Contracts\View\Factory|\Illuminate\View\View
     */
    public function productDetail(Request $request)
    {
        $url = $request->segment(2);
        $url = preg_split('/(-)/i',$url);

        if ($id= array_pop($url))
        {
            $productDetail = Product::where('pro_hoatdong',Product::STATUS_PUBLIC)->find($id);

            $cateProduct = Category::find($productDetail->pro_loaisanpham_id);

            $binhluan = Rating::with('user:id,name')
                ->where('ra_sanpham_id',$id)
                ->orderBy('id','DESC')
                ->paginate(10);

            // gom nhom lai tong xem
            $ratingsDashboard = Rating::groupBy('ra_sodanhgia')
                ->where('ra_sanpham_id',$id)
                ->select(DB::raw('count(ra_sodanhgia) as total'),DB::raw('sum(ra_sodanhgia) as sum'))
                ->addSelect('ra_sodanhgia')
                ->get()->toArray();

            $arrayRatings = [];

            if (!empty($ratingsDashboard))
            {
                for ($i = 1 ; $i <= 5; $i++)
                {
                    $arrayRatings[$i] = [
                        "total" => 0,
                        "sum" => 0,
                        "ra_sodanhgia" => 0
                    ];

                    foreach ($ratingsDashboard as $item)
                    {
                        if ($item['ra_sodanhgia'] == $i)
                        {
                            $arrayRatings[$i] = $item;
                            continue;
                        }
                    }
                }
            }



            $viewData = [
              'productDetail' =>$productDetail,
               'cateProduct'  => $cateProduct,
               'binhluan'      =>$binhluan,
              'arrayRatings'  =>$arrayRatings
            ];
            return view('product.detail',$viewData);
        }
    }
}
