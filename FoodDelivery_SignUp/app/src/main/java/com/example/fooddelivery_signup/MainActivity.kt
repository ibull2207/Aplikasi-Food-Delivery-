package com.example.fooddelivery_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edUsername:EditText
    lateinit var edPassword:EditText
    lateinit var edKoPassword:EditText
    lateinit var btnSignUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edUsername = findViewById(R.id.edUsername)
        edPassword = findViewById(R.id.edPassword)
        edKoPassword = findViewById(R.id.edKoPassword)
        btnSignUp = findViewById(R.id.btnSignUp)

        btnSignUp.setOnClickListener{
            var edUsername = edUsername.text.toString()
            var edPassword = edPassword.text.toString()
            var edKoPassword = edKoPassword.text.toString()

            if(edUsername.isEmpty() || edPassword.isEmpty() || edKoPassword.isEmpty()){
                Toast.makeText(this, "Harap Isi Semua Field", Toast.LENGTH_LONG).show()
            }
            else if(edPassword != edKoPassword){
                Toast.makeText(this, "Password tidak cocok", Toast.LENGTH_LONG).show()
            }
            else if (edUsername.isNotEmpty() && edPassword == edKoPassword){
                SignUpData.setUsername(edUsername)
                SignUpData.setPassword(edPassword)

                Toast.makeText(this, "Anda Berhasil Sign Up", Toast.LENGTH_LONG).show()
//              /* Masukkan Activity yang ingin dituju */  startActivity()
            }
        }

    }
}