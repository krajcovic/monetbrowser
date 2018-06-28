package cz.krajcovic.monetbrowser.tut

import org.junit.Test

import org.junit.Assert.*

class DerivedTest {

    val derived = Derived("Dusan", "Krajcovic")

    @Test
    fun v() {
        derived.v()
    }

    @Test
    fun nv() {
        derived.nv()
    }
}