package com.example.kibi_net

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityPantallaDeCargaBinding

class Pantalla_de_Carga : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaDeCargaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaDeCargaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val duracion = 2500
        Handler().postDelayed({
            val intent = Intent(this@Pantalla_de_Carga, MainActivity::class.java)
            startActivity(intent)
        }, duracion.toLong())
    }
}