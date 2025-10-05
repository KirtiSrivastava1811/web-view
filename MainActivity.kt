package com.example.webview

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private var Any.safeBrowserEnable: Boolean
private val MainActivity.settings: Any

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webViewVariable = findViewById<WebView>(R.id.webview)
        webViewSetup(webViewVariable)
    }

    private fun webViewSetup(webViewVariable: WebView) {}
    webView.webViewClient=WebViewClient()
    webView.apply{
        settings.javaScriptEnables=true
        settings.safeBrowserEnable=true
        loadUrl
    }
}