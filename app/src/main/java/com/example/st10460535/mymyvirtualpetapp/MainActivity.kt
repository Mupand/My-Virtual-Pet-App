package com.example.st10460535.mymyvirtualpetapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to navigate to the second screen
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            // Pass the message "I am hungry" as an extra with the intent
            intent.putExtra("FEED_MESSAGE", getString(R.string.feed_message))
            startActivity(intent)
        }
    }
}
