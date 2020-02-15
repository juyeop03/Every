package com.example.every.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.every.R
import com.example.every.activity.signin.SignInActivity
import com.example.every.activity.student.StudentMainActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkLogin()
    }

    private fun checkLogin(){
        val checkLogin : SharedPreferences = getSharedPreferences("checkLogin", Context.MODE_PRIVATE)
        if(checkLogin.getBoolean("loginData", false)){
            startActivity(Intent(this@MainActivity, StudentMainActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, SignInActivity::class.java))
            finish()
        }
    }
}
