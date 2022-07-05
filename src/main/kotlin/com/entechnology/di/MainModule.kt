package com.entechnology.di

import com.entechnology.data.MessageDataSource
import com.entechnology.data.MessageDataSourceImpl
import com.entechnology.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mainModule = module {
    single {
        KMongo.createClient()
            .coroutine
            .getDatabase("message_db_yt")
    }

    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }

    single {
        RoomController(get())
    }
}