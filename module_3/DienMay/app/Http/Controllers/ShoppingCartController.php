<?php

namespace App\Http\Controllers;

use App\Models\Order;
use App\Models\Product;
use App\Models\Transaction;
use Carbon\Carbon;
use Illuminate\Http\Request;

class ShoppingCartController extends FrontendController
{
    public function __construct()
    {
        parent::__construct();
    }

    public function addProduct(Request $request,$id)
    {

       $product = Product::select('pro_tensp','id','pro_dongia','pro_giamgia','pro_hinhdaidien','pro_soluong')->find($id);

       if (!$product) return redirect('/');

       $price = $product->pro_dongia;

       if ($product->pro_giamgia)
       {
           $price = $price * (100 - $product->pro_giamgia)/100;
       }

        if ($product->pro_soluong === 0)
        {
            return redirect()->back()->with('warning','Sản phẩm đã hết hàng');
        }


        \Cart::add([
            'id' => $id,
            'name' => $product->pro_tensp,
            'qty' => 1,
            'price' => $price,
            'options' => [
                'avatar' =>$product->pro_hinhdaidien,
                'sale'   =>$product->pro_giamgia,
                'price_old' =>$product->pro_dongia
                ]
        ]);
        return redirect()->back()->with('success','Mua hàng thành công');
    }


    /**
     * @param $key
     * xoa gio hang
     * @return \Illuminate\Http\RedirectResponse
     */
    public function deleteProductItem($key)
    {
        \Cart::remove($key);

        return redirect()->back();
    }

    /**
     * danh sach gio hang
    */
    public function getListShoppingCart()
    {
        $sanpham = \Cart::content();

        return view('shopping.index',compact('sanpham'));
    }

    /**
     * update so luong gio hang
    */
    public function getUpdateCart(Request $request)
    {
        \Cart::update($request->rowId,$request->qty);
    }

    /**
     * Form thanh toan
    */
    public function  getFormPay()
    {
        $sanpham = \Cart::content();

        return view('shopping.pay',compact('sanpham'));
    }

    public function saveInfoShoppingCart(Request $request)
    {
        $totalMoney =str_replace(',','', \Cart::subtotal(0,3));
        $transactionId = Transaction::insertGetId([
            'tr_khachhang_id'=>get_data_user('web'),
            'tr_tongtien' =>(int)$totalMoney,
            'tr_ghichu' =>$request->note,
            'tr_diachi'=>$request->address,
            'tr_sodienthoai'=>$request->phone,
            'ngaytao'=>Carbon::now(),
            'ngaycapnhap'=>Carbon::now(),
            ]);

        if ($transactionId)
        {
            $sanpham = \Cart::content();
            foreach ($sanpham as $product)
            {
                Order::insert([
                    'or_donhang_id' =>$transactionId,
                    'or_sanpham_id' =>$product->id,
                    'or_soluong' =>$product->qty,
                    'or_giatien'=>$product->options->price_old,
                    'or_giamgia'=>$product->options->price_sale,
                    'ngaytao'=>Carbon::now(),
                    'ngaycapnhap'=>Carbon::now(),
                ]);
            }
        }

        \Cart::destroy();

        return redirect('/')->with('success','Đặt hàng thành công');
    }
}
