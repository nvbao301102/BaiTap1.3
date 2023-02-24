package com.example.baitap13

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnfragment3: Button
    private lateinit var btnfragment4: Button
    private lateinit var btnGo1: Button
    private lateinit var edtTen2: EditText
    private lateinit var txtView3: TextView
    private val fragmentViewModel2 : FragmentViewModel2 by viewModels()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txtView3 = findViewById(R.id.txtView3)
        val intent = intent
        val data = intent.getStringExtra("data")
        txtView3.text = data


        btnfragment3 = findViewById(R.id.btnFragment3)
        btnfragment4 = findViewById(R.id.btnFragment4)
        edtTen2 = findViewById(R.id.edtText2)
        btnGo1 = findViewById(R.id.btnGo2)

        btnfragment3.setOnClickListener{
            fragmentViewModel2.setData(edtTen2.text.toString())
            supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout2, Fragment3()).commit()
        }

        btnfragment4.setOnClickListener{
            fragmentViewModel2.setData(edtTen2.text.toString())
            supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout2, Fragment4()).commit()
        }
        btnGo1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}