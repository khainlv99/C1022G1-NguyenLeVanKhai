<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class AlterColumnRatingInTableProducts extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::table('sanpham',function (Blueprint $table){
            $table->integer('pro_tongdanhgia')->default(0)->comment('tong so danh gia');
            $table->integer('pro_tongsodiemdanhgia')->default(0)->comment('tong so diem danh gia');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::table('sanpham',function (Blueprint $table){
            $table->dropColumn('pro_tongdanhgia');
            $table->dropColumn('pro_tongsodiemdanhgia');
        });
    }
}
