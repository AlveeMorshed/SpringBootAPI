package com.example.springbootapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootApiApplication

fun main(args: Array<String>) {
    println("In MAIN")
    runApplication<SpringBootApiApplication>(*args)
}
