package com.uvg.logintallerand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MapActivity : AppCompatActivity() {
    // Mensaje de bienvenida
    lateinit var txtPrueba : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        txtPrueba = findViewById<TextView>(R.id.txtPrueba)

        txtPrueba.text="Hola amigo lo lograste"
    }
}