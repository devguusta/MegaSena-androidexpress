package com.example.megasenaandroid

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var prefs: SharedPreferences;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        prefs = getSharedPreferences("db", Context.MODE_PRIVATE);
        val result = prefs.getString("result", "");


        val editText: EditText = findViewById(R.id.edit_number);
        val txtResult: TextView = findViewById(R.id.txt_result);
        val btnGenerate: Button = findViewById(R.id.btn_generate);
        // SEGUNDA OPÇÃO
       // btnGenerate.setOnClickListener(buttonClickListener)
        result?.let {
            txtResult.text =it;
        }
//        if(!result.isNullOrEmpty()){
//
//        }
        btnGenerate.setOnClickListener {
            val text = editText.text.toString();
            numberGenerator(text,txtResult);
        }


    }
    private fun numberGenerator(text:String, txtResult: TextView){

    if(text.isEmpty()) {
        txtResult.text = "";
        Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_SHORT).show();
        return;
    }
        val qtd = text.toInt();
        if(qtd <6 || qtd > 15) {
            txtResult.text = "";
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_SHORT).show();
            return;
        }

        else {
            val numbers = mutableSetOf<Int>()
    val random = Random();
        while (true){
            val number = random.nextInt(60);
            numbers.add(number + 1);
            if(numbers.size == qtd){
                break;
            }
        }

        txtResult.text = numbers.joinToString("-");
            val editor = prefs.edit();
            editor.putString("result", txtResult.text.toString()).apply();

        }


    }

    // SEGUNDA OPÇÃO
   // val buttonClickListener = View.OnClickListener { TODO("Not yet implemented") }
}
//SEGUNDA OPÇÃO
//private fun Button.setOnClickListener() {
//    TODO("Not yet implemented")
//}
