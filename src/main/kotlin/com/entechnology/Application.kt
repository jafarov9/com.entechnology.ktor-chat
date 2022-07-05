package com.entechnology

import com.entechnology.di.mainModule
import com.entechnology.plugins.*
import io.ktor.server.application.*
import org.koin.core.context.loadKoinModules
import org.koin.ktor.ext.Koin


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {

    install(Koin) {

    }

    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSockets()
    configureSecurity()
}
