package com.app.webviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val web: WebView = findViewById(R.id.webview)
        web.loadUrl("https://levinagroup.com/")
        web.setWebViewClient(WebViewClient())
    }
}