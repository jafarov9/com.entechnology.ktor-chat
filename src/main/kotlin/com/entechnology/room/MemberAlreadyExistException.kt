package com.entechnology.room

class MemberAlreadyExistException() : Exception(
    "There is already a member with that username in the room"
)