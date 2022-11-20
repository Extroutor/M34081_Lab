package com.itmo.microservices.demo.notifications.api.service

import com.itmo.microservices.demo.tasks.api.model.TaskModel
import com.itmo.microservices.demo.users.api.model.AppDeliveryModel

interface NotificationService {
    fun processNewUser(user: AppDeliveryModel)
    fun processAssignedTask(task: TaskModel)
}