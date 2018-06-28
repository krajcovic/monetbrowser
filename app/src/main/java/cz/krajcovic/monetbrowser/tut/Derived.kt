package cz.krajcovic.monetbrowser.tut

class Derived(name: String, val lastName: String) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init {
        println("Initializing Derived")
    }

    override val size: Int
        get() = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }

    override fun v() {
        //super.v()
        println("Derivated name=$name")
    }

//    @Throws(IOException::class)
    fun foo() {
        throw IOException()
    }
}