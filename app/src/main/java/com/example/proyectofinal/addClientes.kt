package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.add_clientes.*

class addClientes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_clientes)
        btCancelar.setOnClickListener {
            finish()
        }
        btGuardar.setOnClickListener {
            finish()
        }
    }
}
