package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var cal= Calendar.getInstance()
    var año=cal.get(Calendar.YEAR)
    var mes=cal.get(Calendar.MONTH)
    var dia=cal.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etDate.setText(""+dia+"-"+(mes+1)+"-"+año)
    }
    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.itemId
        if (id == R.id.Add) {
            Toast.makeText(this,"Peendientes de pago", Toast.LENGTH_SHORT).show()
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
            return true
        }
        if (id == R.id.Usuarios) {
            Toast.makeText(this,"Añadir Clientes", Toast.LENGTH_SHORT).show()
            val intento2 = Intent(this, addClientes::class.java)
            startActivity(intento2)
            return true
        }
        if (id == R.id.Mostrar) {
            Toast.makeText(this,"Deudas", Toast.LENGTH_SHORT).show()
            val intento3 = Intent(this, MostrarDeuda::class.java)
            startActivity(intento3)
            return true
        }
        if (id == R.id.Acerca) {
            Toast.makeText(this,"Kotlin++", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
