package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository, emailService)  // constructor injection
//        val userRegistrationService = UserRegistrationService(userRepository, emailService)  // field injection
        userRegistrationService.registerUser("saurabh@gmail.com", "saurabh@123")
    }
}