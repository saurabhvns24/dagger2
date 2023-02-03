package com.example.dagger2

import dagger.Component

@Component
interface UserRegistrationComponent {
    // define needed object here
    fun getUserRegistrationService(): UserRegistrationService
    fun getEmailService():EmailService
}