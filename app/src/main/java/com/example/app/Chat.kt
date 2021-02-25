package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Chat : AppCompatActivity(), View.OnClickListener {

    private var btnatras: ImageView? = null
    private var btnContactos: ImageView? = null
    private var btnombrecontacto: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        btnatras = findViewById<ImageView>(R.id.imageView5);
        btnContactos = findViewById<ImageView>(R.id.imageView6);
        btnombrecontacto = findViewById<TextView>(R.id.textView2);

        btnatras!!.setOnClickListener(this)
        btnContactos!!.setOnClickListener(this)
        btnombrecontacto!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageView5 -> {
                val intent: Intent = Intent(this, Chats::class.java)
                startActivity(intent)
            }
            R.id.imageView6 -> {
                val intent: Intent = Intent(this, Contactos::class.java)
                startActivity(intent)
            }
            R.id.textView2 -> {
                val intent: Intent = Intent(this, Nombre_Contacto::class.java)
                startActivity(intent)
            }
        }
    }
}