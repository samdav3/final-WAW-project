package com.example.final_waw_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ConfirmBets : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_bets)
        val bets = findViewById<TextView>(R.id.results)
        val confirmBets = findViewById<Button>(R.id.confirmBtn)
        val backBtn = findViewById<Button>(R.id.BckBtn)

        val extras = intent.extras
        if (extras != null){
            val boat1 = extras.getString("Boat1")
            val boat2 = extras.getString("Boat2")
            val boat3 = extras.getString("Boat3")
            val boat4 = extras.getString("Boat4")
            val boat5 = extras.getString("Boat5")
            val boat6 = extras.getString("Boat6")

            bets.text = boat1.toString() + "\n" + boat2.toString() + "\n" + boat3.toString() + "\n" + boat4.toString() + "\n" + boat5.toString() + "\n" + boat6.toString()
            var confirmed = bets.text.toString()
            backBtn.setOnClickListener {
                val back = Intent(this@ConfirmBets, MainActivity::class.java)
                startActivity(back)
            }

            confirmBets.setOnClickListener {
                val confirm = Intent(this@ConfirmBets, Results::class.java).apply {
                    putExtra("Bets", confirmed)
                }
                startActivity(confirm)
            }
        }

    }
}