package com.example.pickypicks.activity.youtube.terserah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pickypicks.R

class TerserahActivity4 : AppCompatActivity() {

    private lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terserah4)

        btn_next = findViewById(R.id.btn_next)

        btn_next.setOnClickListener {
            val intent = Intent(this@TerserahActivity4, TerserahActivity5::class.java)
            startActivity(intent)
        }
    }
}