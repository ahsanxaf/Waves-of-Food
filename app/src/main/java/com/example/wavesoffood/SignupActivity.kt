package com.example.wavesoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wavesoffood.databinding.ActivityLoginBinding
import com.example.wavesoffood.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private val binding: ActivitySignupBinding by lazy {
        ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.haveButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}