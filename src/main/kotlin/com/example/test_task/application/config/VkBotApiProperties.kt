package com.example.test_task.application.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
data class VkBotApiProperties (
    @Value("\${vk.bot_api.confirmation_code}")
    val confirmationCode: String,

    @Value("\${vk.bot_api.access_key}")
    val accessKey: String = "vk1.a.yStmOc2SWJyapOK_j72nvYADvrOqAeuJSpcRLFrp0FSvcueu8S6hk_cBqjGKYcw1HmUqB7aqDT-quc_emffq6oHpHITgjRAY7e_SMx8Rei-n0Gnuid9C0HdGXsLEtAM8cLqcvfn9odKeVpKfgwJpyZSSWSEv0NlphdDxie8i0BJuqH4rRvYL2J_jFo5v4Y_TwhE4hzBVLkMPBTT7g9mulQ",

    @Value("\${vk.bot_api.send_message_url}")
    val sendMessageUrl: String = "https://api.vk.com/method/messages.send?v=5.236"
)