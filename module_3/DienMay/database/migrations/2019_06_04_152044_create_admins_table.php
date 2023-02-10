<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatequantrivienTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('quantrivien', function (Blueprint $table) {
            $table->increments('id');
            $table->string('tenAdmin');
            $table->string('email')->unique();
            $table->char('sodienthoai')->nullable();
            $table->string('hinhdaidien')->nullable();
            $table->tinyInteger('hoatdong')->default(1)->index();
            $table->string('password');
            $table->rememberToken();
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
        Schema::dropIfExists('quantrivien');
    }
}
