package cz.krajcovic.monetbrowser.tut

open class Base(val name: String) {

    private val TAG = Base::class.simpleName

    init {
        println("Initializing $TAG")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }

    open fun v() {
        println("Base name=$name")
    }

    fun nv() {
        println("Base name=$name")
    }
}
