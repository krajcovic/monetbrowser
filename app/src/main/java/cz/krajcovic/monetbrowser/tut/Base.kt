package cz.krajcovic.monetbrowser.tut

open class Base constructor(val name: String) {

    private val TAG = Base::class.simpleName

    init {
        println("Initializing $TAG")
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also (::println )

    init{
        println("Second initializer block that prints ${name.length} and ${secondProperty}")
    }

    val customerKey = name.toUpperCase().also { println("CustomerKey initialized: $it") }

    constructor(name: String, superConst: String) : this(name){
        println("Secondary constructor called")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }

    open fun v() {
        println("Base name=$name")
    }

    fun nv() {
        println("Base name=$name")
    }
}
