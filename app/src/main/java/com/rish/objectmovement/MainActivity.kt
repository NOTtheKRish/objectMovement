package com.rish.objectmovement

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val batman = findViewById<ImageView>(R.id.batmanLogo)
        val btnUp = findViewById<Button>(R.id.btnUp)
        val btnDown = findViewById<Button>(R.id.btnDown)
        val btnLeft = findViewById<Button>(R.id.btnLeft)
        val btnRight = findViewById<Button>(R.id.btnRight)

        btnUp.setOnClickListener {
            var currentVal = batman.translationY
            batman.translationY = currentVal - 40
        }
        btnDown.setOnClickListener {
            var currentVal = batman.translationY
            batman.translationY = currentVal + 40
        }
        btnLeft.setOnClickListener {
            var currentVal = batman.translationX
            batman.translationX = currentVal - 40
        }
        btnRight.setOnClickListener {
            var currentVal = batman.translationX
            batman.translationX = currentVal + 40
        }
    }
}
