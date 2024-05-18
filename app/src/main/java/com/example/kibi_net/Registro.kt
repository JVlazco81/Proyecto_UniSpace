package com.example.kibi_net

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {
    //var RegistrarUsuarios: Button? = null
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RegistrarUsuarios.setOnClickListener {
            startActivity(Intent(this@Registro, MainActivity::class.java))
            finishAffinity() //metodo para eliminar todas las demas actividades
            // Mostrar mensaje de registro exitoso
            Toast.makeText(applicationContext, "Registro exitoso", Toast.LENGTH_SHORT).show()
        }
    }
}