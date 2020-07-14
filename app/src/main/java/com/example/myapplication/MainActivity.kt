package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textview:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById<TextView>(R.id.main_text)
        textview.setOnClickListener{
            var intent = Intent(this,Main2Activity::class.java)
            this.startActivity(intent)
        }
        val fontMetrics = textview.paint.getFontMetrics()
        Log.d("MainActivity","ascent:${fontMetrics.ascent}---top:${fontMetrics.top}----leading:${fontMetrics.leading}----descent:${fontMetrics.descent}----bottom:${fontMetrics.bottom}")
        var dm = DisplayMetrics()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            windowManager.defaultDisplay.getRealMetrics(dm)
        }
        Log.d("MainActivity","dm.density:"+dm.density)


        Log.d("MainActivity","textview.lineHeight:"+textview.lineHeight)

//        Log.d("MainActivity","textview.lineHeight:"+textview.lineHeight)
//        Log.d("MainActivity","maxLines:"+textview.maxLines)
//        Log.d("MainActivity","paddingtop:${textview.paddingTop}---paddingbottom:${textview.paddingBottom}")
//        var lp = textview.layoutParams
//        Log.d("MainActivity","lineSpacingExtra${textview.lineSpacingExtra}")
//
//        Log.d("MainActivity","textViewHeight${lp.height}")
//        Log.d("MainActivity","textSize${textview.textSize}")

    }



    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
//        Log.d("MainActivity","lineCount${textview.lineCount}")//需要初始化完毕才能正确，看现在textView有多少行
        var layout = textview.layout

        Log.d("MainActivity","layout.getLineDescent(0):${layout.getLineDescent(0)}---- layout.getLineAscent(0):${ layout.getLineAscent(0)}")
        Log.d("MainActivity","layout.getLineDescent(1):${layout.getLineDescent(1)}---- layout.getLineAscent(1):${ layout.getLineAscent(1)}")
        Log.d("MainActivity","layout.getLineDescent(2):${layout.getLineDescent(2)}---- layout.getLineAscent(2):${ layout.getLineAscent(2)}")
        Log.d("MainActivity","layout.getLineDescent(3):${layout.getLineDescent(3)}---- layout.getLineAscent(3):${ layout.getLineAscent(3)}")


        Log.d("MainActivity","layout.getLineBaseline(0):${layout.getLineBaseline(0)}")
        Log.d("MainActivity","layout.getLineBaseline(1):${layout.getLineBaseline(1)}")
        Log.d("MainActivity","layout.getLineBaseline(2):${layout.getLineBaseline(2)}")
        Log.d("MainActivity","layout.getLineBaseline(3):${layout.getLineBaseline(3)}")


        Log.d("MainActivity","layout.getLineTop(0):${layout.getLineTop(0)}---- layout.getLineBottom(0):${ layout.getLineBottom(0)}")
        Log.d("MainActivity","layout.getLineTop(1):${layout.getLineTop(1)}---- layout.getLineBottom(1):${ layout.getLineBottom(1)}")
        Log.d("MainActivity","layout.getLineTop(2):${layout.getLineTop(2)}---- layout.getLineBottom(2):${ layout.getLineBottom(2)}")
        Log.d("MainActivity","layout.getLineTop(3):${layout.getLineTop(3)}---- layout.getLineBottom(3):${ layout.getLineBottom(3)}")

        Log.d("MainActivity","textview.layout${textview.layout}")

        Log.d("MainActivity","textview.measuredHeight${textview.measuredHeight}")



//        val accent =  findViewById<View>(R.id.accentLine)
//        var lp1 = accent.layoutParams as RelativeLayout.LayoutParams
//        lp1.topMargin = layout.getLineBaseline(1)+layout.getLineAscent(1)
//        accent.layoutParams = lp1
//
//        val baseline =  findViewById<View>(R.id.baseLine)
//        var lp2 = baseline.layoutParams as RelativeLayout.LayoutParams
//        lp2.topMargin = layout.getLineBaseline(1)
//        baseline.layoutParams = lp2
//
//        val descent =  findViewById<View>(R.id.descentLine)
//        var lp3 = descent.layoutParams as RelativeLayout.LayoutParams
//        lp3.topMargin = layout.getLineBaseline(1)+layout.getLineDescent(1)
//        descent.layoutParams = lp3
    }
}
