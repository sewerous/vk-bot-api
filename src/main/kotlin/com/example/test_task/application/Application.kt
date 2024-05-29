package com.example.test_task.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
