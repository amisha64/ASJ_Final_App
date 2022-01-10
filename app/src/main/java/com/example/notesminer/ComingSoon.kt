package com.example.notesminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notesminer.databinding.ActivityComingSoonBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ComingSoon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityComingSoonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: FloatingActionButton = binding.floatingActionButton2
        button.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}