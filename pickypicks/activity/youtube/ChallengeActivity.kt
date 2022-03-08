package com.example.pickypicks.activity.youtube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pickypicks.R
import com.example.pickypicks.activity.youtube.challenges.ChallengeActivity2
import com.example.pickypicks.activity.youtube.gaming.GamingActivity2

class ChallengeActivity : AppCompatActivity() {

    private lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)

        btn_next = findViewById(R.id.btn_next)

        btn_next.setOnClickListener {
            val intent = Intent(this@ChallengeActivity, ChallengeActivity2::class.java)
            startActivity(intent)
        }
    }
}