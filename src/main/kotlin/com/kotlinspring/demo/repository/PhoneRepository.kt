package com.kotlinspring.demo.repository

import com.kotlinspring.demo.entity.Phone
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PhoneRepository : PagingAndSortingRepository<Phone, Long> {

    fun findByBrand(@Param("brand") brand: String): Phone?

}