package com.example.kibi_net

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*OPCIONES*/
        binding.MisDatosOpcion.setOnClickListener {
            startActivity(Intent(this@Inicio, Mis_Datos::class.java))
            Toast.makeText(applicationContext, "Mis Datos", Toast.LENGTH_SHORT).show()
        }

        binding.CrearPublicacionOpcion.setOnClickListener {
            startActivity(Intent(this@Inicio, Crear_Publicacion::class.java))
            Toast.makeText(applicationContext, "Crear Publicaciones", Toast.LENGTH_SHORT).show()
        }

        binding.Publicaciones.setOnClickListener {
            startActivity(Intent(this@Inicio, Ver_Publicaciones::class.java))
            Toast.makeText(applicationContext, "Publicaciones", Toast.LENGTH_SHORT).show()
        }

        binding.UsuariosOpcion.setOnClickListener {
            startActivity(Intent(this@Inicio, Usuarios::class.java))
            Toast.makeText(applicationContext, "Usuarios", Toast.LENGTH_SHORT).show()
        }

        binding.ChatsOpcion.setOnClickListener {
            startActivity(Intent(this@Inicio, Chats::class.java))
            Toast.makeText(applicationContext, "Chats", Toast.LENGTH_SHORT).show()
        }

        binding.CerrarSesion.setOnClickListener {
            startActivity(Intent(this@Inicio, MainActivity::class.java))
            finishAffinity() //metodo para eliminar todas las demas actividades
            Toast.makeText(applicationContext, "Cerrando Sesion", Toast.LENGTH_SHORT).show()
        }
    }
}