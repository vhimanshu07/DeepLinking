package com.example.deeplinking



import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x: Uri? =intent.data
        x?.let{
            val y= it.toString()
            val text: TextView = findViewById(R.id.text)
            text.text=y
            Toast.makeText(this,"Path is $y", Toast.LENGTH_LONG ).show()
        }

    }
}