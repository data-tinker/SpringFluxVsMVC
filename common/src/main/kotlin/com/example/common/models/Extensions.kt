package com.example.common.models

import com.example.common.models.domain.RandomNumber
import com.example.common.models.errors.DomainError

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

fun DomainError.toResponse() =
    ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mapOf("message" to this.reason))

fun RandomNumber.toResponse() =
    ResponseEntity.ok(mapOf("number" to this.value))
