<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class AlterColumnCHomeInTableloaisanpham extends Migration
{
    public function up()
    {
        Schema::table('loaisanpham',function (Blueprint $table){
            $table->tinyInteger('c_noibat')->default(0)->index();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::table('loaisanpham',function (Blueprint $table){
            $table->dropColumn('c_noibat');
        });
    }
}
