package com.example.kibi_net

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.INGRESAR.setOnClickListener {
            startActivity(Intent(this@Login, Inicio::class.java))
            Toast.makeText(applicationContext, "Iniciando Sesion", Toast.LENGTH_SHORT).show()
        }
    }
}