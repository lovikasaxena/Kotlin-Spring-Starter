package com.kotlinspring.demo.firstPackage

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@Slf4j
class Demo{

    @GetMapping("/")
    fun welcomePage(): String {
        log.println("Default end point")
        return "Welcome to Kotlin-Spring demo project"
    }

    @GetMapping("/welcome")
    fun dummyApi(): String {
        log.println("Welcome end point")
        return "Kotlin-Spring: A match made in heaven"
    }
}
