package io.github.devwithpug.config

import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MongoConfig {

    @Bean
    fun mongoClient() = MongoClients.create("mongodb://localhost:27017")
}
