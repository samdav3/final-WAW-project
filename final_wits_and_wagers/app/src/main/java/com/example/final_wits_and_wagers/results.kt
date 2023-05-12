package com.example.final_wits_and_wagers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlin.random.Random

class results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val extras = intent.extras
        val playAgain = findViewById<Button>(R.id.playAgain)
        val selectedBets = extras?.getString("Bets")
        var winner = findViewById<TextView>(R.id.winner)
        val winOrlose = findViewById<TextView>(R.id.winOrLose)
        val randomWinner = listOf("Boat 1", "Boat 2", "Boat 3", "Boat 4", "Boat 5", "Boat 6")
        val random = randomWinner.random()
        winner.text = "The winner of the race is " + random

        if (random == selectedBets){
            winOrlose.text = "You bet on the winning boat, $random."
        }else{
            winOrlose.text = "I'm sorry, you did not guess on the winning boat, $random."
        }
        playAgain.setOnClickListener{
            val playGame = Intent(this@results, MainActivity::class.java)
            startActivity(playGame)
        }

    }
}