package com.example.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var ok : Button
    lateinit var result : TextView

    lateinit var email: EditText
    lateinit var resultEmail :  TextView

    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextText)
        ok = findViewById(R.id.buttonOk)
        result = findViewById(R.id.Result)

        email = findViewById(R.id.editTextTextEmailAddress2)
        resultEmail = findViewById(R.id.ResultEmail)

        image = findViewById(R.id.imageViewExample)

        ok.setOnClickListener {

//            var username : String = name.text.toString()
//            result.setText(username)
//            result.text = username
//
//            var userEmail : String = name.text.toString()
//            resultEmail.setText(userEmail)
//            resultEmail.text = userEmail

            image.setImageResource(R.drawable.SIGN)
        }
    }
}