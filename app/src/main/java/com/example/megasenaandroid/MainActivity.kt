package com.example.megasenaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val editText: EditText = findViewById(R.id.edit_number);
        val txtResult: TextView = findViewById(R.id.txt_result);
        val btnGenerate: Button = findViewById(R.id.btn_generate);
        // SEGUNDA OPÇÃO
       // btnGenerate.setOnClickListener(buttonClickListener)

        btnGenerate.setOnClickListener {
            val text = editText.text.toString();
            numberGenerator(text,txtResult);
        }


    }
    private fun numberGenerator(text:String, txtResult: TextView){
        val qtd = text.toInt();
    if(text.isEmpty() ||qtd <6 || qtd > 15){
        txtResult.text = "";
        Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_SHORT).show();
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
        for (x in numbers){
            Log.i("numeros", "$x");
        }
        txtResult.text = numbers.joinToString("-");
        }


    }

    // SEGUNDA OPÇÃO
   // val buttonClickListener = View.OnClickListener { TODO("Not yet implemented") }
}
//SEGUNDA OPÇÃO
//private fun Button.setOnClickListener() {
//    TODO("Not yet implemented")
//}
