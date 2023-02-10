<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatebaivietTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('baiviet', function (Blueprint $table) {
            $table->increments('id');
            $table->string('a_tenbaiviet')->nullable();
            $table->string('a_slug')->index();
            $table->string('a_motabaiviet')->nullable();
            $table->longText('a_noidungbaiviet')->nullable();
            $table->tinyInteger('a_hoatdong')->default(1)->index();
            $table->integer('a_nguoiviet_id')->default(0)->index();
            $table->string('a_motabaiviet_seo')->nullable();
            $table->string('a_tieude_seo')->nullable();
            $table->string('a_hinhdaidien')->nullable();
            $table->integer('a_luotxem')->default(0);
            $table->tinyInteger('a_noibat')->default(0);
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
        Schema::dropIfExists('baiviet');
    }
}
