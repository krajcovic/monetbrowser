package cz.krajcovic.monetbrowser.tut

interface Factory<T> {
    fun create(): T
}