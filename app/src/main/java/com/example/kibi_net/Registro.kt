package com.example.kibi_net

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kibi_net.databinding.ActivityRegistroBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Registro : AppCompatActivity() {
    private lateinit var RegistrarUsuarios: Button

    private lateinit var Correo: EditText
    private lateinit var Password: EditText
    private lateinit var Nombres: EditText
    private lateinit var Apellidos: EditText
    private lateinit var Edad: EditText
    private lateinit var Telefono: EditText
    private lateinit var Direccion: EditText
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        supportActionBar?.apply {
            title = "Registro"
            setDisplayShowHomeEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        Correo = findViewById(R.id.Correo)
        Password = findViewById(R.id.Password)
        Nombres = findViewById(R.id.Nombres)
        Apellidos = findViewById(R.id.Apellidos)
        Edad = findViewById(R.id.Edad)
        Telefono = findViewById(R.id.Telefono)
        Direccion = findViewById(R.id.Direccion)
        RegistrarUsuarios = findViewById(R.id.RegistrarUsuarios)

        firebaseAuth = FirebaseAuth.getInstance()

        RegistrarUsuarios.setOnClickListener {
            val correo = Correo.text.toString()
            val pass = Password.text.toString()

            if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
                Correo.error = "Correo no valido"
                Correo.requestFocus()
            } else if (pass.length < 6) {
                Password.error = "Contraseña debe ser mayor a 6"
                Password.requestFocus()
            } else {
                REGISTRAR(correo, pass)
            }
        }
    }

    private fun REGISTRAR(correo: String, pass: String) {
        firebaseAuth.createUserWithEmailAndPassword(correo, pass)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = firebaseAuth.currentUser

                    user?.let {
                        val uid = it.uid
                        val nombres = Nombres.text.toString()
                        val apellidos = Apellidos.text.toString()
                        val edad = Edad.text.toString()
                        val telefono = Telefono.text.toString()
                        val direccion = Direccion.text.toString()

                        val DatosUsuario = hashMapOf(
                            "uid" to uid,
                            "correo" to correo,
                            "pass" to pass,
                            "nombres" to nombres,
                            "apellidos" to apellidos,
                            "edad" to edad,
                            "telefono" to telefono,
                            "direccion" to direccion,
                            "imagen" to ""
                        )

                        val database = FirebaseDatabase.getInstance()
                        val reference = database.getReference("USUARIOS_DE_UNISPACE")

                        reference.child(uid).setValue(DatosUsuario)
                        Toast.makeText(this@Registro, "Se registró exitosamente", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this@Registro, MainActivity::class.java))
                    }
                } else {
                    Toast.makeText(this@Registro, "Algo ha salido mal", Toast.LENGTH_SHORT).show()
                }
            }.addOnFailureListener { e ->
                Toast.makeText(this@Registro, e.message, Toast.LENGTH_SHORT).show()
            }
    }
}
