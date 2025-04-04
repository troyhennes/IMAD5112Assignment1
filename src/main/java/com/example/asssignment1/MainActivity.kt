package com.example.asssignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the submitButton/ Input an Meal Suggestion using the id we set on the user interface

        val timeInput = findViewById<EditText>(R.id.editText)
        val suggestButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val mealSuggestion = findViewById<TextView>(R.id.displaySuggestion)

        //Suggest button functionality
        suggestButton.setOnClickListener {
            //Get the time input from user
            val timeOfDay = timeInput.text.toString().trim()

            //Determine the meal suggestion based on the input
            var meal = ""

            if (timeOfDay.equals("Morning" , ignoreCase = true)) {
                meal = "How about some fat cakes with some cheese, polony and atchar?"
            } else if (timeOfDay.equals("Mid-morning" , ignoreCase = true)) {
                meal = "How about a fruit salad with a smoothie?"
            } else if (timeOfDay.equals("Afternoon" , ignoreCase = true)) {
                meal = "How about a bunnychow with soda?"
            } else if (timeOfDay.equals("Mid-afternoon" , ignoreCase = true)) {
                meal = "How about some veggies and hummus: carrots sticks,cucumber slices, or bell pepper strips with hummuns?"
            } else if (timeOfDay.equals("Dinner" , ignoreCase = true)) {
                meal = "How about a traditional meal: pap with some steak, gravy, chakalaka, coslow and some spinach?"
            } else if (timeOfDay.equals("After Dinner" , ignoreCase = true)) {
                meal = "After Dinner: A light snack like Banana with almond butter?"
            } else {
                meal = "Please enter a valid time of day (Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, After dinner"
            }

            //Display the meal suggestion
            mealSuggestion.text = meal
        }

        //Reset button functionality
        resetButton.setOnClickListener {
            //Clear the input field and meal suggestion
            timeInput.text.clear()
            mealSuggestion.text = ""
        }
    }
}
