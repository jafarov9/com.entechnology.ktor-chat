package com.entechnology.plugins

import com.entechnology.room.RoomController
import com.entechnology.routes.chatSocketRoute
import com.entechnology.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.java.KoinJavaComponent.inject

fun Application.configureRouting() {

    val roomController by org.koin.ktor.ext.inject<RoomController>()

    install(Routing) {
        chatSocketRoute(roomController)
        getAllMessages(roomController)
    }
}
