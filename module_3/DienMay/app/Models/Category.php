<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Category extends Model
{
    protected $table   ='loaisanpham';
    protected $guarded =['*'];

    const STATUS_PUBLIC = 1;
    const STATUS_PRIVATE = 0;

    const HOME = 1;

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
    protected $home = [
        1 => [
            'name' => 'Public',
            'class' => 'label-primary'
        ],
        0 => [
            'name' => 'Private',
            'class' => 'label-default'
        ]
    ];
    public function getStatus()
    {
        return array_get($this->status,$this->c_hienthi,'[N\A]');
    }

    public function getHome()
    {
        return array_get($this->home,$this->c_noibat,'[N\A]');
    }

    public function sanpham()
    {
        return $this->hasMany(Product::class,'pro_loaisanpham_id');
    }
}
