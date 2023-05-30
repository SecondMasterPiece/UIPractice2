package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uipractice.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.okBtn.setOnClickListener {

            val inputId = binding.idLine.text.toString()
            val inputPassword = binding.passwordLine.text.toString()
            val name = "이근우"
            if(inputId == "admin@test.com" && inputPassword == "qwer"){

                Toast.makeText(this, name.toString()+"관리자입니다.", Toast.LENGTH_SHORT).show()

            }
            else{

                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()}

        }

    }
}