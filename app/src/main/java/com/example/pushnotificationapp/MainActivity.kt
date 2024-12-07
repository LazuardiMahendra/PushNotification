package com.example.pushnotificationapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btn_crash)

        val crashButton = Button(this)

        button.setOnClickListener {
            Toast.makeText(
                this, "Crash is Done", Toast.LENGTH_SHORT
            ).show()
        }
    }
}