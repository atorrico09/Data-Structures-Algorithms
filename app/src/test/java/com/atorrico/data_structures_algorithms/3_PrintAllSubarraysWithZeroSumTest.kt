package com.atorrico.data_structures_algorithms

import org.junit.Assert
import org.junit.Test

class `3_PrintAllSubarraysWithZeroSumTest` {
    @Test
    fun printAllSubarraysWithZeroSumTest_returnSubarrayFound() {
        val arr = arrayOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2)

        val expected = arrayListOf(
            arrayListOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2),
            arrayListOf(3, 4, -7),
            arrayListOf(4, -7, 3),
            arrayListOf(-7, 3, 1, 3),
            arrayListOf(3, 1, 3, 1, -4, -2, -2),
            arrayListOf(3, 1, -4)
        )
        val actual = printAllSubarraysWithZeroSumByBruteForce(arr)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun printAllSubarraysWithZeroSumTest_returnSubarrayNotFound() {
        val arr = arrayOf(3, 4, 7, 3, 1, 3, 1, 4, 2, 2)

        val expected: ArrayList<ArrayList<Int>> = arrayListOf()

        val actual = printAllSubarraysWithZeroSumByBruteForce(arr)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun printAllSubarraysWithZeroSumByMultimapTest_returnSubarraysFound() {
        val arr = arrayOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2)

        val expected = arrayListOf(
            arrayListOf(3, 4, -7),
            arrayListOf(4, -7, 3),
            arrayListOf(-7, 3, 1, 3),
            arrayListOf(3, 1, -4),
            arrayListOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2),
            arrayListOf(3, 1, 3, 1, -4, -2, -2)
        )
        val actual = printAllSubarraysWithZeroSumByMultimap(arr)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun printAllSubarraysWithZeroSumByMultimapTest_returnSubarraysNotFound() {
        val arr = arrayOf(3, 4, 7, 3, 1, 3, 1, 4, 2, 2)

        val expected: ArrayList<ArrayList<Int>> = arrayListOf()
        val actual = printAllSubarraysWithZeroSumByMultimap(arr)

        Assert.assertEquals(expected, actual)
    }
}