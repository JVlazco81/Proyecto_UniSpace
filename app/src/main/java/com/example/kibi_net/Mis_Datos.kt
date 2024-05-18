package com.example.kibi_net

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityMisDatosBinding

class Mis_Datos : AppCompatActivity() {

    private lateinit var binding: ActivityMisDatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMisDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}