package com.example.tarasovartem3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity<TextView> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var counter: Int = 50
        setContentView(R.layout.activity_main)
        var imageButton: ImageView = findViewById(R.id.imageView3)
        var textView: TextView = findViewById(R.id.textView3)

        //imageButton.setOnClickListener{
       //     textView.text = "${++counter} "
        //}
    }
}