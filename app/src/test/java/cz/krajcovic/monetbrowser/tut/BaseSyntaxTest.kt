package cz.krajcovic.monetbrowser.tut

import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.BlockJUnit4ClassRunner
import kotlin.test.assertEquals

@RunWith(BlockJUnit4ClassRunner::class)
class BaseSyntaxTest {

    @Test
    fun print() {
        val baseSyntax: BaseSyntax = BaseSyntax()
        baseSyntax.print(kotlin.collections.listOf("A", null))
    }

    @Test
    fun testLazyProperty() {
        val customer = Customer("Dusan", "dusan.krajcovic@gmail.com")

        println(customer.p)
        println(customer.p)
        assertEquals(customer.p, "OK")
    }

    @Test
    fun testObserveProperty() {
        val customer = Customer("Dusan", "dusan.krajcovic@gmail.com")

        customer.secondName = "Petr"
        customer.secondName = "Marek"
        customer.secondName = "Andy"

        assertEquals(customer.secondName, "Andy")
    }

    @Test(expected = KotlinNullPointerException::class)
    fun testNPE() {
        val baseSyntax: BaseSyntax = BaseSyntax()
        baseSyntax.NPElovers()
    }

}