package com.example.mvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VirtualApplication

fun main(args: Array<String>) {
    runApplication<VirtualApplication>(*args)
}
