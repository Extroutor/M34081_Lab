package com.itmo.microservices.delivery.deliveryService.impl.entity.model

import java.util.*

enum class DeliverySubmissionOutcome {
    SUCCESS,
    FAILURE,
    EXPIRED
}

data class AppDeliveryModel(
    val chosenSlot: SlotRequest,
    val outcome: DeliverySubmissionOutcome,
    val preparedTime: Long,
    val attempts: Int,
    val submittedTime: Long,
    val transactionId: UUID,
    val submissionStartedTime: Long
)