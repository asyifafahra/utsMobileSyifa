package com.asyifafahra.utsmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {

    private lateinit var txtSignUp : TextView
    private lateinit var btnLogin2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        txtSignUp = findViewById(R.id.txtSignUp)
        btnLogin2 = findViewById(R.id.btnLogIn2)

        txtSignUp.setOnClickListener() {
            intent = Intent(this@LoginPage, SignUpPage::class.java)
            startActivity(intent)
        }

        btnLogin2.setOnClickListener() {
            intent = Intent(this@LoginPage, FavoritesPage::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}