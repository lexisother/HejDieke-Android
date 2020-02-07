package com.example.hejdieke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val diekebutton = findViewById<Button>(R.id.button)
        val dennisbutton = findViewById<Button>(R.id.button2)
        val dieketex = findViewById<TextView>(R.id.textView)



        diekebutton.setOnClickListener {
            dieketex.text = "diekeEEEE"
        }

        dennisbutton.setOnClickListener {
            dieketex.text = "HEUjj DIeE densiiSIIS"
        }
    }
}
