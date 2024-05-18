package com.example.kibi_net

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityVerPublicacionesBinding

class Ver_Publicaciones : AppCompatActivity() {

    private lateinit var binding: ActivityVerPublicacionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerPublicacionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}