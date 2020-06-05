package com.example.moneyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_converter.*
import java.lang.Double.parseDouble
import kotlin.math.round

class converter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)
        var first: String = intent.getStringExtra("first")
        var second: String = intent.getStringExtra("second")
        val rub : List<Double> = listOf(1.0 , 0.0126 , 0.0129 , 0.0115 , 0.3859 , 0.0347)
        val usd : List<Double> = listOf(68.6 , 1.0 , 0.88 , 0.7906 , 26.6 , 2.379)
        val eur : List<Double> = listOf(77.77 , 1.1336 , 1.0 , 0.89 , 29.89 , 2.69)
        val gbp : List<Double> = listOf(86.78 , 1.26 , 1.1159 , 1.0 , 33.4599 , 3.0093)
        val uah : List<Double> = listOf(2.59 , 0.0376 , 0.0335 , 0.0299 , 1.0 , 0.0894)
        val byn : List<Double> = listOf(28.83 , 0.42 , 0.37 , 0.3323 , 11.184 , 1.0)
        var index_1 : List<Double> = rub
        var index_2 : Int = 0
        when(first){
            "RUB" -> index_1 = rub
            "USD" -> index_1 = usd
            "EUR" -> index_1 = eur
            "GBP" -> index_1 = gbp
            "UAH" -> index_1 = uah
            "BYN" -> index_1 = byn
        }
        when(second){
            "RUB" -> index_2 = 0
            "USD" -> index_2 = 1
            "EUR" -> index_2 = 2
            "GBP" -> index_2 = 3
            "UAH" -> index_2 = 4
            "BYN" -> index_2 = 5
        }
        var number  = index_1.get(index_2)
        textViewFirst.setText(first)
        textViewSecond.setText(second)
        button3.setOnClickListener(){

            var text : EditText = findViewById(R.id.textView1)

            var first_number : Double = parseDouble(text.getText().toString())
            var second_number : Double = first_number * number
            second_number = round(second_number * 100) / 100
            textView2.setText(second_number.toString())
        }
        button2.setOnClickListener(){

            var text1 : EditText = findViewById(R.id.textView2)
            var second_number : Double = parseDouble(text1.getText().toString())
            var first_number : Double = second_number / number
            first_number = round(first_number * 100) / 100
            textView1.setText(first_number.toString())
//            rubbles.setText("123450")
        }

    }
}