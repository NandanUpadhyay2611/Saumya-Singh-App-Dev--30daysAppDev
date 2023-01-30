package com.example.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast       // You need not to worry about importing this libraries or whatever it will be added automatically as you keep adding xml objects into MainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload= findViewById<Button>(R.id.btnUpload)
        val buttonDownload= findViewById<Button>(R.id.btnDownload)    //declaring a variable.
        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading...", Toast.LENGTH_SHORT).show()
        }        
        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading...", Toast.LENGTH_SHORT).show()
        }


    }
}