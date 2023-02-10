<form action="" method="post" enctype="multipart/form-data">
    @csrf
    <div class="row">
        <div class="col-sm-8">
            <div class="form-group">
                <label for="a_tenbaiviet">Tên bài viết</label>
                <input type="text" class="form-control" placeholder="Tên bài viết" value="{{old('a_tenbaiviet',isset($article->a_tenbaiviet) ? $article->a_tenbaiviet : '')}}" name="a_tenbaiviet">
                @if($errors->has('a_tenbaiviet'))
                    <span class="error-text">
                    {{$errors->first('a_tenbaiviet')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Mô tả</label>
                <textarea name="a_motabaiviet" class="form-control" id="" cols="30" rows="3" placeholder="Mô tả bài viết" >{{old('a_motabaiviet',isset($article->a_motabaiviet) ? $article->a_motabaiviet : '')}}</textarea>
                @if($errors->has('a_motabaiviet'))
                    <span class="error-text">
                    {{$errors->first('a_motabaiviet')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Nội dung</label>
                <textarea name="a_noidungbaiviet" class="form-control" id="a_noidungbaiviet" cols="30" rows="3" placeholder="Nội dung " >{{old('a_noidungbaiviet',isset($article->a_noidungbaiviet) ? $article->a_noidungbaiviet : '')}}</textarea>
                @if($errors->has('a_noidungbaiviet'))
                    <span class="error-text">
                    {{$errors->first('a_noidungbaiviet')}}
                    </span>
                @endif
            </div>
            <div class="form-group">
                <label for="name">Title</label>
                <input type="text" class="form-control" placeholder="Meta title" value="{{old('a_tieude_seo',isset($article->a_tieude_seo) ? $article->a_tieude_seo : '')}}" name="a_tieude_seo">
            </div>
            <div class="form-group">
                <label for="name">Description</label>
                <input type="text" class="form-control" placeholder="Meta Description" value="{{old('a_motabaiviet_seo',isset($article->a_motabaiviet_seo) ? $article->a_motabaiviet_seo : '')}}" name="a_motabaiviet_seo">
            </div>
            <div class="form-group">
                <label for="name">avatar</label>
                <input type="file" name="avatar" class="form-control">
            </div>
        </div>
    </div>
    <button type="submit" class="btn btn-success">Lưu</button>
</form>

@section('script')
    <script src="{{asset('ckeditor/ckeditor.js')}}"></script>
    <script>
        CKEDITOR.replace('a_noidungbaiviet');
    </script>
@stop