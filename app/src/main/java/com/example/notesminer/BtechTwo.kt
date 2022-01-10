package com.example.notesminer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notesminer.databinding.ActivityBtechTwoBinding
import com.example.notesminer.databinding.ActivityMainBinding

class BtechTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBtechTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val uri = "https://t.me/cgu_2nd_year_cse_2020"

        fun gotosite(){
            val uriUrl: Uri = Uri.parse(uri)
            val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
            startActivity(launchBrowser)
        }
        val button: Button = binding.button16
        button.setOnClickListener {
            gotosite()
        }
        val button1: Button = binding.button17
        button1.setOnClickListener {
            gotosite()
        }
        val button2: Button = binding.button18
        button2.setOnClickListener {
            gotosite()
        }
        val button3: Button = binding.button19
        button3.setOnClickListener {
            gotosite()
        }
        val button4: Button = binding.button20
        button4.setOnClickListener {
            gotosite()
        }
        val button5: Button = binding.button21
        button5.setOnClickListener {
            gotosite()
        }


    }
}