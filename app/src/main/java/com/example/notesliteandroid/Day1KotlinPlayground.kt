package com.example.notesliteandroid

class Day1KotlinPlayground {
    init {
        println(greet("Iliyas"))
        val n1 = Note("1", "hello")
        val n2 = n1.copy(text = "world")
        println(n1)
        println(n2)
        println(Result.Success("ok"))
    }

    fun greet(name: String?): String = "Hi, ${name ?: "there"}"

    data class Note(val id: String, val text: String)

    sealed class Result<out T> {
        object Loading : Result<Nothing>()
        data class Success<T>(val data: T) : Result<T>()
        data class Error(val msg: String) : Result<Nothing>()
    }
}

fun main() {
    Day1KotlinPlayground()
}
