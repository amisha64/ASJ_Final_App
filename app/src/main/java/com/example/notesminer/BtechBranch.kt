package com.example.notesminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notesminer.databinding.ActivityBtechBranchBinding

class BtechBranch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBtechBranchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = binding.button6
        button.setOnClickListener {
            val i = Intent(this, YearInput::class.java)
            startActivity(i)
        }

        fun comingSoon(){
            val i = Intent(this, ComingSoon::class.java)
            startActivity(i)
        }
        val button1: Button = binding.button5
        button1.setOnClickListener {
            comingSoon()
        }
        val button2: Button = binding.button4
        button2.setOnClickListener {
            comingSoon()
        }
        val button3: Button = binding.button7
        button3.setOnClickListener {
            comingSoon()
        }
        val button4: Button = binding.button8
        button4.setOnClickListener {
            comingSoon()
        }
        val button5: Button = binding.button9
        button5.setOnClickListener {
            comingSoon()
        }
        val button6: Button = binding.button10
        button6.setOnClickListener {
            comingSoon()
        }
    }
}