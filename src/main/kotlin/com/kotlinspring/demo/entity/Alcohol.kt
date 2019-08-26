package com.kotlinspring.demo.entity
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Property

@NodeEntity
class Alcohol(
//        @Id var id: Long,
                @Property("brand") val brand: String,
                @Property("type") val type: String,
                @Property("cost") val cost: Float
        )