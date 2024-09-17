package com.example.test_cicd_heroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestCicdHerokuApplication

fun main(args: Array<String>) {
	runApplication<TestCicdHerokuApplication>(*args)
}
