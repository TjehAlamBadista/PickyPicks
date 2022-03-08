package com.example.pickypicks.activity.youtube.reactions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pickypicks.R

class ReactActivity3 : AppCompatActivity() {

    private lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_react3)

        btn_next = findViewById(R.id.btn_next)

        btn_next.setOnClickListener {
            val intent = Intent(this@ReactActivity3, ReactActivity4::class.java)
            startActivity(intent)
        }
    }
}