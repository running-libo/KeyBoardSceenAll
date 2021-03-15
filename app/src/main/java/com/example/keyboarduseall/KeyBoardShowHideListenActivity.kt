package com.example.keyboarduseall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class KeyBoardShowHideListenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboard_showhide_listen)

        SoftKeyBoardListener.setListener(this, object: SoftKeyBoardListener.OnSoftKeyBoardChangeListener {
            override fun keyBoardShow(height: Int) {
                Toast.makeText(applicationContext, "键盘打开", Toast.LENGTH_SHORT).show()
            }

            override fun keyBoardHide(height: Int) {
                Toast.makeText(applicationContext, "键盘关闭", Toast.LENGTH_SHORT).show()
            }

        })
    }
}