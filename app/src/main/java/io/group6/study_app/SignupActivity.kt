package io.group6.study_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    lateinit var passwdField: EditText
    lateinit var confirmField: EditText
    lateinit var usernameField: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        passwdField = findViewById(R.id.sPasswordField)
        confirmField = findViewById(R.id.confirmPasswordField)
        usernameField = findViewById(R.id.sUsernameField)

        findViewById<Button>(R.id.signupBtn).setOnClickListener {
            if (passwdField.text != confirmField.text) {
                Toast.makeText(applicationContext, "Passwords do not match",
                    Toast.LENGTH_SHORT).show()
            }
            if (passwdField.text.isEmpty() || confirmField.text.isEmpty() ||
                usernameField.text.isEmpty()) {
                Toast.makeText(applicationContext, "One or more fields is blank",
                    Toast.LENGTH_SHORT).show()
            }
            // TODO: Implement some way to store password, enact password requirements
        }
    }
}