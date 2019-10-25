package com.bd.projectbd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler

class MainActivity : AppCompatActivity() {
    var count = 0
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer.start()
    }

    val timer = object: CountDownTimer(3000, 1000) {
        override fun onTick(millisUntilFinished: Long) {}

        override fun onFinish() {
            val intent = Intent("android.intent.action.main_act")
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.appear, R.anim.disappear)
        }
    }

}
