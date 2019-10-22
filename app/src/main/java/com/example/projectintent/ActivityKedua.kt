package com.example.projectintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*
import kotlinx.android.synthetic.main.activity_main.*

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_kedua)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent

        val nim = intent.getStringExtra("NIM" )
        val nama = intent.getStringExtra("Nama" )
        val nilai = intent.getStringExtra("Nilai" )

        val txt_view = findViewById<TextView>(R.id.txt_view)
        txt_view.text = "NIM : "+nim+"\nNama : "+nama+"\nNilai : "+nilai

        val keterangan = findViewById<TextView>(R.id.keterangan)
        if (nilai >= 100.toInt().toString()){
            keterangan.text = "Keterangan : A"
        }
        else if (nilai >= 80.toInt().toString()){
            keterangan.text = "Keterangan : A"
        }
        else if (nilai >= 60.toInt().toString()){
            keterangan.text = "Keterangan : B"
        }
        else if (nilai >= 40.toInt().toString()){
            keterangan.text = "Keterangan : C"
        }
        else if (nilai >= 20.toInt().toString()){
            keterangan.text = "Keterangan : D"
        }
        else if (nilai >= 0.toInt().toString()){
            keterangan.text = "Keterangan : E"
        }
    }
}




