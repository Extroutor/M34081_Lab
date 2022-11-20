package com.itmo.microservices.demo.users.api.service

import com.itmo.microservices.delivery.deliveryService.impl.entity.model.AppDeliveryModel
import com.itmo.microservices.delivery.deliveryService.impl.entity.model.SlotRequest

interface DeliveryService {
    fun createNewSlot(request: SlotRequest)
    fun getPossibleSlots(number: Int): AppDeliveryModel
    fun deleteSlot(number: Int): AppDeliveryModel
}