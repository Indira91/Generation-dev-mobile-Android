package com.generation.telasnavigator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonNext2 = findViewById<Button>(R.id.buttonNext2)

        val intentTerceira = Intent(this, TerceiraActivity::class.java)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonNext2.setOnClickListener{
            startActivity(intentTerceira)
        }

        buttonVoltar.setOnClickListener{
           finish()
        }
    }
}