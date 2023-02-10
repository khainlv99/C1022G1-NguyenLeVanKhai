<?php

namespace Modules\Admin\Http\Controllers;

use App\Http\Requests\RequestArticle;
use App\Models\Article;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Routing\Controller;

class AdminArticleController extends Controller
{
    /**
     * Display a listing of the resource.
     * @return Response
     */
    public function index(Request $request)
    {
        $baiviet = Article::whereRaw(1);
        if($request->name) $baiviet->where('a_tenbaiviet','like','%'.$request->name.'%');

        $baiviet = $baiviet->paginate(10);

        $viewData = [
            'baiviet'=>$baiviet
        ];
        return view('admin::article.index',$viewData);
    }

    /**
     * Show the form for creating a new resource.
     * @return Response
     */
    public function create()
    {
        return view('admin::article.create');
    }

    public function store(RequestArticle $requestArticle)
    {
//        dd($requestArticle->all());
        $this -> insertOrUpdate($requestArticle);
        return redirect()->back();
    }

    public function edit($id)
    {
        $article = Article::find($id);
        return view('admin::article.create',compact('article'));
    }
    public function update(RequestArticle $requestArticle,$id)
    {
        $this -> insertOrUpdate($requestArticle,$id);
        return redirect()->back();
    }

    public function insertOrUpdate( $requestArticle,$id='')
    {
        $article =new Article();

        if ($id) $article = Article::find($id);

        $article->a_tenbaiviet = $requestArticle->a_tenbaiviet;
        $article->a_slug = str_slug($requestArticle->a_tenbaiviet);
        $article->a_motabaiviet = $requestArticle->a_motabaiviet;
        $article->a_noidungbaiviet =$requestArticle->a_noidungbaiviet;
        $article->a_tieude_seo = $requestArticle->a_tieude_seo ? $requestArticle->a_tieude_seo : $requestArticle->a_tenbaiviet;
        $article->a_motabaiviet_seo = $requestArticle->a_motabaiviet_seo ? $requestArticle->a_motabaiviet_seo : $requestArticle->a_motabaiviet_seo;

        if ($requestArticle->hasFile('avatar'))
        {
            $file = upload_image('avatar');
            if (isset($file['name']))
            {
                $article->a_hinhdaidien=$file['name'];
            }
        }

        $article->save();
    }

    public function action($action,$id)
    {
        if($action)
        {
            $article = Article::find($id);
            switch ($action)
            {
                case 'delete':
                    $article->delete();
                    break;
                case 'active':
                    $article->a_hoatdong = $article->a_hoatdong ? 0:1;
                    $article->save();
                    break;
            }
        }
        return redirect()->back();
    }
}
