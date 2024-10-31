package com.example.atry

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tmptext1: EditText = findViewById(R.id.text1)
        val tmptext2: EditText = findViewById(R.id.text2)
        val tmphasil: TextView = findViewById(R.id.hasil)

        val btntambah: Button = findViewById(R.id.btn_tambah)
        val btnkurang: Button = findViewById(R.id.btn_kurang)
        val btnkali: Button = findViewById(R.id.btn_kali)
        val btnbagi: Button = findViewById(R.id.btn_bagi)
        val btnreset: Button = findViewById(R.id.btn_reset)

        btntambah.setOnClickListener {
            val t1 = tmptext1.text.toString().toIntOrNull()
            val t2 = tmptext2.text.toString().toIntOrNull()
            if (t1 == null || t2 == null) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                tmphasil.text = "Masukkan angka yang benar"
            } else {
                val total = t1 + t2
                tmphasil.text = total.toString()
            }
        }

        //kurang
        btnkurang.setOnClickListener {
            val t1 = tmptext1.text.toString().toIntOrNull()
            val t2 = tmptext2.text.toString().toIntOrNull()
            if (t1 == null || t2 == null) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                tmphasil.text = "Masukkan angka yang benar"
            } else {
                val total = t1 - t2
                tmphasil.text = total.toString()
            }
        }

        //kali
        btnkali.setOnClickListener {
            val t1 = tmptext1.text.toString().toIntOrNull()
            val t2 = tmptext2.text.toString().toIntOrNull()
            if (t1 == null || t2 == null) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                tmphasil.text = "Masukkan angka yang benar"
            } else {
                val total = t1 * t2
                tmphasil.text = total.toString()
            }
        }

        //bagi
        btnbagi.setOnClickListener {
            val t1 = tmptext1.text.toString().toIntOrNull()
            val t2 = tmptext2.text.toString().toIntOrNull()
            if (t1 == null || t2 == null) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                tmphasil.text = "Masukkan angka yang benar"
            } else {
                val total = t1 / t2
                tmphasil.text = total.toString()
            }
        }

        // Reset
        btnreset.setOnClickListener {
            tmptext1.text.clear()
            tmptext2.text.clear()
            tmphasil.text = ""
            Toast.makeText(this, "Input dan hasil telah direset", Toast.LENGTH_SHORT).show()
        }
    }
}