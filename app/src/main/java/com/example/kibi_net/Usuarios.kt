package com.example.kibi_net

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityUsuariosBinding

class Usuarios : AppCompatActivity() {

    private lateinit var binding: ActivityUsuariosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsuariosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}