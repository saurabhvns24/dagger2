package com.example.dagger2

import android.util.Log

class EmailService {
    fun sendEmail(to:String,from:String,body:String){
        Log.d(TAG, "Email sent")
    }
}