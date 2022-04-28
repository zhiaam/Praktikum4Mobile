package com.example.suprawithnavfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ini untuk membuat halaman fragment pertama
        supportFragmentManager.beginTransaction().replace(R.id.nav_container, FirstFragment()).commit()
    }
}