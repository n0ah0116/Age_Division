package com.example.agedivision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var ageText: EditText
    lateinit var result: TextView
    lateinit var resultBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageText = findViewById(R.id.ageText)
        result = findViewById(R.id.result)
        resultBtn = findViewById(R.id.resultBtn)

        resultBtn.setOnClickListener{
            val age: Int = ageText.text.toString().toInt()

            if (age < 12) {
                result.text = ("어린이")
            } else if(age in 12..17) {
                result.text = ("청소년")
            }else if(age in 19..39) {
                result.text = ("성인")
            }else if(age in 41..69) {
                result.text = ("중년")
            }else if(age >= 71) {
                result.text = ("노인")
            }

        }



    }
}