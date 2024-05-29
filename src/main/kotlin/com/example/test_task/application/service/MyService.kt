package com.example.test_task.application.service

import com.example.test_task.application.dto.EventDTO
import org.http4k.client.JavaHttpClient
import org.http4k.core.Method
import org.http4k.core.MultipartFormBody
import org.http4k.core.Request
import org.http4k.core.Response
import org.springframework.stereotype.Service


@Service
class MyService {
    fun sendRequest(responseBody: EventDTO, url: String, accessKey: String): Response {
        val body = MultipartFormBody()
            .plus("user_id" to responseBody.obj!!.message.from_id)
            .plus("random_id" to responseBody.obj.message.random_id)
            .plus("message" to "Вы сказали: ${responseBody.obj.message.text}")

        val request = Request(Method.POST, url)
            .header("Authorization", "Bearer $accessKey")
            .header("Content-Type", "multipart/form-data; boundary=${body.boundary}")
            .body(body)
        val client = JavaHttpClient()
        return client(request)
    }
}