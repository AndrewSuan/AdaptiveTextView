package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    companion object{
        var textViewHeight = 300
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textView = findViewById<TextView>(R.id.series_variety_title_tv)
        val lp = textView.layoutParams
        lp.height = textViewHeight
        textView.layoutParams = lp
        findViewById<Button>(R.id.reduce_textview_height_bt).setOnClickListener{

            lp.height = lp.height - 5
            textViewHeight = lp.height
            textView.layoutParams = lp
        }

    }
}
