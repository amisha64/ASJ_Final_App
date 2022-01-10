package com.example.notesminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import com.example.notesminer.databinding.ActivityNoticeViewBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NoticeView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNoticeViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Find the WebView by its unique ID
        val w = binding.noticeweb as WebView

        w.loadUrl("https://cgu-odisha.ac.in/notice-board/")

        // this will enable the javascript.

        // this will enable the javascript.
        w.settings.javaScriptEnabled = true

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        w.webViewClient = WebViewClient()

        val button: FloatingActionButton = binding.floatingActionButton
        button.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}