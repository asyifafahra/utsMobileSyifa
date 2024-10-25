package com.asyifafahra.utsmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePage : AppCompatActivity() {

    private lateinit var btnLogIn : Button
    private lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)

        btnLogIn = findViewById(R.id.btnLogIn)
        btnSignUp = findViewById(R.id.btnSignUp)

        btnLogIn.setOnClickListener() {
            intent = Intent(this@WelcomePage, LoginPage::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener() {
            intent = Intent(this@WelcomePage, SignUpPage::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}