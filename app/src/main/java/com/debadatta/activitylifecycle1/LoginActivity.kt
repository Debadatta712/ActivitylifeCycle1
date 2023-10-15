package com.debadatta.activitylifecycle1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var etMobileno: EditText
    lateinit var etpassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtforgotpassword: TextView
    lateinit var txtregister: TextView
    val validmobilenumber = "9040578453"
    val validpassword = arrayOf("debaomm70120","kakarroto","saiyan prince","namekian")
lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)
        if(isLoggedIn){
            val intent= Intent(this@LoginActivity,MainActivity::class.java)
            if(isLoggedIn){
                val intent=Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }else{
                setContentView(R.layout.activity_login)
            }
        setContentView(R.layout.activity_login)
        title = "log in"
        etMobileno = findViewById(R.id.etMobileno)
        etpassword = findViewById(R.id.etpassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtforgotpassword = findViewById(R.id.txtforgotpassword)
        txtregister = findViewById(R.id.txtregister)

        btnLogin.setOnClickListener {
            val mobilenumber = etMobileno.text.toString()
            val password = etpassword.text.toString()
            var nameofzwarriors = "Z Warriors"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            if ((mobilenumber == validmobilenumber)) {
                if (password == validpassword[0]) {
                    nameofzwarriors = "coder"
                    intent.putExtra("name", nameofzwarriors)
                    startActivity(intent)
                } else if (password == validpassword[1]) {
                    intent.putExtra("name", nameofzwarriors)
                    nameofzwarriors = "goku"
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this@LoginActivity,
                        "Incorrect log in Credentials",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }}}

        override fun onPause() {
            super.onPause()
            finish()
        }
fun savePeferences(){
    sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
}
}