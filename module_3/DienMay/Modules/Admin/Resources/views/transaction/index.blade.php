@extends('admin::layouts.master')

@section('content')
    <div class="page-header">
        <ol class="breadcrumb">
            <li><a href="#">Trang chủ</a></li>
            <li><a href="#">Đơn hàng</a></li>
            <li class="active">Danh sách</li>
        </ol>
    </div>
    <div class="table-responsive">
        <h2>Quản lí đơn hàng </h2>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th style="width: 100px;">Tên khách hàng </th>
                <th style="width: 200px;">Địa chỉ </th>
                <th >Số điện thoại </th>
                <th>Tổng tiền</th>
                <th style="width: 150px;">Ghi chú</th>
                <th>Trạng thái</th>
                <th>Time</th>
                <th>Thao tác</th>
            </tr>
            </thead>
            <tbody>
                @foreach($donhang as $transaction)
                    <tr>
                        <td>#{{$transaction -> id}}</td>
                        <td>{{isset($transaction->user->name) ? $transaction->user->name : '[N\A]'}}</td>
                        <td>{{$transaction->tr_diachi}}</td>
                        <td>{{$transaction->tr_sodienthoai}}</td>
                        <td>{{number_format($transaction->tr_tongtien,0,',','.') }}VNĐ</td>
                        <td>{{$transaction->tr_ghichu}}</td>
                        <td>
                            @if($transaction->str_trangthaidonhang == 1)
                                <a href="#" class="label label-success">Đã xử lí</a>
                            @else
                                <a href="{{route('admin.get.active.transaction',$transaction->id)}}" onclick="myFunction()" class="label label-default">Chưa xử lí</a>
                            @endif
                        </td>
                        <td>
                            {{$transaction->ngaytao->format('d-m-Y')}}
                        </td>
                        <td>
                            <a style="padding: 5px 10px;border: 1px solid #eee;font-size: 12px" id="myBtn" onclick="return confirm('Bạn có chắc muốn xóa không !')" href="{{route('admin.get.delete.transaction',['delete',$transaction->id])}}"><i class="fas fa-trash-alt" style="font-size: 11px"></i>Hủy</a>
                            <a style="padding: 5px 10px;border: 1px solid #eee;font-size: 12px" class="js_order_item" data-id="{{$transaction->id}}" href="{{route('admin.get.view.order',$transaction->id)}}"><i class="fas fa-eye" style="font-size: 11px"></i></a>
                        </td>
                    </tr>

                @endforeach
            </tbody>
        </table>
        {{$donhang->links()}}
    </div>

    <div class="modal fade" id="myModalOrder" role="dialog">
        <div class="modal-dialog modal-lg">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Chi tiết mã đơn hàng #<b class="transaction_id"></b></h4>
                </div>
                <div class="modal-body" id="md_content">

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Đóng</button>
                </div>
            </div>

        </div>
    </div>
@stop

@section('script')
    <script>
        $(function(){
            $(".js_order_item").click(function (event) {
                event.preventDefault();
                let $this =$(this);
                let url = $this.attr('href');
                $("#md_content").html('')
                $(".transaction_id").text('').text($this.attr('data-id'));

                $("#myModalOrder").modal('show');

                $.ajax({
                    url: url,
                }).done(function (result) {
                    if(result)
                    {
                        $("#md_content").append(result);
                    }
                });
            });
        });
        function myFunction() {
            document.getElementById("myBtn").disabled = true;
        }
    </script>
@stop