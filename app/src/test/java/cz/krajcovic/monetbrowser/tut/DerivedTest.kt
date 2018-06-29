package cz.krajcovic.monetbrowser.tut

import org.junit.BeforeClass
import org.junit.Test
import java.io.IOException

class DerivedTest {
    companion object {
        lateinit var derived: Derived

        @BeforeClass
        @JvmStatic
        fun beforeClass() {
            derived = Derived("Dusan", "Krajcovic")
        }
    }


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