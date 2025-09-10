package com.example.notesliteandroid

class Day1KotlinPlayground {
    init {
        println(greet("Iliyas"))
        val n1 = Note("1", "hello")
        val n2 = n1.copy(text = "world")
        println(n1)
        println(n2)
        println(Result.Success<String>("ok"))
        println(Result.Error("error"))
        println(Result.Loading)
    }


    /**
     * Return a greeting message. If the name is null, the message
     * defaults to "Hi, there".
     */
    private fun greet(name: String?): String {
        return "Hi, ${name ?: "there"}"
    }


    data class Note(val id: String, val text: String)

    sealed class Result<out T> {
        data object Loading : Result<Nothing>()
        data object Empty : Result<Nothing>()
        data class Success<T>(val data: T) : Result<T>()
        data class Error(val msg: String) : Result<Nothing>()
    }
}

fun main() {
    Day1KotlinPlayground()
    // Immutable list
    val nums = listOf(1, 2, 3, 4)
    println(nums[2]) // 3

    // Mutable list
    val fruits = mutableListOf("Apple", "Banana")
    fruits.add("Mango")
    println(fruits) // [Apple, Banana, Mango]

    // Set (no duplicates)
    val set = setOf(1, 2, 2, 3)
    println(set) // [1, 2, 3]

    // Map
    val ages = mapOf("Ali" to 25, "Sara" to 20)
    println(ages["Ali"]) // 25

    // when (like switch)
    val day = 3
    val dayName = when (day) {
        1 -> "Mon"
        2 -> "Tue"
        3 -> "Wed"
        else -> "Other"
    }
    println(dayName)

    // Default and named params
    greet("Iliyas")
    greet("Ahmed", "Evening")
    greet(time = "Morning", name = "Sara")
}

fun greet(name: String, time: String = "Day") {
    println("Good $time, $name!")
}
