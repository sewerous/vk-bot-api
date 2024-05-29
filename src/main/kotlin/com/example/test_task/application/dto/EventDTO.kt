package com.example.test_task.application.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class EventDTO(
    val type: String,
    @JsonProperty("object")
    val obj: EventMessageNewDTO?,
//    val obj: T,
    val group_id: String
)
