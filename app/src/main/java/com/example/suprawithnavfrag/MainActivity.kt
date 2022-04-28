package com.example.suprawithnavfrag

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ini untuk membuat halaman fragment pertama
        supportFragmentManager.beginTransaction().replace(R.id.nav_container, FirstFragment()).commit()
    }

    fun setLocalLanguage(localcode: String){
        var locale: Locale = Locale(localcode)
        Locale.setDefault(locale)

        var config:Configuration = Configuration()
        config.locale = locale

        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)

        var intent : Intent = Intent(this,MainActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflator = menuInflater
        inflator.inflate(R.menu.main_menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when(item.itemId) {

        R.id.indoconvert->{
            setLocalLanguage("id")
            true
        }
        R.id.englishconvert->{
            setLocalLanguage("en")
            true
        } else->{
            super.onOptionsItemSelected(item)
        }
    }
}