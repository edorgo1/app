package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Nombre_Contacto : AppCompatActivity(), View.OnClickListener {


    private var btnatras: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombre__contacto)

        btnatras = findViewById<ImageView>(R.id.imageView15)

        btnatras!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageView15 -> {
                val intent: Intent = Intent(this, Chats::class.java)
                startActivity(intent)
            }
        }
    }
}