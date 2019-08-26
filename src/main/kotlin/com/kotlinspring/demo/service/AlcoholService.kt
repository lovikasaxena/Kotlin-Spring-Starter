package com.kotlinspring.demo.service

import com.kotlinspring.demo.entity.Alcohol
import com.kotlinspring.demo.repository.AlcoholRepository
import org.springframework.stereotype.Service

@Service
class PhoneService(private val alcoholRepository: AlcoholRepository) {
    fun getPhoneByBrand(brand: String?) : List<Alcohol> =
        if (brand !== null) alcoholRepository.findByBrand(brand) else emptyList()

}