<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class AlterColumnProPayInTableProducts extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::table('sanpham',function (Blueprint $table){
            $table->tinyInteger('pro_spdaban')->default(0);
            $table->tinyInteger('pro_soluong')->default(0);
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
            $table->dropColumn('pro_spdaban');
            $table->dropColumn('pro_soluong');
        });
    }
}
