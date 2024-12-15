package com.example.listas

import android.annotation .SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.example.listas.R
class movil : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movil)

        val radi1= findViewById<RadioButton>(R.id.rad1)
        val radi2= findViewById<RadioButton>(R.id.rad2)
        val radi3= findViewById<RadioButton>(R.id.rad3)
        val button= findViewById<Button>(R.id.button_verificar)

        button.setOnClickListener{
            var seleccionar=""
            if(radi1.isChecked){
                seleccionar+=" Incorrecto " +" Tiene 0/10 "
            }
            if(radi2.isChecked){
                seleccionar+=" Correcto " + " Tiene 10/10 "
            }
            if(radi3.isChecked){
                seleccionar+=" Incorrecto " +" Tiene 0/10 "
            }
            if (seleccionar.isEmpty()) {
                Toast.makeText(applicationContext, "No ha seleccionado la respuesta", Toast.LENGTH_SHORT).show()
            } else {
                // You can add logic here to handle the selected answer,
                // for example, display it in a TextView
                Toast.makeText(applicationContext, "Selección: $seleccionar", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, questionmovil::class.java)
                startActivity(intent)
            }
        }




    }
}