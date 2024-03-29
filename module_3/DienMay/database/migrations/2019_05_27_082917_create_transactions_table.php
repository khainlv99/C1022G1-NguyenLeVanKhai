<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatedonhangTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('donhang', function (Blueprint $table) {
            $table->increments('id');
            $table->integer('tr_khachhang_id')->index()->default(0);
            $table->integer('tr_tongtien')->default(0);
            $table->string('tr_ghichu')->nullable();
            $table->string('tr_diachi')->nullable();
            $table->string('tr_sodienthoai')->nullable();
            $table->tinyInteger('str_trangthaidonhang')->default(0)->index();
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
        Schema::dropIfExists('donhang');
    }
}
