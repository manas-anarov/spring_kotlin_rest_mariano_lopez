package com.example.demo.service

import com.example.demo.dao.PersonDao
import com.example.demo.dto.AddPersonRequest
import com.example.demo.dto.PersonResponse
import com.example.demo.dto.UpdatePersonRequest
import com.example.demo.transformer.AddPresonRequestTransformer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonManagemantServiceImpl(private val personDao: PersonDao,
                                  private val addPersonRequestTransformer: AddPresonRequestTransformer) : PersonManagemantService {
    override fun findById(id: Long): PersonResponse? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): List<PersonResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(addPersonRequest: AddPersonRequest) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(updatePersonRequest: UpdatePersonRequest) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteById(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}