package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnsing_in: Button? = null
    private var btnsing_up: Button? = null
    private var txtusername: EditText? = null
    private var txtpassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnsing_in = findViewById<Button>(R.id.sing_in);
        btnsing_up = findViewById<Button>(R.id.sing_up);
        txtusername = findViewById<EditText>(R.id.username);
        txtpassword = findViewById<EditText>(R.id.password);


        btnsing_in!!.setOnClickListener(this)
        btnsing_up!!.setOnClickListener(this)
        txtusername!!.setOnClickListener(this)
        txtpassword!!.setOnClickListener(this)

        // Setup


    }



    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.sing_in -> {
                if (txtusername!!.text.isNotEmpty() && txtpassword?.text!!.isNotEmpty()){
                    FirebaseAuth.getInstance().signInWithEmailAndPassword(txtusername!!.text.toString(),
                        txtpassword!!.text.toString()).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent: Intent = Intent(this, Chats::class.java)
                            startActivity(intent)

                        }else{
                            showAlert()
                        }
                    }

                }

            }
            R.id.sing_up -> {
                val intent: Intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }

    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error, No se ha podido acceder")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }






}