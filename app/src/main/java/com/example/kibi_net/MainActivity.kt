package com.example.kibi_net

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginBTN.setOnClickListener{
            startActivity(Intent(this@MainActivity, Login::class.java))
        }

        binding.RegistrarBTN.setOnClickListener{
            startActivity(Intent(this@MainActivity, Registro::class.java))
        }
    }
}