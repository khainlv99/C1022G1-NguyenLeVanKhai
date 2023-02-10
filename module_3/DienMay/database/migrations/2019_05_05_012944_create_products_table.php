<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateProductsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('sanpham', function (Blueprint $table) {
            $table->increments('id');
            $table->string('pro_tensp')->nullable();
            $table->integer('pro_nguoitao_id')->default(0)->index();
            $table->string('pro_slug')->index();
            $table->integer('pro_loaisanpham_id')->index()->default(0);
            $table->integer('pro_dongia')->default(0);
            $table->integer('pro_giamgia')->default(0);
            $table->tinyInteger('pro_hoatdong')->default(1)->index();
            $table->tinyInteger('pro_sphot')->default(0);
            $table->string('pro_mota')->nullable();
            $table->string('pro_hinhdaidien')->nullable();
            $table->string('pro_mota_seo')->nullable();
            $table->string('pro_tukhoa')->nullable();
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('sanpham');
    }
}
