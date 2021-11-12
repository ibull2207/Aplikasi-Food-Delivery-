package com.example.fooddelivery_signup

object SignUpData {
    var username: String = ""
    var password: String = ""

    @JvmName("setUsername1")
    fun setUsername(username: String){
        this.username = username
    }

    @JvmName("setPassword1")
    fun setPassword(password: String){
        this.password = password
    }
}