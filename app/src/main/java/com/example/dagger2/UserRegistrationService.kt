package com.example.dagger2

class UserRegistrationService(
    private val  userRepository: UserRepository,
    private val emailService: EmailService
) {
//    //Field injection
//    private val userRepository: UserRepository = userRepository
//    private val emailService: EmailService = emailService
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "no_reply@gmail.com", "User register successful")
    }
}

/*
* Unit Testing
* Single Responsibility
* LifeTime of these objects
* Extensible
* */