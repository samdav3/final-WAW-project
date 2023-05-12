package com.example.final_wits_and_wagers

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView

class confirm_bets : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_bets)

        val confirmBets = findViewById<Button>(R.id.confirmBtn)
        val backBtn = findViewById<Button>(R.id.BckBtn)
        val bets = findViewById<TextView>(R.id.results)

        val extras = intent.extras
        if (extras != null){
            val boat1 = extras.getString("Boat1")
            val boat2 = extras.getString("Boat2")
            val boat3 = extras.getString("Boat3")
            val boat4 = extras.getString("Boat4")
            val boat5 = extras.getString("Boat5")
            val boat6 = extras.getString("Boat6")

            bets.text = "$boat1\n$boat2\n$boat3\n$boat4\n$boat5\n$boat6\n"

        }

        backBtn.setOnClickListener {
            val back = Intent(this@confirm_bets, MainActivity::class.java)
            startActivity(back)
        }

        confirmBets.setOnClickListener {
            val confirm = Intent(this@confirm_bets, results::class.java)
            startActivity(confirm)
        }


    }
}
