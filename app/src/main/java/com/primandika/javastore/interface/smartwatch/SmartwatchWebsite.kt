package com.primandika.javastore.`interface`.smartwatch

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.primandika.javastore.R
import kotlinx.android.synthetic.main.smartphone_website.*

class SmartwatchWebsite : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.smartwatch_website)
        val webView = findViewById<WebView>(R.id.SmartwatchWebsite)
        actionBar?.setDisplayHomeAsUpEnabled(false)
        var intentThatStartedThisActivity = intent

        if(intentThatStartedThisActivity.hasExtra(Intent.ACTION_WEB_SEARCH)) {
            var SmartwatchWebsite = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_WEB_SEARCH)
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = object  : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    if (view != null) {
                        view.loadUrl("javascript:alert('')")
                    }
                }
            }

            webView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(
                        view: WebView?,
                        url: String?,
                        message: String?,
                        result: JsResult?
                ): Boolean {
                    Toast.makeText(this@SmartwatchWebsite, "Silahkan Membeli", Toast.LENGTH_LONG).show()
                    if (result != null) {
                        result.confirm() }
                    return true
                }
            }

            webView.loadUrl(SmartwatchWebsite.toString())
        } else {
        }
    }
}