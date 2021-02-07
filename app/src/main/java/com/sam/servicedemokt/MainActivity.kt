package com.sam.servicedemokt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val TYPEONE = 1
const val TYPETWO = 2
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClick = findViewById<Button>(R.id.service_Start)
        btnClick.setOnClickListener {
            val intent =  Intent(this,MyIntentService::class.java)
            intent.putExtra("type", TYPEONE)
            startService(intent)

            val intent2 =  Intent(this,MyIntentService::class.java)
            intent2.putExtra("type", TYPETWO)
            startService(intent)
        }
    }
}