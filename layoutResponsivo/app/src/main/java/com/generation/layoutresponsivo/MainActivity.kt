package com.generation.layoutresponsivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button6 = findViewById<Button>(R.id.button6)
        val button12 = findViewById<Button>(R.id.button12)
        val button20 = findViewById<Button>(R.id.button20)

        button6.setOnClickListener {
            rolarDados(6)
        }
        button12.setOnClickListener {
            rolarDados(12)
        }
        button20.setOnClickListener {
            rolarDados(20)
        }
    }
    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random()
        val textDado = findViewById<TextView>(R.id.TextDado)
        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageDado)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.dado_1)
            2 -> image.setImageResource(R.drawable.dado_2)
            3 -> image.setImageResource(R.drawable.dado_3)
            4 -> image.setImageResource(R.drawable.dado_4)
            5 -> image.setImageResource(R.drawable.dado_5)
            6 -> image.setImageResource(R.drawable.dado_6)
        }
    }
}

