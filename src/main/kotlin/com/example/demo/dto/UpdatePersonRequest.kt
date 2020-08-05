package com.example.demo.dto

data class UpdatePersonRequest (val id:Long, val name:String, val lastNAme:String? = null)