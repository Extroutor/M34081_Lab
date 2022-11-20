package com.itmo.microservices.demo.users.api.messaging

import com.itmo.microservices.demo.users.api.model.AppDeliveryModel

data class UserCreatedEvent(val user: AppDeliveryModel)

data class UserDeletedEvent(val username: String)
