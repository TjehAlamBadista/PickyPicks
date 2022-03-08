package com.example.pickypicks.activity.youtube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pickypicks.R
import com.example.pickypicks.activity.youtube.gaming.GamingActivity2
import com.example.pickypicks.activity.youtube.vlog.VlogActivity2

class VlogActivity : AppCompatActivity() {

    private lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vlog)

        btn_next = findViewById(R.id.btn_next)

        btn_next.setOnClickListener {
            val intent = Intent(this@VlogActivity, VlogActivity2::class.java)
            startActivity(intent)
        }
    }
}