package unit

import dates.januar
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import timelines.*

class SykdomstidslinjerTest {
    @BeforeEach internal fun reset() {
        resetSeed()
    }

    @Test internal fun `simple patterns`() {
        val tidslinje = 10.S
        assertEquals(10, tidslinje.size)
        assertEquals(10.januar, tidslinje.last().dato)
    }

    @Test internal fun `combinations`() {
        val tidslinje = 10.S + 5.F + 3.S
        assertEquals(18, tidslinje.size)
        assertEquals(18.januar, tidslinje.last().dato)
    }

}