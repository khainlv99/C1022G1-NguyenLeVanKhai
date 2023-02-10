@extends('admin::layouts.master')
@section('content')
    <div class="page-header">
        <ol class="breadcrumb">
            <li><a href="#">Trang chủ</a></li>
            <li><a href="#">Đánh giá</a></li>
            <li class="active">Danh sách</li>
        </ol>
    </div>
    <div class="table-responsive">
        <h2>Quản lí đánh giá </h2>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th >Tên thành viên</th>
                <th >Sản Phẩm</th>
                <th>Nội dung</th>
                <th >Rating</th>
                <th>Thao tác</th>
            </tr>
            </thead>
            <tbody>
            @if(isset($binhluan))
                @foreach($binhluan as $rating)
                    <tr>
                        <td>{{$rating->id}}</td>
                        <td>{{isset($rating->user->name) ? $rating->user->name : '[N\A]'}}</td>
                        <td><a href="">{{isset($rating->product->pro_tensp) ? $rating->product->pro_tensp : '[N\A]'}}</a></td>
                        <td>{{$rating->ra_noidung}}</td>
                        <td>{{$rating->ra_sodanhgia}}</td>
                        <td>
                            <a style="padding: 5px 10px;border: 1px solid #eee;font-size: 12px" href="{{route('admin.get.action.rating',['delete',$rating->id])}}"><i class="fas fa-trash-alt" style="font-size: 11px"></i>Xóa</a>
                        </td>
                    </tr>
                @endforeach
            @endif

            </tbody>
        </table>
    </div>
@stop