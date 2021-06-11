package com.atorrico.data_structures_algorithms

import junit.framework.Assert.assertEquals
import org.junit.Test

class CustomHashMapTest {
    @Test
    fun insertNewValueWithDuplicateKey_returnLastValueInserted() {
        val expected = CustomHashMap<Int, Int>()
        expected.put(1, 1234)
        expected.put(1, 7889)

        assertEquals(expected.get(1), 7889)
    }
}