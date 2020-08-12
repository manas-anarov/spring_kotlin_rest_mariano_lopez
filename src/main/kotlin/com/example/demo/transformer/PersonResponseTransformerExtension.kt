package com.example.demo.transformer

import com.example.demo.domain.Person
import com.example.demo.dto.PersonResponse

fun Person?.toPersonResponse(): PersonResponse{
    return PersonResponse(
            id = this?.id ?: 1L,
            fullName = "${this?.lastName}, ${this?.name}"
    )
}