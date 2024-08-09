package com.marketplace.user.adaptor.`in`

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi {

    @GetMapping("/test")
    fun test(): String {
        return "hello world"
    }
}