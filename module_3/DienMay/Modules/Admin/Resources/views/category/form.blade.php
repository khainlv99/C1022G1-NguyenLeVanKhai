<form action="" method="post">
    @csrf
    <div class="form-group">
        <label for="name">Tên danh mục</label>
        <input type="text" class="form-control" placeholder="Tên danh mục" value="{{old('name',isset($category->c_ten) ? $category->c_ten : '')}}" name="name">
        @if($errors->has('name'))
            <span class="error-text">
                {{$errors->first('name')}}
            </span>
        @endif
    </div>
    <div class="form-group">
        <label for="icon">icon</label>
        <input type="text" class="form-control" placeholder="fa fa-home" value="{{old('icon',isset($category->c_bieutuong) ? $category->c_bieutuong : '')}}" name="icon">
        @if($errors->has('icon'))
            <span class="error-text">
                {{$errors->first('icon')}}
            </span>
        @endif
    </div>
    <div class="form-group">
        <label for="name">Meta Title</label>
        <input type="text" class="form-control" placeholder="Meta title" value="{{old('c_tieudesp',isset($category->c_tieudesp) ? $category->c_tieudesp : '')}}" name="c_tieudesp">
    </div>
    <div class="form-group">
        <label for="name">Description</label>
        <input type="text" class="form-control" placeholder="Meta Description" value="{{old('c_mota_seo',isset($category->c_mota_seo) ? $category->c_mota_seo : '')}}" name="c_mota_seo">
    </div>
    <div class="form-group">
        <div class="checkbox">
            <label><input type="checkbox"> Nổi bật</label>
        </div>
    </div>
    <button type="submit" class="btn btn-success">Lưu</button>
</form>