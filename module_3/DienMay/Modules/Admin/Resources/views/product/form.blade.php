<form action="" method="post" enctype="multipart/form-data">
    @csrf
    <div class="row">
        <div class="col-sm-8">
            <div class="form-group">
                <label for="pro_tensp">Tên sản phẩm</label>
                <input type="text" class="form-control" placeholder="Tên sản phẩm" value="{{old('pro_tensp',isset($product->pro_tensp) ? $product->pro_tensp : '')}}" name="pro_tensp">
                @if($errors->has('pro_tensp'))
                    <span class="error-text">
                    {{$errors->first('pro_tensp')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Mô tả</label>
                <textarea name="pro_mota" class="form-control" id="" cols="30" rows="3" placeholder="Mô tả sản phẩm">{{old('pro_mota',isset($product->pro_mota) ? $product->pro_mota : '')}}</textarea>
                @if($errors->has('pro_mota'))
                    <span class="error-text">
                    {{$errors->first('pro_mota')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Nội dung</label>
                <textarea name="pro_noidungsp" class="form-control" id="pro_noidungsp" cols="30" rows="3" placeholder="Nội dung ">{{old('pro_noidungsp',isset($product->pro_noidungsp) ? $product->pro_noidungsp : '')}}</textarea>
                @if($errors->has('pro_noidungsp'))
                    <span class="error-text">
                    {{$errors->first('pro_noidungsp')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Title</label>
                <input type="text" class="form-control" placeholder="Meta title" value="{{old('pro_tieude',isset($product->pro_tieude) ? $product->pro_tieude : '')}}" name="pro_tieude">
            </div>
            <div class="form-group">
                <label for="name">Description</label>
                <input type="text" class="form-control" placeholder="Meta Description" value="{{old('pro_mota_seo',isset($product->pro_mota_seo) ? $product->pro_mota_seo : '')}}" name="pro_mota_seo">
            </div>
        </div>
        <div class="col-sm-4">
            <div class="form-group">
                <label for="name">Loại sản phẩm</label>
                <select name="pro_loaisanpham_id" id="" class="form-control" >
                    <option value="">--Chọn loại sản phẩm--</option>
                @if(isset($loaisanpham))
                    @foreach($loaisanpham as $category)
                        <option value="{{$category->id}}" {{old('pro_loaisanpham_id',
                        isset($product->pro_loaisanpham_id) ? $product->pro_loaisanpham_id : '')==$category->id ?
                         "selected ='selected'" : ""}}>{{$category->c_ten}}</option>
                    @endforeach
                @endif
                </select>
                @if($errors->has('pro_loaisanpham_id'))
                    <span class="error-text">
                    {{$errors->first('pro_loaisanpham_id')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="pro_dongia">Giá sản phẩm</label>
                <input type="number" class="form-control" placeholder="giá sản phẩm" name="pro_dongia" value="{{old('pro_dongia',isset($product->pro_dongia) ? $product->pro_dongia : '')}}" >
                @if($errors->has('pro_dongia'))
                    <span class="error-text">
                    {{$errors->first('pro_dongia')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">% Khuyến mãi</label>
                <input type="number" class="form-control" placeholder="% khuyến mãi" name="pro_giamgia" value="{{old('pro_giamgia',isset($product->pro_giamgia) ? $product->pro_giamgia : '0')}}">
                @if($errors->has('pro_giamgia'))
                    <span class="error-text">
                    {{$errors->first('pro_giamgia')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Số lượng </label>
                <input type="number" class="form-control" placeholder="10" name="pro_soluong" value="{{old('pro_soluong',isset($product->pro_soluong) ? $product->pro_soluong : '0')}}">
            </div>
            <div class="form-group">
                <label for="name">avatar</label>
                <input type="file" name="avatar" class="form-control" >
            </div>
            <div class="form-group">
                <div class="checkbox">
                    <label><input type="checkbox"> Nổi bật</label>
                </div>
            </div>
        </div>
    </div>
    <button type="submit" class="btn btn-success">Lưu</button>
</form>

@section('script')
    <script src="{{asset('ckeditor/ckeditor.js')}}"></script>
    <script>
        CKEDITOR.replace('pro_noidungsp');
    </script>
@stop
