package cz.krajcovic.monetbrowser.tut

import java.io.File

class BaseSyntax {
    companion object {
        fun parseInt(str: String): Int? {
            return null
        }

        fun printProduct(arg1: String, arg2: String) {
            val x = parseInt(arg1)
            val y = parseInt(arg2)

            if (x != null && y != null) {
                println(x * y)
            } else {
                println("either '$arg1' or '$arg2' is not a number")
            }
        }
    }

    fun print(list: List<String?>) {
        for (item in list) {
            item.let { print("$it ") }
        }
        println()
    }

    fun describe(obj: Any): String {
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

        return "Not found"
    }

    fun fitInRanges(x: Int = 10, y: Int = 9): String {
        if(x in 1..y+1) {
            return "fits in range"
        } else {
            return "not fits in range"
        }
    }

    fun outInRanges(list: List<String> = listOf("a", "b", "c")) {
        if(-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }

        if(list.size !in list.indices) {
            println("list size is out of valid list indices range too")
        }
    }

    fun usingCollections(items :List<String>) {
        for(item in items) {
            println(item)
        }

        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }


        items.filter{it.startsWith("a")}.sortedBy { it }.map { it.toUpperCase() }.forEach{ println(it)}
    }

    fun notNullShorthand() {
        val files = File("Test").listFiles()

        println(if (files != null) files.size else "file list is empty")
        println( files?.size ?: "file list is empty")
    }

    fun NPElovers() {
        var b:String? = String()
        b = null

        val len = b!!.length
    }



}