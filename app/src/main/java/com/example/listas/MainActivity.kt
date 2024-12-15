package com.example.listas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun abrirmaterias(view: View){
        val intent = Intent( this, asignaturas:: class.java)
        startActivity(intent)
    }
}