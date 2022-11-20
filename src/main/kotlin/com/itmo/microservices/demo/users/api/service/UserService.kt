package com.itmo.microservices.demo.users.api.service

import com.itmo.microservices.demo.users.api.model.AppDeliveryModel
import com.itmo.microservices.demo.users.api.model.RegistrationRequest
import org.springframework.security.core.userdetails.UserDetails

interface UserService {
    fun findUser(username: String): AppDeliveryModel?
    fun registerUser(request: RegistrationRequest)
    fun getAccountData(requester: UserDetails): AppDeliveryModel
    fun deleteUser(user: UserDetails)
}