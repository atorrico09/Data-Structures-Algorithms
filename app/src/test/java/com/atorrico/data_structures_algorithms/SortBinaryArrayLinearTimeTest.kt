package com.atorrico.data_structures_algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class SortBinaryArrayLinearTimeTest {

    @Test
    fun sortBinaryArrayInLinearTimeByBruteForce_returnNumbersSorted(){
        val array = arrayListOf(1, 0, 1, 0, 1, 0, 0, 1)

        val expected = arrayListOf(0, 0, 0, 0, 1, 1, 1, 1)
        val actual = sortBinaryArrayInLinearTimeByBruteForce(array)

        assertEquals(expected, actual)
    }

    @Test
    fun sortBinaryArrayInLinearTimeByBruteForceWithIndex_returnNumbersSorted(){
        val array = arrayListOf(1, 0, 1, 0, 1, 0, 0, 1)

        val expected = arrayListOf(0, 0, 0, 0, 1, 1, 1, 1)
        val actual = sortBinaryArrayInLinearTimeByBruteForceWithIndex(array)

        assertEquals(expected, actual)
    }

    @Test
    fun sortBinaryArrayInLinearTimeByQuickSortPartition_returnNumbersSorted(){
        val array = arrayListOf(1, 0, 1, 0, 1, 0, 0, 1)

        val expected = arrayListOf(0, 0, 0, 0, 1, 1, 1, 1)
        val actual = sortBinaryArrayInLinearTimeByQuickSortPartition(array)

        assertEquals(expected, actual)
    }

    @Test
    fun sortEvenAndOddNumbersInLinearTimeByQuickSortPartition_returnNumbersSorted(){
        val array = arrayListOf(2, 5, 8, 45, 3, 0, 6, 32)

        val expected = arrayListOf(2, 8, 0, 6, 32, 5, 45, 3)
        val actual = sortEvenAndOddNumbersInLinearTimeByQuickSortPartition(array)

        assertEquals(expected, actual)
    }
}