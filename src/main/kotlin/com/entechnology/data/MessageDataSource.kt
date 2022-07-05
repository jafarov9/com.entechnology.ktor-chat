package com.entechnology.data

import com.entechnology.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages() : List<Message>

    suspend fun insertMessage(message: Message)
}