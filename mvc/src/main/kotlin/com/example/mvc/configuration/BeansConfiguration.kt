package com.example.mvc.configuration

import com.example.mvc.services.randomnumber.DefaultRandomNumberService
import com.example.mvc.services.randomnumber.RandomNumberService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeansConfiguration {

    @Bean
    fun randomNumberService(): RandomNumberService {
        return DefaultRandomNumberService()
    }
}
