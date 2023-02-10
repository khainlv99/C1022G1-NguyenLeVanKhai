<?php

namespace App\Http\Controllers;

use App\Models\Article;
use Illuminate\Http\Request;

class ArticleController extends FrontendController
{
    public function __construct()
    {
        parent::__construct();
    }

    public function getListArticle()
    {
        $baiviet = Article::simplePaginate(5 );

        return view('article.index',compact('baiviet'));
    }

    public function getDetailArticle(Request $request)
    {
        $arrayUrl = (preg_split("/(-)/i",$request->segment(2)));

        $id = array_pop($arrayUrl);

        if ($id)
        {
            $articleDetail = Article::find($id);
            $baiviet = Article::paginate(10);

            $viewData = [
              'baiviet' => $baiviet,
              'articleDetail'=>$articleDetail
            ];

            return view('article.detail',$viewData);
        }
        return redirect('/');
    }
}
