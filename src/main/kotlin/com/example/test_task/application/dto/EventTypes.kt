package com.example.test_task.application.dto


enum class EventTypes(val type: String, ) {
    CONFIRMATION(type = "confirmation"),
    MESSAGE_NEW(type = "message_new")
}