package com.example.flux.controllers

import com.example.common.models.toResponse
import com.example.flux.services.randomnumber.RandomNumberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RandomNumberController(
    private val randomNumberService: RandomNumberService,
) {
    @GetMapping("/random")
    suspend fun getRandomNumber(): ResponseEntity<*> =
        randomNumberService.getRandomNumber().fold(
            { error -> error.toResponse() },
            { number -> number.toResponse() },
        )
}
