package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        image = findViewById(R.id.diceImage)
        button.setOnClickListener {
            val value: Int = roll()
            when(value){
                1-> Glide.with(this).load(R.drawable.dice_1).placeholder(R.drawable.ic_launcher_background).into(image)
                2-> Glide.with(this).load(R.drawable.dice_2).placeholder(R.drawable.ic_launcher_background).into(image)
                3-> Glide.with(this).load(R.drawable.dice_3).placeholder(R.drawable.ic_launcher_background).into(image)
                4-> Glide.with(this).load(R.drawable.dice_4).placeholder(R.drawable.ic_launcher_background).into(image)
                5-> Glide.with(this).load(R.drawable.dice_5).placeholder(R.drawable.ic_launcher_background).into(image)
                6-> Glide.with(this).load(R.drawable.dice_6).placeholder(R.drawable.ic_launcher_background).into(image)
            }
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