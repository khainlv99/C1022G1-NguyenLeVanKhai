<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateloaisanphamTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('loaisanpham', function (Blueprint $table) {
            $table->increments('id');
            $table->string('c_ten')->unique();
            $table->string('c_slug')->index();
            $table->char('c_bieutuong')->nullable();
            $table->string('c_avatar')->nullable();
            $table->tinyInteger('c_hienthi')->default(1)->index();
            $table->integer('c_tongsosp')->default(0);
            $table->string('c_tieudesp')->nullable();
            $table->string('c_mota_seo')->nullable();
            $table->string('c_tukhoa')->nullable();
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
        Schema::dropIfExists('loaisanpham');
    }
}
