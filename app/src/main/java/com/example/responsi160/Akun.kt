package com.example.responsi160

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akun.*

class Akun : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val bundle:Bundle? = intent.extras


        val nama = bundle?.get("Nama")
        val us = bundle?.get("Username")

        outNama.text = ("Nama : " +nama)
        outUser.text = ("Username : " +us)
    }
}
