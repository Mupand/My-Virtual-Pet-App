package com.example.st10460535.mymyvirtualpetapp


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val feedButton = findViewById<Button>(R.id.feedButton)

        val feedTextView = findViewById<TextView>(R.id.playTextView2nd)

        val feedMessage = intent.getStringExtra("FEED_MESSAGE")
        feedTextView.text = feedMessage

        feedButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}

