package com.marketplace.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class MarketplaceUserApplication

fun main(args: Array<String>) {
    runApplication<MarketplaceUserApplication>(*args)
}
