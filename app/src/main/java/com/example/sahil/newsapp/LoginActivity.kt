package com.example.sahil.newsapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

     var SPLASH_TIME_OUT:Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setSupportActionBar(tool1)
        supportActionBar!!.title = "News App"


        Handler().postDelayed(Runnable /*
              * Showing splash screen with a timer. This will be useful when you
              * want to show case your app logo / company
              */
        {
            val i = Intent(this@LoginActivity, NaviActivity::class.java)
            startActivity(i)

            finish()
        }, SPLASH_TIME_OUT)
    }
}
