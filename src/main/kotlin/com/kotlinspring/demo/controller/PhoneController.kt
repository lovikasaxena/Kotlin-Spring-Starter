package com.kotlinspring.demo.controller

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@Slf4j
class PhoneController{

    @GetMapping("/")
    fun defaultMessage(): String {
        log.println("Default end point")
        return "Welcome to default page of Kotlin-Spring demo project"
    }

    @GetMapping("/welcome")
    fun welcome(@RequestParam(value = "name") name: String?): String {
        log.println("Welcome end point")
        val printName = if(name == null) "" else " $name"
        return "Welcome$printName!  \n Kotlin-Spring: It's a match made in heaven!"
    }
}
