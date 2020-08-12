package com.example.demo.service

import com.example.demo.dto.AddPersonRequest
import com.example.demo.dto.PersonResponse
import com.example.demo.dto.UpdatePersonRequest

interface PersonManagemantService {

    fun findById(id:Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id:Long)

}