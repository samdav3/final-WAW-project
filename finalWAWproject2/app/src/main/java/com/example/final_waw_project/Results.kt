package com.example.final_waw_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Results : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val playAgain = findViewById<Button>(R.id.playAgain)
        val winner = findViewById<TextView>(R.id.winner)
        val winOrlose = findViewById<TextView>(R.id.winOrLose)
        val randomWinner = listOf("Boat 1", "Boat 2", "Boat 3", "Boat 4", "Boat 5", "Boat 6")
        val random = randomWinner.random()

        val extra = intent.extras
        if (extra != null){
            val bet1 = extra.getString("Bets")
            winner.text = "The winner of the race is $random!"
            if (random == bet1) {
                winOrlose.text = "You bet on the winning boat, $random!"
            }
            else{
                winOrlose.text = "I'm sorry, you did not guess on the winning boat, $random."
            }
        }

        playAgain.setOnClickListener{
            val playGame = Intent(this@Results, MainActivity::class.java)
            startActivity(playGame)
        }

    }
}