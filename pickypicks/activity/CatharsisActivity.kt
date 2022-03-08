package com.example.pickypicks.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.pickypicks.R
import com.example.pickypicks.activity.catharsis.ChapterActivity1
import com.example.pickypicks.activity.catharsis.CollaborationActivity
import com.example.pickypicks.activity.catharsis.EditionActivity1

class CatharsisActivity : AppCompatActivity() {

    private lateinit var cv_chapter : CardView
    private lateinit var cv_edition : CardView
    private lateinit var cv_collaboration : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catharsis)

        cv_chapter = findViewById(R.id.cv_chapter)
        cv_edition = findViewById(R.id.cv_edition)
        cv_collaboration = findViewById(R.id.cv_collaboration)

        setInitLayout()
    }

    private fun setInitLayout() {
        cv_chapter.setOnClickListener {
            val intent = Intent(this@CatharsisActivity, ChapterActivity1::class.java)
            startActivity(intent)
        }

        cv_edition.setOnClickListener {
            val intent = Intent(this@CatharsisActivity, EditionActivity1::class.java)
            startActivity(intent)
        }

        cv_collaboration.setOnClickListener {
            val intent = Intent(this@CatharsisActivity, CollaborationActivity::class.java)
            startActivity(intent)
        }
    }
}