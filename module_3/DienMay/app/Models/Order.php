<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Order extends Model
{
   protected $table = 'chitietdonhang';
   protected $guarded = ['*'];

   public function product()
   {
       return $this->belongsTo(Product::class,'or_sanpham_id');
   }
}
