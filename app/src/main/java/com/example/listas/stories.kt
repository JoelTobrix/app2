package com.example.listas

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.Button
import android.widget.Toast

class stories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stories)

        var resulter1 = findViewById<CheckBox>(R.id.option1)
        var resulter2 = findViewById<CheckBox>(R.id.option2)
        var resulter3 = findViewById<CheckBox>(R.id.option3)

        val button = findViewById<Button>(R.id.calificar)
        button.setOnClickListener {
            var seleccion = ""
            if (resulter1.isChecked) {
                seleccion += " Respuesta Correcta " + " Calificacion __10/10"
            }
            if (resulter2.isChecked) {
                seleccion += " INCORRECTO " + " Calificacion __0/10"
            }
            if (resulter3.isChecked) {
                seleccion += " INCORRECTO " + "Calificacion__0/10"
            }
            if (seleccion.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "No ha seleccionado la respuesta",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(applicationContext, "Selección: $seleccion", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, questionstories::class.java)
                startActivity(intent)

            }
        }
    }
}