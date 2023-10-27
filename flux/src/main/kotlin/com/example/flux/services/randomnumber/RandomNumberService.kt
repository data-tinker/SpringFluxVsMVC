package com.example.flux.services.randomnumber

import arrow.core.Either
import com.example.common.models.domain.RandomNumber
import com.example.common.models.errors.DomainError

interface RandomNumberService {
    suspend fun getRandomNumber(): Either<DomainError, RandomNumber>
}
