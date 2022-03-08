package com.example.pickypicks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.pickypicks.activity.CatharsisActivity
import com.example.pickypicks.activity.OnixActivity
import com.example.pickypicks.activity.PickyActivity
import com.example.pickypicks.activity.RucasActivity
import com.example.pickypicks.activity.youtube.*

class MainActivity : AppCompatActivity() {

    private lateinit var cv_picky : CardView
    private lateinit var cv_catharsis : CardView
    private lateinit var cv_rucas : CardView
    private lateinit var cv_onix : CardView
    private lateinit var cv_react : CardView
    private lateinit var cv_gaming : CardView
    private lateinit var cv_mobil : CardView
    private lateinit var cv_motor : CardView
    private lateinit var cv_vlog : CardView
    private lateinit var cv_challenge : CardView
    private lateinit var cv_bantu : CardView
    private lateinit var cv_terserah : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cv_picky = findViewById(R.id.cv_picky)
        cv_catharsis = findViewById(R.id.cv_catharsis)
        cv_rucas = findViewById(R.id.cv_rucas)
        cv_onix = findViewById(R.id.cv_onix)
        cv_react = findViewById(R.id.cv_react)
        cv_gaming = findViewById(R.id.cv_gaming)
        cv_mobil = findViewById(R.id.cv_mobil)
        cv_motor = findViewById(R.id.cv_motor)
        cv_vlog = findViewById(R.id.cv_vlog)
        cv_challenge = findViewById(R.id.cv_Challenge)
        cv_bantu = findViewById(R.id.cv_bantu)
        cv_terserah = findViewById(R.id.cv_terserah)

        setInitLayout()
    }

    private fun setInitLayout() {
        cv_picky.setOnClickListener {
            val intent = Intent(this@MainActivity, PickyActivity::class.java)
            startActivity(intent)
        }

        cv_catharsis.setOnClickListener {
            val intent = Intent(this@MainActivity, CatharsisActivity::class.java)
            startActivity(intent)
        }

        cv_rucas.setOnClickListener {
            val intent = Intent(this@MainActivity, RucasActivity::class.java)
            startActivity(intent)
        }

        cv_onix.setOnClickListener {
            val intent = Intent(this@MainActivity, OnixActivity::class.java)
            startActivity(intent)
        }

        cv_react.setOnClickListener {
            val intent = Intent(this@MainActivity, ReactActivity::class.java)
            startActivity(intent)
        }

        cv_gaming.setOnClickListener {
            val intent = Intent(this@MainActivity, GamingActivity::class.java)
            startActivity(intent)
        }

        cv_mobil.setOnClickListener {
            val intent = Intent(this@MainActivity, MobilActivity::class.java)
            startActivity(intent)
        }

        cv_motor.setOnClickListener {
            val intent = Intent(this@MainActivity, MotorActivity::class.java)
            startActivity(intent)
        }

        cv_vlog.setOnClickListener {
            val intent = Intent(this@MainActivity, VlogActivity::class.java)
            startActivity(intent)
        }

        cv_challenge.setOnClickListener {
            val intent = Intent(this@MainActivity, ChallengeActivity::class.java)
            startActivity(intent)
        }

        cv_bantu.setOnClickListener {
            val intent = Intent(this@MainActivity, BantuActivity::class.java)
            startActivity(intent)
        }

        cv_terserah.setOnClickListener {
            val intent = Intent(this@MainActivity, TerserahActivity::class.java)
            startActivity(intent)
        }
    }
}