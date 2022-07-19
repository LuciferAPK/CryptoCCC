package com.example.cryptounderground.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.cryptounderground.ui.MainActivity
import com.example.cryptounderground.R
import com.example.cryptounderground.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        binding.layout.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.zoom))
        timeDelay()
    }

    private fun timeDelay() {
        Handler().postDelayed({
            nextActivity()
        }, 1500)
    }

    private fun nextActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}