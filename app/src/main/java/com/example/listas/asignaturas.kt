package com.example.listas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.RadioButton


class asignaturas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.asignaturas)

        var matematicas = findViewById<CheckBox>(R.id.math)
        // Agregar un listener al CheckBox
        matematicas.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Si el CheckBox está marcado, iniciar una nueva actividad
                val intent = Intent(this, mathematicas::class.java)
                startActivity(intent)
            }

        }
        var historia = findViewById<CheckBox>(R.id.history)
        //Agregar listener a CheckBox
        historia.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val intent = Intent(this, historias ::class.java)
                startActivity(intent)
            }
        }
        var inglish = findViewById<RadioButton>(R.id.english)
        inglish.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val intent = Intent(this, idiomas ::class.java)
                startActivity(intent)
            }
        }
        var movile = findViewById<RadioButton>(R.id.radio_dispositivos)
        movile.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val intent = Intent(this, movil ::class.java)
                startActivity(intent)
            }
        }

    }
}