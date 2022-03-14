package com.example.firstkotiln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultButton = findViewById(R.id.resultButton) as ToggleButton
        val tt = findViewById(R.id.tex) as TextView

        resultButton.setOnClickListener {
            if (resultButton.isChecked)
                tt.text="눌렀습니다"
            else
                tt.text="Hello World"
        }
    }
}

