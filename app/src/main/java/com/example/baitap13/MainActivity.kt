package com.example.baitap13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private lateinit var btnfragment1: Button
    private lateinit var btnfragment2: Button
    private lateinit var btnGo: Button
    private lateinit var edtTen: EditText
    private val fragmentViewModel1 : FragmentViewModel1 by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnfragment1 = findViewById(R.id.btnFragment1)
        btnfragment2 = findViewById(R.id.btnFragment2)
        edtTen = findViewById(R.id.edtText)
        btnGo = findViewById(R.id.btnGo)


        btnfragment1.setOnClickListener{
            fragmentViewModel1.setData(edtTen.text.toString())
            supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, Fragment1()).commit()
        }

        btnfragment2.setOnClickListener{
            fragmentViewModel1.setData(edtTen.text.toString())
            supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, Fragment2()).commit()
        }
        btnGo.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("data","${edtTen.text}")
            startActivity(intent)
        }
    }
}