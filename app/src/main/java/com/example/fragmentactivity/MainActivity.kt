package com.example.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //how to add a fragment dynamically(at run time)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragContainer2, ColorSelectFragment())
            .commit()
    }
}