package com.example.premierleaguefixtures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scrn1 = screen1()
        val scrn2 = screen2()




        findViewById<Button>(R.id.tosreeen1).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentShow,scrn1)
                commit()
            }
        }

        findViewById<Button>(R.id.toscreen2).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentShow,scrn2)
                commit()
            }
        }

    }
}