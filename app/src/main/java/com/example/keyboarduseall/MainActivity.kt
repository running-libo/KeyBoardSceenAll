package com.example.keyboarduseall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSceenOne.setOnClickListener {
            var intent = Intent()
            intent.setClass(this, SceenOneActivity::class.java)
            startActivity(intent)
        }

        tvSceenTwo.setOnClickListener {
            var intent = Intent()
            intent.setClass(this, SceenTwoActivity::class.java)
            startActivity(intent)
        }

        tvSearch.setOnClickListener {
            var intent = Intent()
            intent.setClass(this, SearchActionActivity::class.java)
            startActivity(intent)
        }

        tvScroll.setOnClickListener {
            var intent = Intent()
            intent.setClass(this, ScrollActivity::class.java)
            startActivity(intent)
        }
    }
}