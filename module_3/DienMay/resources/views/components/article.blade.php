@if(isset($baiviet))
    @foreach($baiviet as $article)
        <div class="article" style="display: flex;padding-bottom:10px;margin-bottom: 10px;border-bottom: 1px solid #f2f2f2">
            <div class="article_avatar" >
                <a href="{{route('get.detail.article',[$article->a_slug,$article->id])}}">
                    <img src="{{pare_url_file($article->a_hinhdaidien)}}" style="width: 200px;height: 120px" alt="">
                </a>
            </div>
            <div class="article_info" style="width: 80%;margin-left: 20px;">
                <h2 style="font-size: 15px"><a href="{{route('get.detail.article',[$article->a_slug,$article->id])}}">{{$article->a_tenbaiviet}}</a></h2>
                <p style="font-size: 13px;">{{$article->a_motabaiviet}}</p>
                <p>NguyenMinhCuong <span>{{$article->ngaytao}}</span></p>
            </div>
        </div>
    @endforeach
    {!! $baiviet->links() !!}
@endif