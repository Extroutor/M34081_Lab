package com.itmo.microservices.delivery.deliveryService.impl.entity.controller

import com.itmo.microservices.delivery.deliveryService.impl.entity.model.AppDeliveryModel
import com.itmo.microservices.delivery.deliveryService.impl.entity.model.SlotRequest
import com.itmo.microservices.demo.users.api.service.DeliveryService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/delivery")
class DeliveryController(private val deliveryService: DeliveryService) {

    @GetMapping("/slots?number={number}")
    @Operation(
        summary = "Get possible slots",
        responses = [
            ApiResponse(description = "OK", responseCode = "200"),
            ApiResponse(description = "Bad request", responseCode = "400", content = [Content()])
        ]
    )
    fun getPossibleSlots(@PathVariable number: Int): AppDeliveryModel = deliveryService.getPossibleSlots(number)


    @PostMapping("/slots")
    @Operation(
        summary = "Create new slot",
        responses = [
            ApiResponse(description = "OK", responseCode = "200"),
            ApiResponse(description = "Slots not found", responseCode = "400", content = [Content()])
        ]
    )
    fun createNewSlot(@RequestBody request: SlotRequest) = deliveryService.createNewSlot(request)


    @DeleteMapping("/slots?number={number}")
    @Operation(
        summary = "Delete chosen slot",
        responses = [
            ApiResponse(description = "OK", responseCode = "200"),
            ApiResponse(description = "Slot not found", responseCode = "404", content = [Content()])
        ],
    )
    fun deleteSlot(@PathVariable number: Int): AppDeliveryModel = deliveryService.deleteSlot(number)

}