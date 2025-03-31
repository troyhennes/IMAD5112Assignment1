package com.example.asssignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the submitButton/ Input an Meal Suggestion using the id we set on the user interface

        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val timeofDay = findViewById<>(R.id.timeofDay)
    }
}