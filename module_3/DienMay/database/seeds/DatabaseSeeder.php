<?php

use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        // $this->call(UsersTableSeeder::class);
        \DB::table('quantrivien')->insert([
            'name' => 'MinhCuongQN',
            'email' => 'lanhsoivn@gmail.com',
            'password'=>bcrypt('123456789')
        ]);
    }
}
