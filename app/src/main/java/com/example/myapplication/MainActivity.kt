package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = ArrayList<Int>()
        list.add(1)
        list.add(2)
        var list2 :List<Int> = list
        var list3:MutableList<Int> = ArrayList<Int>()
        list3 = list2.toMutableList()
        list3.clear()
        list.add(3)
        var list4 = ArrayList(list2)
        list4.add(4)
        list4.clear()

        Log.d("xhkdebug","list.size:"+list.size+"---list1.size:"+list2.size+"---list3.size:"+list3.size+"---list4.size:"+list4.size)

    }
}
