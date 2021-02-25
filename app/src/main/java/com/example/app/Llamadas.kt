package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Llamadas : AppCompatActivity(), View.OnClickListener {

    private var btnview1: View? = null
    private var btnview2: View? = null
    private var btntelefono: ImageView? = null
    private var btncontacto: ImageView? = null
    private var btnatras: ImageView? = null
    private var btnpaginaprincipal: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamadas)

        btnview1 = findViewById<View>(R.id.view4)
        btnview2 = findViewById<View>(R.id.view2)
        btntelefono = findViewById<ImageView>(R.id.imageView)
        btncontacto = findViewById<ImageView>(R.id.imageView2)
        btnatras = findViewById<ImageView>(R.id.imageView7)
        btnpaginaprincipal = findViewById<TextView>(R.id.textView2);


        btnview1!!.setOnClickListener(this)
        btnview2!!.setOnClickListener(this)
        btntelefono!!.setOnClickListener(this)
        btncontacto!!.setOnClickListener(this)
        btnatras!!.setOnClickListener(this)
        btnpaginaprincipal!!.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.view4 -> {
                val intent: Intent = Intent(this, Chat::class.java)
                startActivity(intent)
            }
            R.id.view2 -> {
                val intent: Intent = Intent(this, Chat::class.java)
                startActivity(intent)
            }
            R.id.imageView -> {
                val intent: Intent = Intent(this, Llamadas::class.java)
                startActivity(intent)
            }
            R.id.imageView2 -> {
                val intent: Intent = Intent(this, Contactos::class.java)
                startActivity(intent)
            }
            R.id.imageView7 -> {
                val intent: Intent = Intent(this, Chats::class.java)
                startActivity(intent)
            }
            R.id.textView2 -> {
                val intent: Intent = Intent(this, Chats::class.java)
                startActivity(intent)
            }
        }
    }
}