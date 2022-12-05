package com.example.items

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.items.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val emailText = binding.editTextEmailAddress.text.toString().trim()
            val passText = binding.editTextPassword.text.toString().trim()

            val repository = AuthloginRepository()
            repository.login(emailText, passText)
            if (repository.loginUser == null) {
                showToast("User not found")

            }
                else{
                    showToast("user name is ${repository.loginUser!!.displayName}")
            }

        }

    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}