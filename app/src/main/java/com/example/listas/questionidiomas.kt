package com.example.listas
import android.annotation .SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

class questionidiomas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questionidiomas)

        val rad1= findViewById<RadioButton>(R.id.radio1)
        val rad2= findViewById<RadioButton>(R.id.radio2)
        val rad3= findViewById<RadioButton>(R.id.radio3)
        val button= findViewById<Button>(R.id.but_verif)

        button.setOnClickListener{
            var seleccionar=""
            if(rad1.isChecked){
                seleccionar+=" Incorrecto " +" Tiene 0/10 "
            }
            if(rad2.isChecked){
                seleccionar+=" Correcto " + " Tiene 10/10 "
            }
            if(rad3.isChecked){
                seleccionar+=" Incorrecto " +" Tiene 0/10 "
            }
            if (seleccionar.isEmpty()) {
                Toast.makeText(applicationContext, "No ha seleccionado la respuesta", Toast.LENGTH_SHORT).show()
            } else {
                // You can add logic here to handle the selected answer,
                // for example, display it in a TextView
                Toast.makeText(applicationContext, "Selección: $seleccionar", Toast.LENGTH_SHORT).show()
                // Navegar a pregunta2
                val intent = Intent(this, asignaturas::class.java)
                startActivity(intent)
            }
        }

    }

}