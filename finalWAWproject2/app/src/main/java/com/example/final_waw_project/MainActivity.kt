package com.example.final_waw_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isChecked: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextBtn = findViewById<Button>(R.id.NextBtn)
        val boat1 = findViewById<CheckBox>(R.id.ChkBoat1)
        val boat2 = findViewById<CheckBox>(R.id.ChkBoat2)
        val boat3 = findViewById<CheckBox>(R.id.ChkBoat3)
        val boat4 = findViewById<CheckBox>(R.id.ChkBoat4)
        val boat5 = findViewById<CheckBox>(R.id.ChkBoat5)
        val boat6 = findViewById<CheckBox>(R.id.ChkBoat6)

        var boat1Text = ""
        var boat2Text = ""
        var boat3Text = ""
        var boat4Text = ""
        var boat5Text = ""
        var boat6Text = ""

        nextBtn.setOnClickListener {

            if (boat1.isChecked){
                boat1Text = boat1.text.toString()
                isChecked += 1
            }
            if (boat2.isChecked){
                boat2Text = boat2.text.toString()
                isChecked += 1
            }
            if (boat3.isChecked){
                boat3Text = boat3.text.toString()
                isChecked += 1
            }
            if (boat4.isChecked){
                boat4Text = boat4.text.toString()
                isChecked += 1
            }
            if (boat5.isChecked){
                boat5Text = boat5.text.toString()
                isChecked += 1
            }
            if (boat6.isChecked){
                boat6Text = boat6.text.toString()
                isChecked += 1
            }

            if (isChecked != 2) {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.errorID),
                    Toast.LENGTH_LONG
                ).show()
                nextBtn.requestFocus()
            }
            else {
                    val intent = Intent(this@MainActivity, ConfirmBets::class.java).apply {
                        putExtra("Boat1", boat1Text)
                        putExtra("Boat2", boat2Text)
                        putExtra("Boat3", boat3Text)
                        putExtra("Boat4", boat4Text)
                        putExtra("Boat5", boat5Text)
                        putExtra("Boat6", boat6Text)
                    }
                    startActivity(intent)

            }
        }
    }

}