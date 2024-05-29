package com.example.test_task.application.dto

/**
 * сериализуются только нужные поля
 * */

data class Message(
    val id: String,
    val from_id: String,
    val text: String,
    val random_id: String,
//    val peer_id: String,
//    ...
)

data class EventMessageNewDTO(
    val message: Message,
//    val client_info: Client_Info
)
