package com.example.listas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.Button
import android.widget.Toast

class historias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.historias)

        var resulter1 = findViewById<CheckBox>(R.id.option1)
        var resulter2 = findViewById<CheckBox>(R.id.option2)
        var resulter3 = findViewById<CheckBox>(R.id.option3)

        val button = findViewById<Button>(R.id.calificar)
        button.setOnClickListener {
            var seleccion = ""
            if (resulter1.isChecked) {
                seleccion += "CORRECTO " + " Tienes 10"
            }
            if (resulter2.isChecked) {
                seleccion += " INCORRECTO " + " Tienes 0"
            }
            if (resulter3.isChecked) {
                seleccion += " INCORRECTO " + "Tienes 0"
            }
            if (seleccion.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Seleccione una opcion",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(applicationContext, "Selección: $seleccion", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, questionhistorias::class.java)
                startActivity(intent)

            }
        }
    }
}