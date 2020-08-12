package com.example.demo.service

import com.example.demo.dao.PersonDao
import com.example.demo.domain.Person
import com.example.demo.dto.AddPersonRequest
import com.example.demo.dto.PersonResponse
import com.example.demo.dto.UpdatePersonRequest
import com.example.demo.transformer.AddPresonRequestTransformer
import com.example.demo.transformer.toPersonResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.IllegalStateException

@Service
class PersonManagemantServiceImpl(private val personDao: PersonDao,
                                  private val addPersonRequestTransformer: AddPresonRequestTransformer) : PersonManagemantService {
    override fun findById(id: Long): PersonResponse? = this.findPersonById(id).toPersonResponse()

    override fun findAll(): List<PersonResponse> = this.personDao.findAll().map(Person::toPersonResponse)

    override fun save(addPersonRequest: AddPersonRequest): PersonResponse {
       return this.saveOrUpdate(
               addPersonRequestTransformer.transform(addPersonRequest)
       )
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse {
        val person = this.findPersonById(updatePersonRequest.id) ?: throw IllegalStateException("${updatePersonRequest.id} not found")
        return this.saveOrUpdate(person.apply {
            this.name = updatePersonRequest.name
            this.lastName = updatePersonRequest.lastNAme

        })
    }

    override fun deleteById(id: Long) {
        this.personDao.deleteById(id)
    }

    private fun findPersonById(id: Long):Person? = this.personDao.findByIdOrNull(id)

    private fun saveOrUpdate(person: Person):PersonResponse = this.personDao.save(person).toPersonResponse()
}
