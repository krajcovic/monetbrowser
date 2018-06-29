package cz.krajcovic.monetbrowser.tut

interface Factory<T> {

    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        print(prop)
    }

    fun create(): T
}