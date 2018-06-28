package cz.krajcovic.monetbrowser.tut

import org.junit.Test

import org.junit.Assert.*
import java.io.IOException

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

    @Test(expected = IOException::class)
    fun testException() {
        derived.throwException()
    }
}