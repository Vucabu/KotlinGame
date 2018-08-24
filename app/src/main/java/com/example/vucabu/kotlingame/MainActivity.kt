package com.example.vucabu.kotlingame

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {

    private var mContentView: ViewGroup? = null
    private lateinit var mBaloon: Baloon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContentView = findViewById(R.id.activity_main)
        mContentView?.setOnTouchListener { view, motion ->
            if (motion.action == MotionEvent.ACTION_UP) {
                mBaloon = Baloon(this.applicationContext, Color.GREEN, 300)
                mBaloon.x = motion.x
                mBaloon.y = motion.y
                mContentView?.addView(mBaloon)
                true
            }
            false
        }
    }

    private fun setToFullScreen() {
        val rootView: ViewGroup = findViewById(R.id.activity_main)
        rootView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LOW_PROFILE
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
    }

    override fun onResume() {
        super.onResume()
        setToFullScreen()
    }
}
