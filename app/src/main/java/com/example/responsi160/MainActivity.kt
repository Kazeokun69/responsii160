package com.example.responsi160

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reg = findViewById<TextView>(R.id.register)

        reg.setOnClickListener{
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }


        login.setOnClickListener {
            val user = user.text.toString()
            val pass = pass.text.toString()
            if (user == "kazeokun" || pass == "bebyjkt48") {
                intent = Intent(this, Home::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
