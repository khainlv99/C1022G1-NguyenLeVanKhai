<?php

namespace Modules\Admin\Http\Controllers;

use App\Http\Requests\RequestProduct;
use App\Models\Category;
use App\Models\Product;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Routing\Controller;

class AdminProductController extends Controller
{
    /**
     * Display a listing of the resource.
     * @param Request $request
     * @return Response
     */
    public function index(Request $request)
    {   $sanpham = Product::with('category:id,c_ten');

        if ($request->name) $sanpham->where('pro_tensp','like','%'.$request->name.'%');
        if ($request->cate) $sanpham->where('pro_loaisanpham_id',$request->cate);

        $sanpham = $sanpham->orderByDesc('id')->paginate(8);

        $loaisanpham = $this->getloaisanpham();

        $viewData= [
            'sanpham'=> $sanpham,
            'loaisanpham'=>$loaisanpham
        ];
        return view('admin::product.index',$viewData);
    }

    public function create()
    {
        $loaisanpham = $this->getloaisanpham();
        return view('admin::product.create',compact('loaisanpham'));
    }

    public  function store(RequestProduct $requestProduct){
//            dd($requestProduct->all());
        $this->insertOrUpdate($requestProduct);
        return redirect()->back()->with('success','Thêm mới thành công');

    }
    public function edit($id)
    {
        $product = Product::find($id);
        $loaisanpham = $this->getloaisanpham();
        return view('admin::product.update',compact('product','loaisanpham'));
    }

    public function update(RequestProduct $requestProduct,$id){
        $this->insertOrUpdate($requestProduct,$id);
        return redirect()->back()->with('success','Cập nhập thành công');
    }
    public function getloaisanpham(){
        return Category::all();
    }

    public function insertOrUpdate($requestProduct,$id='')
    {
        $product =new Product();

        if ($id) $product = Product::find($id);

        $product->pro_tensp = $requestProduct->pro_tensp;
        $product->pro_slug = str_slug($requestProduct->pro_tensp);
        $product->pro_loaisanpham_id = $requestProduct->pro_loaisanpham_id;
        $product->pro_dongia = $requestProduct->pro_dongia;
        $product->pro_giamgia = $requestProduct->pro_giamgia;
        $product->pro_noidungsp = $requestProduct->pro_noidungsp;
        $product->pro_soluong = $requestProduct->pro_soluong;
        $product->pro_mota = $requestProduct->pro_mota;
        $product->pro_tieude = $requestProduct->pro_tieude ? $requestProduct->pro_tieude : $requestProduct->pro_tensp;
        $product->pro_mota_seo = $requestProduct->pro_mota_seo ? $requestProduct->pro_mota_seo : $requestProduct->pro_mota_seo;


        if ($requestProduct->hasFile('avatar'))
        {
            $file = upload_image('avatar');
            if (isset($file['name']))
            {
                $product->pro_hinhdaidien=$file['name'];
            }
        }

        $product->save();
    }

    public function action(Request $request,$action,$id)
    {
        $messages ='';
        if($action)
        {
            $product = Product::find($id);
            switch ($action)
            {
                case 'delete':
                    $product->delete();
                    $messages = 'Xóa dữ liệu thành công';
                    break;
                case 'active':
                    $product->pro_hoatdong = $product->pro_hoatdong ? 0:1;
                    $product->save();
                    break;
                case 'hot':
                    $product->pro_sphot = $product->pro_sphot ? 0:1;
                    $product->save();
                    break;
            }
        }
        return redirect()->back()->with('success',$messages);
    }
}
