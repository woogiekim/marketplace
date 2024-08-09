package com.marketplace.discoveryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class MarketplaceDiscoveryServiceApplication

fun main(args: Array<String>) {
    runApplication<MarketplaceDiscoveryServiceApplication>(*args)
}