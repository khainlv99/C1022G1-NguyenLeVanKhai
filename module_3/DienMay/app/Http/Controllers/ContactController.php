<?php

namespace App\Http\Controllers;

use App\Models\Contact;
use Carbon\Carbon;
use Illuminate\Http\Request;

class ContactController extends Controller
{
    public function getContact()
    {
        return view('contact');
    }

    public function saveContact(Request $request)
    {
//        dd($request->all());
        $data = $request->except('_token');
        $data['ngaytao'] = $data['ngaycapnhap'] = Carbon::now();

        Contact::insert($data);

        return redirect()->back()->with('success','Gửi liên hệ thành công');
    }
}
