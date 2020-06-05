package com.example.moneyconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first : String
                button3.setOnClickListener {
            var checked = radioGroup.checkedRadioButtonId
            var first_button : RadioButton = findViewById(checked)
            val intent = Intent(this, converter::class.java)
            var checked2 = radioGroup2.checkedRadioButtonId
            var second_button : RadioButton = findViewById(checked2)
            intent.putExtra("first", first_button.getText().toString())
            intent.putExtra("second", second_button.getText().toString())
            startActivity(intent)

        }


    }
}
