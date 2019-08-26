package com.kotlinspring.demo.repository

import com.kotlinspring.demo.entity.Alcohol
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface AlcoholRepository : PagingAndSortingRepository<Alcohol, Long> {

    fun findByBrand(@Param("brand") brand: String): List<Alcohol>

}