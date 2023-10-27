package com.example.flux.configuration

import com.example.flux.services.randomnumber.DefaultRandomNumberService
import com.example.flux.services.randomnumber.RandomNumberService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeansConfiguration {

    @Bean
    fun randomNumberService(): RandomNumberService {
        return DefaultRandomNumberService()
    }
}
