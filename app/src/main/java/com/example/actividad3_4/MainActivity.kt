package com.example.actividad3_4

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia a los botones
        val btnConsola = findViewById<Button>(R.id.botonApretado)
        val btnConsolaToast = findViewById<Button>(R.id.botonApretadoToast)

        // Botón para mostrar en consola
        btnConsola.setOnClickListener {
            Log.d(TAG, "Botón apretado Consola")
        }

        // Botón para mostrar un Toast
        btnConsolaToast.setOnClickListener {
            Toast.makeText(this, "Botón apretado toast", Toast.LENGTH_SHORT).show()
        }
    }
}
