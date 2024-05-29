package com.example.test_task.application.controller

import com.example.test_task.application.config.VkBotApiProperties
import com.example.test_task.application.dto.EventDTO
import com.example.test_task.application.dto.EventTypes
import com.example.test_task.application.service.MyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping
class Controller {

    @Autowired
    lateinit var vkBotApiProperties: VkBotApiProperties

    @Autowired
    lateinit var myService: MyService

    @PostMapping
    fun vkCallbackHandler(@RequestBody responseBody: EventDTO): String {
        if (responseBody.type == EventTypes.CONFIRMATION.type) {
            return vkBotApiProperties.confirmationCode
        } else if (responseBody.type != EventTypes.MESSAGE_NEW.type) {
            return "Unsupported type."
        }
        myService.sendRequest(responseBody, vkBotApiProperties.sendMessageUrl, vkBotApiProperties.accessKey)
        return "ok"
    }

}