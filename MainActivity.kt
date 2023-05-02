package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)
        val enterLogin = findViewById<TextView>(R.id.enter_login)
        val enterPassword = findViewById<TextView>(R.id.enter_password)

        button.setOnClickListener {
            val log = login.text.toString().trim()
            enterLogin.text = "Your login: $log"
            val pas = password.text.toString().trim()
            enterPassword.text = "Your password: $pas"
        }


    }
}