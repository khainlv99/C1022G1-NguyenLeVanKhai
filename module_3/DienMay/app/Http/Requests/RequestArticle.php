<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class RequestArticle extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     *
     * @return bool
     */
    public function authorize()
    {
        return true;
    }

    public function rules()
{
    return [
        'a_tenbaiviet' => 'required|unique:baiviet,a_tenbaiviet,'.$this->id,
        'a_motabaiviet' => 'required',
        'a_noidungbaiviet'=>'required',

    ];
}

    public function messages()
    {
        return [
            'a_tenbaiviet.required'=>'Vui lòng nhập đầy đủ',
            'a_tenbaiviet.unique'=>'Tên bài viết đã tồn tại',
            'a_motabaiviet.required'=>'Vui lòng nhập đầy đủ',
            'a_noidungbaiviet.required'=>'Vui lòng nhập đầy đủ',
        ];
    }
}
