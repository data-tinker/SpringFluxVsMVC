package com.example.mvc.services.randomnumber

import arrow.core.Either
import arrow.core.right
import com.example.common.models.domain.RandomNumber
import com.example.common.models.errors.DomainError
import kotlin.random.Random

class DefaultRandomNumberService : RandomNumberService {
    override fun getRandomNumber(): Either<DomainError, RandomNumber> {
        Thread.sleep(2000)
        val value = Random.nextInt(1, 11)
        return RandomNumber(value).right()
    }
}
