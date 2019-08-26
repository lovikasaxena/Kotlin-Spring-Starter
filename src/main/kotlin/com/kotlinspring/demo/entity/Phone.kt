package com.kotlinspring.demo.entity
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Property

@NodeEntity
class Phone(
            //@Id var id: Long,
        @Property("brand") var brand: String,
        @Property("model") var name: String,
        @Property("cost") var cost: Float
        )