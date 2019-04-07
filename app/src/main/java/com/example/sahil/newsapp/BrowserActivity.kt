package com.example.sahil.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_browser.*

class BrowserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        var url = intent.getStringExtra("url")
        wview.loadUrl(url)
        wview.webViewClient = WebViewClient()
        wview.settings.builtInZoomControls = true
        wview.settings.javaScriptEnabled = true
    }
}
