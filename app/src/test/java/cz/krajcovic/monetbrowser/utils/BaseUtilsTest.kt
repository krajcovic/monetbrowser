package cz.krajcovic.monetbrowser.utils

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.BlockJUnit4ClassRunner

@RunWith(BlockJUnit4ClassRunner::class)
class BaseUtilsTest {

    @Test
    fun sum() {
        assertEquals(BaseUtils.sum(3, 4), 7)
    }

    @Test
    fun maxOf() {
        assertEquals(BaseUtils.maxOf(1,2), 2)
        assertEquals(BaseUtils.maxOf(2,1), 2)
    }
}