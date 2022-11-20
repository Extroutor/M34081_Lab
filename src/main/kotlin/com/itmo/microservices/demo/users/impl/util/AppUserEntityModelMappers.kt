package com.itmo.microservices.demo.users.impl.util

import com.itmo.microservices.demo.users.api.model.AppDeliveryModel
import com.itmo.microservices.demo.users.impl.entity.AppUser

fun AppUser.toModel(): AppDeliveryModel = kotlin.runCatching {
    AppDeliveryModel(
        username = this.username!!,
        name = this.name!!,
        surname = this.surname!!,
        email = this.email!!,
        password = this.password!!
    )
}.getOrElse { exception -> throw IllegalStateException("Some of user fields are null", exception) }