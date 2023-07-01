package com.anastasiya.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private var correctInput = true
    private var button: AppCompatButton? = null
    private lateinit var name: EditText
    private lateinit var hight: EditText
    private lateinit var weight: EditText
    private lateinit var age: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<AppCompatButton>(R.id.button3)

        val textView = findViewById<TextView>(R.id.textView)

        button?.setOnClickListener {
            init()
            if (correctInput) {
                textView.text = "Ответ: ${(name.text.toString().length * weight.text.toString().toDouble() / 
                        hight.text.toString().toInt() * age.text.toString().toInt()).roundToInt()}"
            }
            else {
                textView.text = "Данные введены некорректно."
            }
        }
    }

    private fun init() {
        name = findViewById<EditText>(R.id.name)
        if (name.text.toString().length !in 1..50) {
            correctInput = false
        }

        hight = findViewById<EditText>(R.id.hight)
        if (hight.text.toString().toInt() !in 1..249) {
            correctInput = false
        }

        weight = findViewById<EditText>(R.id.weight)
        if (weight.text.toString().toDouble() !in 1.0..249.0) {
            correctInput = false
        }

        age = findViewById<EditText>(R.id.age)
        if (age.text.toString().toInt() !in 1..149) {
            correctInput = false
        }
    }
}
