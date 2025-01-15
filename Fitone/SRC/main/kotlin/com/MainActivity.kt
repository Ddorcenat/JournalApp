package com.Fitone

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // This method is called when the activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Set the layout for this activity

        // Find the button by its ID
        val button = findViewById<Button>(R.id.btnMostrarTareas)

        // Set an onClick listener for the button
        button.setOnClickListener {
            // Show a simple toast message when the button is clicked
            Toast.makeText(this, "¡Hola! Has presionado el botón.", Toast.LENGTH_SHORT).show()
        }
    }
}
