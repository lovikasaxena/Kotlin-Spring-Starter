package com.kotlinspring.starter.firstPackage

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Demo{

    @GetMapping("/welcome")
    fun dummyApi(): String = "Kotlin-Spring: A match made in heaven"

}