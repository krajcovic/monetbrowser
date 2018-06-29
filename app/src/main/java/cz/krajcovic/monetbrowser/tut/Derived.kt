package cz.krajcovic.monetbrowser.tut

import java.io.IOException

class Derived(name: String, val lastName: String) : Base(name.capitalize().also { println("Argument for Base: $it") }, "TajemnaConstanta") {

    init {
        println("Initializing Derived")
    }

    override val size: Int
        get() = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }

    override fun v() {
        //super.v()
        println("Derivated name=$name")
    }

    @Throws(IOException::class)
    fun throwException() {
        throw IOException()
    }
}