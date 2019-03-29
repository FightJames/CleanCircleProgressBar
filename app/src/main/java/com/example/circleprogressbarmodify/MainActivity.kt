package com.example.circleprogressbarmodify

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set bars colors

        pbar.setNumberOfBars(1);
//        intArrayOf(resources.getColor(R.color.bar1Color))

        pbar.setBarsColors(intArrayOf(ContextCompat.getColor(this, android.R.color.holo_green_dark)))
        pbar.setProgressWithAnimation(50f);
//        pbar.startAngle



    }
}
