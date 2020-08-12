package com.example.demo.transformer

import com.example.demo.domain.Person
import com.example.demo.dto.AddPersonRequest
import org.springframework.stereotype.Component

@Component
class AddPresonRequestTransformer:Transformer<AddPersonRequest, Person> {
    override fun transform(source: AddPersonRequest): Person {
        return Person(
                name = source.name,
                lastName = source.lastName
        )
    }
}