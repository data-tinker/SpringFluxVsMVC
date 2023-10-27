package com.example.mvc.controllers

import com.example.common.models.toResponse
import com.example.mvc.services.randomnumber.RandomNumberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api_mvc")
class RandomNumberController(
    private val randomNumberService: RandomNumberService,
) {
    @GetMapping("/random")
    fun getRandomNumber(): ResponseEntity<*> =
        randomNumberService.getRandomNumber().fold(
            { error -> error.toResponse() },
            { number -> number.toResponse() },
        )
}
