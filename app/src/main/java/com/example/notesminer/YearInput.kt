package com.example.notesminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notesminer.databinding.ActivityYearInputBinding


class YearInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityYearInputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button: Button = binding.button2
        button.setOnClickListener {
            var sem = binding.yearinput.text.toString()
            when (sem) {
                "1" -> {
                    val i = Intent(this, BtechOne::class.java)
                    startActivity(i)
                }
                "2" -> {
                    val i = Intent(this, BtechTwo::class.java)
                    startActivity(i)
                }
                "3" -> {
                    val i = Intent(this, BtechThree::class.java)
                    startActivity(i)
                }
                "4" -> {
                    val i = Intent(this, BtechFour::class.java)
                    startActivity(i)
                }
                else -> {
                    val i = Intent(this, ComingSoon::class.java)
                    startActivity(i)
                }

            }
        }
    }

}