<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class RequestCategory extends FormRequest
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

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array
     */
    public function rules()
    {
        return [
            'name' => 'required|unique:loaisanpham,c_ten,'.$this->id,
            'icon' => 'required'
        ];
    }

    public function messages()
    {
        return [
            'name.required'=>'Vui lòng nhập đầy đủ',
            'name.unique'=>'Tên danh mục đã tồn tại',
            'icon.required'=>'Vui lòng nhập đầy đủ'
        ];
    }
}
