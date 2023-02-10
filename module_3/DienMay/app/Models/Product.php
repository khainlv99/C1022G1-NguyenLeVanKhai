<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Product extends Model
{
    protected $table   ='sanpham';
    protected $guarded =[''];

    const STATUS_PUBLIC = 1;
    const STATUS_PRIVATE = 0;

    const HOT_ON=1;
    const HOT_OFF=0;
    protected $status = [
        1 => [
            'name' => 'Public',
            'class' => 'label-danger'
        ],
        0 => [
            'name' => 'Private',
            'class' => 'label-default'
        ]
    ];
    protected $hot = [
        1 => [
            'name' => 'Nổi bật',
            'class' => 'label-success'
        ],
        0 => [
            'name' => 'Không',
            'class' => 'label-default'
        ]
    ];
    public function getStatus()
    {
        return array_get($this->status,$this->pro_hoatdong,'[N\A]');
    }

    public function getHot()
    {
        return array_get($this->hot,$this->pro_sphot,'[N\A]');
    }

    public function category()
    {
        return $this->belongsTo(Category::class,'pro_loaisanpham_id');
    }
}
