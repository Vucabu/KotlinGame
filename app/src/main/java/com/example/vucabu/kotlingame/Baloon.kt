package com.example.vucabu.kotlingame

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Context
import android.view.animation.LinearInterpolator

class Baloon : android.support.v7.widget.AppCompatImageView, ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    private lateinit var mAnimator: ValueAnimator

    constructor(context: Context) : super(context)

    constructor(context: Context, color: Int, height: Int) : super(context) {

        this.setImageResource(R.drawable.figure_1)
        this.setColorFilter(color)

        val rawWidth = height / 2
    }

    fun releaseBaloon(screenHeight: Float, duration: Long) {
        mAnimator = ValueAnimator()
        mAnimator.duration = duration
        mAnimator.setFloatValues(screenHeight, 0f)
        mAnimator.interpolator = LinearInterpolator()
        mAnimator.setTarget(this)
        mAnimator.addListener(this)
        mAnimator.addUpdateListener(this)
        mAnimator.start()
    }

    override fun onAnimationEnd(p0: Animator?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAnimationStart(p0: Animator?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAnimationRepeat(p0: Animator?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAnimationCancel(p0: Animator?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAnimationUpdate(p0: ValueAnimator?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
