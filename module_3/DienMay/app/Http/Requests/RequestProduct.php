<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class RequestProduct extends FormRequest
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
            'pro_tensp' => 'required|unique:sanpham,pro_tensp,'.$this->id,
            'pro_mota' => 'required',
            'pro_loaisanpham_id'=>'required',
            'pro_dongia'=>'required',
            'pro_noidungsp'=>'required',
        ];
    }

    public function messages()
    {
        return [
            'pro_tensp.required'=>'Vui lòng nhập đầy đủ',
            'pro_tensp.unique'=>'Tên sản phẩm đã tồn tại',
            'pro_mota.required'=>'Vui lòng nhập đầy đủ',
            'pro_loaisanpham_id.required'=>'Vui lòng nhập đầy đủ',
            'pro_dongia.required'=>'Vui lòng nhập đầy đủ',
            'pro_noidungsp.required'=>'Vui lòng nhập đầy đủ',
        ];
    }
}
