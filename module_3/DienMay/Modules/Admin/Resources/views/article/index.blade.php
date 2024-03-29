@extends('admin::layouts.master')

@section('content')
    <div class="page-header">
        <ol class="breadcrumb">
            <li><a href="#">Trang chủ</a></li>
            <li><a href="#">Bài viết</a></li>
            <li class="active">Danh sách</li>
        </ol>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <form class="form-inline" action="" style="margin-bottom: 20px">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Tên bài viết ...." name="name" value="{{ Request::get('name') }}">
                </div>
                <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
            </form>
        </div>
    </div>
    <div class="table-responsive">
        <h2>Quản lí bài viết <a href="{{route('admin.get.create.article')}}" class="pull-right"><i class="fas fa-plus-circle"></i></a></h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>#</th>
                    <th width="20%">Tên bài viết</th>
                    <th style="width: 100px">Hình ảnh</th>
                    <th style="width: 300px;">Mô tả</th>
                    <th>Trạng thái</th>
                    <th>Ngày tạo</th>
                    <th>Thao tác</th>
                </tr>
            </thead>
            <tbody>
            @if( isset($baiviet))
                @foreach($baiviet as $article)
                    <tr>
                        <td>{{$article->id}}</td>
                        <td>{{$article->a_tenbaiviet}}
                        </td>
                        <td>
                            <img src="{{ asset(pare_url_file($article->a_hinhdaidien))}}" alt="" class="img img-responsive" width="80px" height="80px">
                        </td>
                        <td>{{$article->a_motabaiviet}}</td>
                        <td>
                            <a href="{{route('admin.get.action.article',['active',$article->id])}}" class="label {{$article->getStatus($article->a_hoatdong)['class']}}">{{$article->getStatus($article->a_hoatdong)['name']}}</a>
                        </td>
                        <td>
                            {{$article->ngaytao}}
                        </td>
                        <td>
                            <a style="padding: 5px 10px;border: 1px solid #eee;font-size: 12px" href="{{route('admin.get.edit.article',$article->id)}}"><i class="fas fa-pen" style="font-size: 11px"></i> Cập nhật</a>
                            <a style="padding: 5px 10px;border: 1px solid #eee;font-size: 12px" href="{{route('admin.get.action.article',['delete',$article->id])}}"><i class="fas fa-trash-alt" style="font-size: 11px"></i>Xóa</a>
                        </td>
                    </tr>
                @endforeach
            @endif
            </tbody>
        </table>
    </div>
@stop