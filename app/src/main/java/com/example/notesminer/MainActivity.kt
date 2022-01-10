package com.example.notesminer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View
import com.example.notesminer.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = binding.button
        button.setOnClickListener {
            val i = Intent(this, NoticeView::class.java)
            startActivity(i)
        }

        val btech: Button = binding.chip1
        btech.setOnClickListener {
            val i = Intent(this, BtechBranch::class.java)
            startActivity(i)
        }

        val mtech: Button = binding.chip3
        mtech.setOnClickListener {
            val i = Intent(this, MtechBranch::class.java)
            startActivity(i)
        }

        val diploma: Button = binding.chip2
        diploma.setOnClickListener {
            val i = Intent(this, DiplomaBranch::class.java)
            startActivity(i)
        }

        val msc: Button = binding.chip4
        msc.setOnClickListener {
            val i = Intent(this, MScBranch::class.java)
            startActivity(i)
        }

        val mba: Button = binding.chip5
        mba.setOnClickListener {
            val i = Intent(this, MBASub::class.java)
            startActivity(i)
        }

        val phd: Button = binding.chip6
        phd.setOnClickListener {
            val i = Intent(this, PHDBranch::class.java)
            startActivity(i)
        }

    }


}
