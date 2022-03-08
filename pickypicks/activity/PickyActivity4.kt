package com.example.pickypicks.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pickypicks.R

class PickyActivity4 : AppCompatActivity() {

    private lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picky4)

        btn_next =  findViewById(R.id.btn_next)

        btn_next.setOnClickListener {
            val intent = Intent(this@PickyActivity4, PickyActivity5::class.java)
            startActivity(intent)
        }
    }
}