package com.example.diceroller2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView  //field  //lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton:Button=findViewById(R.id.roll_button)

        diceImage=findViewById(R.id.dice_image)

        rollbutton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
//        Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()
//        val resultText:TextView=findViewById(R.id.result_text)
//
        val randomInt=(1..6).random()
//
//        resultText.text=randomInt.toString()

        val drawableResource=when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.contentDescription=randomInt.toString()
        diceImage.setImageResource(drawableResource)
    }
}

