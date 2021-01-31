package com.example.saanimationproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var anim : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewAnimation.visibility = View.GONE

        anim = AnimationUtils.loadAnimation(this,R.anim.myfadeanim_1)

        buttonAnim.setOnClickListener {
            imageViewAnimation.visibility = View.VISIBLE
            imageViewAnimation.startAnimation(anim)
        }

    }
}