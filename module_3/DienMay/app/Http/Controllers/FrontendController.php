<?php

namespace App\Http\Controllers;

use App\Models\Category;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\View;

class FrontendController extends Controller
{
    public function __construct()
    {
        $loaisanpham = Category::all();
        View::share('loaisanpham', $loaisanpham);
    }
}
