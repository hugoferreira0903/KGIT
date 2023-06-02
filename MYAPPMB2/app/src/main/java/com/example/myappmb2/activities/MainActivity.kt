package com.example.myappmb2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myappmb2.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()

        binding.btnlista.setOnClickListener { irlista() }
        binding.btncadaster.setOnClickListener { ircadaster() }
    }

    private fun irlista(){
        val lista = Intent(this, MainActivity2::class.java)

        startActivity(lista)
    }
    private fun ircadaster() {
        val cadaster = Intent(this, MainActivity3::class.java)

        startActivity(cadaster)
    }
}