package com.example.projectintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val btn_proses = findViewById<Button>(R.id.btn_proses)

        btn_proses.setOnClickListener {
            var nim = nim.text.toString()
            var nama = nama.text.toString()
            var nilai = nilai.text.toString()

            intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("NIM", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai", nilai)
            startActivity(intent)
        }
    }
}