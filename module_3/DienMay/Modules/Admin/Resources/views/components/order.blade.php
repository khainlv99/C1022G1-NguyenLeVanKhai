@if($chitietdonhang)
    <table class="table">
        <thead>
        <tr>
            <th>STT</th>
            <th>Tên sản phẩm</th>
            <th>Hình ảnh</th>
            <th>Giá </th>
            <th>Số lượng</th>
            <th>Thành tiền</th>
            <th>Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <?php $i = 1 ?>
        @foreach($chitietdonhang as $key => $order)
            <tr>
                <td>#{{ $i }}</td>
                <td><a href="{{route('get.detail.product',[str_slug($order->product->pro_tensp),$order->or_sanpham_id])}}" target="_blank">{{isset($order->product->pro_tensp) ? $order->product->pro_tensp : ''}}</a></td>
                <td><img style="width: 80px;height: 60px" src="{{isset($order->product->pro_hinhdaidien) ? pare_url_file($order->product->pro_hinhdaidien) : ''}}" alt=""></td>
                <td>{{number_format($order->or_giatien,0,',','.')}} đ</td>
                <td>{{$order->or_soluong}}</td>
                <td>{{number_format($order->or_giatien * $order->or_soluong,0,',','.')}} đ</td>
                <td>
                    <a href=""><i class="fa fa-trash-o"></i> Xoa</a>
                </td>
            </tr>
            <?php $i++ ?>
        @endforeach

        </tbody>
    </table>
@endif