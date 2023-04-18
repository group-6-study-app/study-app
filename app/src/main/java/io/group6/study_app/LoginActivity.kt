package io.group6.study_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var passwdField: EditText
    lateinit var usernameField: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        passwdField = findViewById(R.id.passwordField)
        usernameField = findViewById(R.id.usernameField)

        findViewById<Button>(R.id.loginBtn).setOnClickListener {
            if (passwdField.text.isEmpty() || usernameField.text.isEmpty()) {
                Toast.makeText(applicationContext, "One or more fields is blank",
                    Toast.LENGTH_SHORT).show()
            }
            // TODO: Implement some kind of database used to check username and password.
        }
    }
}