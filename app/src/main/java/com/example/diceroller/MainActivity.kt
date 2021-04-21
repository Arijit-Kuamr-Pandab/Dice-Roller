package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.diceText)
        button.setOnClickListener {
            val value: Int = roll()
            textView.text = value.toString()
        }
    }

//    class Dice(val numSides: Int) {
//
//        fun roll(): Int {
//            return (1..numSides).random()
//        }
//    }
    fun roll():Int{
        return (1..6).random()
    }
}