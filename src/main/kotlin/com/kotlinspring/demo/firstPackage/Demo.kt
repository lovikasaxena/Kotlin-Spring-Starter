package com.kotlinspring.starter.firstPackage

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Demo{

    @GetMapping("/")
    fun welcomePage(): String = "Welcome to Kotlin-Spring demo project"

    @GetMapping("/welcome")
    fun dummyApi(): String = "Kotlin-Spring: A match made in heaven"
}

ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCvSSAB7wAsVlwztqk6KKpqe972VSVY5+dAN5vsYxEf67knRWXCpVAwOQ3RKacFO0F+nDe6iIoGw+bO5Wvmt/Djt/PiwSsx3c9sFHy4APAm8S4+4DErjjwrC3DSkMGC6xuC7JboszCN9xmGJGcatFoX2O7jsyvJCbapCXewW1u/3AGtwfgZckAhewuCNrBgod2qgXOjtdn4bj2uwDNQTDC3sbQvxglmxkCMJr8RcE6QG2WkHToOr6kClgeNw5CAvVjRfnS+K8xFJ7PE+m2wCjfZiiPZDCMdkFSsq55rE3pIs/IVuIjAIvYu0k0ihNil0ilM1L8ecEG2dkxom9Iz1S66sGZdI/I9nJWpLT2ujxlnHcQi26gKpB0YPAgejCLh71WUP1MVcCadOAt89JTf5H2FJaKYBy7D4a1Za9qBlACymQ328jxozp+KL29HzbMdMILgskWpun7kOwpNdGzEXRspIQh5dqjt6yloda1Ght+5MqVqnD3SQUGnb0DOQTHlXohRUg1G5h9kjxz8/mjcNDjDnhrfLICO5yVEFYU6TBQqSLZQQtSAPqAM0hsSVWHj91hpDwo58L5skVtIQ535L48MfPCvpV/1mAOBbtNvO9zwl6WMoGJktJMtWw3oRuLk6bsBhIhMsu5bfUw9cRuy7PyNz/4+v6qixT0fQBD3H/tcIw== lovikasaxena@gmail.com