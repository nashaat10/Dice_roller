package com.example.dice_roll

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_btn : Button = findViewById(R.id.btn)
        val imageV : ImageView = findViewById(R.id.iv)
        val img2 : ImageView = findViewById(R.id.iv2)
        roll_btn.setOnClickListener {
            val randomN = (1..6).random()
              val image = when(randomN){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else ->  R.drawable.dice_6
            }
            imageV.setImageResource(image)
            val randomN2 = (1..6).random()
            val image2 = when(randomN2){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else ->  R.drawable.dice_6
            }
            img2.setImageResource(image2)

        }
    }
}