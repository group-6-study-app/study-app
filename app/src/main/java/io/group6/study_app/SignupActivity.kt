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
            else if (passwdField.text.isEmpty() || confirmField.text.isEmpty() ||
                usernameField.text.isEmpty()) {
                Toast.makeText(applicationContext, "One or more fields is blank",
                    Toast.LENGTH_SHORT).show()
            }
            else {
                var specialChar = false
                if (passwdField.text.length <= 8) {
                    Toast.makeText(applicationContext, "Password must be longer than eight characters",
                    Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                for (char in passwdField.text) {
                    if (!char.isLetterOrDigit())
                        specialChar = true
                }
                if (!specialChar) {
                    Toast.makeText(applicationContext, "Password must contain a special character",
                    Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                // TODO: Store username and password somewhere
                // TODO: Hash the password as a security measure
            }
        }
    }
}