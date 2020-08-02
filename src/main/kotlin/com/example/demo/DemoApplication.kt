package com.example.demo

import com.example.demo.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoApplication{
	@GetMapping
	fun hi(): Person{
		return Person(name = "Snoop", lastName = "Doog")
	}
}
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
