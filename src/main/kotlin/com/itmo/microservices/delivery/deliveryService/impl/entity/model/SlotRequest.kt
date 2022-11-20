package com.itmo.microservices.delivery.deliveryService.impl.entity.model

import java.sql.Time
import java.util.Date

data class SlotRequest(
        val date: Date,
        val time: Time,
        val available: Boolean
)