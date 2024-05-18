package com.example.kibi_net

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityCrearPublicacionBinding

class Crear_Publicacion : AppCompatActivity() {
    
    private lateinit var binding: ActivityCrearPublicacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearPublicacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}