package com.marketplace.apigateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarketplaceApiGatewayApplication

fun main(args: Array<String>) {
    runApplication<MarketplaceApiGatewayApplication>(*args)
}