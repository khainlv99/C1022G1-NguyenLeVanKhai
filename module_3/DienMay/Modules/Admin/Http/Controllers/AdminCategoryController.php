<?php

namespace Modules\Admin\Http\Controllers;

use App\Http\Requests\RequestCategory;
use App\Models\Category;
use http\Message;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Routing\Controller;
use Illuminate\Support\Facades\Log;
use vendor\project\StatusTest;

class AdminCategoryController extends Controller
{
    public function index()
    {
        $loaisanpham = Category::select('id','c_ten','c_tieudesp','c_hienthi','c_noibat')->get();

        $viewData=[
            'loaisanpham' => $loaisanpham
        ];

        return view('admin::category.index', $viewData);
    }

    public function create(){
        return view('admin::category.create');
    }
//thêm sản phẩm
    public function store(RequestCategory $requestCategory)
    {
//        dd($requestCategory->all());
       $this -> insertOrUpdate($requestCategory);
        return redirect()->back()->with('success','Thêm mới thành công');

    }
    public function edit($id){
        $category = Category::find($id);
        return view('admin::category.update',compact('category'));
    }
//sửa sản phẩm
    public function update(RequestCategory $requestCategory,$id)
    {
        $this -> insertOrUpdate($requestCategory,$id);
        return redirect()->back()->with('success','Cập nhật dữ liệu thành công');
    }

    public function insertOrUpdate($requestCategory,$id='')
    {
        $code = 1;
        try{
            $category = new Category();

            if($id){
                $category = Category::find($id);
            }
            $category->c_ten = $requestCategory->name;
            $category->c_slug = str_slug($requestCategory->name);
            $category->c_bieutuong = str_slug($requestCategory->icon);
            $category->c_tieudesp = $requestCategory->c_tieudesp ? $requestCategory->c_tieudesp : $requestCategory->name;
            $category->c_mota_seo = $requestCategory->c_mota_seo;
            $category->save();
        }catch (\Exception $exception)
        {
            $code = 0;
            Log::error("[Error insertOrUpdate loaisanpham ]".$exception->getMessage());
        }
        return $code;
    }

    public function action($action,$id)
    {
        $messages ='';
        if($action)
        {
            $category = Category::find($id);
            switch ($action)
            {
                case 'delete':
                    $category->delete();
                    $messages = 'Xóa dữ liệu thành công';
                    break;
                case 'active':
                    $category->c_hienthi = $category->c_hienthi ? 0:1;
                    $category->save();
                    break;
                case 'home':
                    $category->c_noibat = $category->c_noibat ? 0:1;
                    $category->save();
                    break;
            }
        }
        return redirect()->back()->with('success',$messages);
    }
}
