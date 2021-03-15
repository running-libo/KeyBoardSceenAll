package com.example.keyboarduseall

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sceen_two.*
import java.util.*

class SceenTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sceen_two)

        showSoftInput(this, etSearch)
    }

    private fun showSoftInput(context: Context, et: EditText) {
        Timer().schedule(object : TimerTask() {
            override fun run() {
                (context as Activity).runOnUiThread {
                    et.isFocusable = true
                    et.isFocusableInTouchMode = true
                    //请求获得焦点
                    et.requestFocus()
                    //调用系统输入法
                    val inputManager: InputMethodManager = et
                        .context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    inputManager.showSoftInput(et, 0)
                }
            }
        }, 100)
    }
}