package com.atorrico.data_structures_algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class `5_FindDuplicateElementInLimitedRangeArrayTest` {

    @Test
    fun findDuplicateElementInLimitedRangeArrayByBruteForce_returnDuplicateValue(){
        val arr = arrayListOf( 1, 4, 3, 4, 2 )

        val expected = 4
        val actual = findDuplicateElementInLimitedRangeArrayByBruteForce(arr)

        assertEquals(expected, actual)
    }

    @Test
    fun findDuplicateElementInLimitedRangeArrayByHashing_returnDuplicateValue(){
        val arr = arrayListOf( 1, 4, 3, 4, 2 )

        val expected = 4
        val actual = findDuplicateElementInLimitedRangeArrayByHashing(arr)

        assertEquals(expected, actual)
    }

    @Test
    fun findDuplicateElementInLimitedRangeArrayBySet_returnDuplicateValue(){
        val arr = arrayListOf( 1, 4, 3, 4, 2 )

        val expected = 4
        val actual = findDuplicateElementInLimitedRangeArrayBySet(arr)

        assertEquals(expected, actual)
    }

    @Test
    fun findDuplicateElementInLimitedRangeArrayByXOR_returnDuplicateValue(){
        val arr = arrayListOf( 1, 4, 3, 4, 2 )

        val expected = 4
        val actual = findDuplicateElementInLimitedRangeArrayByXOR(arr)

        assertEquals(expected, actual)
    }
}