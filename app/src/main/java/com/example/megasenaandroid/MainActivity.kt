package com.example.megasenaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val editText: EditText = findViewById(R.id.edit_number);
        val txtResult: TextView = findViewById(R.id.txt_result);
        val btnGenerate: Button = findViewById(R.id.btn_generate);
        // SEGUNDA OPÇÃO
       // btnGenerate.setOnClickListener(buttonClickListener)

        btnGenerate.setOnClickListener { Log.i("text", "ola") }

    }
    // SEGUNDA OPÇÃO
   // val buttonClickListener = View.OnClickListener { TODO("Not yet implemented") }
}
//SEGUNDA OPÇÃO
//private fun Button.setOnClickListener() {
//    TODO("Not yet implemented")
//}
