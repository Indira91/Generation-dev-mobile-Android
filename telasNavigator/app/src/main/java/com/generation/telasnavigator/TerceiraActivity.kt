package com.generation.telasnavigator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)

     val buttonVoltar2 = findViewById<Button>(R.id.buttonVoltar2)

        buttonVoltar2.setOnClickListener {
            finish()
        }
    }
}