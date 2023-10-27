package com.example.flux.services.randomnumber

import arrow.core.Either
import arrow.core.right
import com.example.common.models.domain.RandomNumber
import com.example.common.models.errors.DomainError
import kotlinx.coroutines.delay
import kotlin.random.Random

class DefaultRandomNumberService : RandomNumberService {
    override suspend fun getRandomNumber(): Either<DomainError, RandomNumber> {
        delay(2000)
        val value = Random.nextInt(1, 11)
        return RandomNumber(value).right()
    }
}
