package com.swai


import kotlin.IllegalArgumentException

class Name(var name: String){
    init {
        if (name.isBlank()) throw IllegalArgumentException()
    }
}