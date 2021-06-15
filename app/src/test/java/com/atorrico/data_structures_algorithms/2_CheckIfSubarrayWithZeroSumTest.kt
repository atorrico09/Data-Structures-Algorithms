package com.atorrico.data_structures_algorithms

import junit.framework.Assert.assertEquals
import org.junit.Test

class `2_CheckIfSubarrayWithZeroSumTest` {

    @Test
    fun checkIfSubarrayWithZeroSumByBruteForce_returnTRUE(){
        val arr = arrayOf(1, 5, 2, -2, 9)

        val actual = checkIfSubarrayWithZeroSumByBruteForce(arr)

        assertEquals(actual, true)
    }

    @Test
    fun checkIfSubarrayWithZeroSumByBruteForce_returnFALSE(){
        val arr = arrayOf(1, 5, 2, 2, 9)

        val actual = checkIfSubarrayWithZeroSumByBruteForce(arr)

        assertEquals(actual, false)
    }

    @Test
    fun checkIfSubarrayWithZeroSumByHashing_returnTRUE(){
        val arr = arrayOf(4, 1, -5, 2, 2, 9)

        val actual = checkIfSubarrayWithZeroSumByHashing(arr)

        assertEquals(actual, true)
    }

    @Test
    fun checkIfSubarrayWithZeroSumByHashing_returnFALSE(){
        val arr = arrayOf(-1, 5, 2, 2, 9, -1)

        val actual = checkIfSubarrayWithZeroSumByHashing(arr)

        assertEquals(actual, false)
    }

    @Test
    fun checkIfSubarrayWithGivenSumByHashing_returnTRUE(){
        val arr = arrayOf(4, 1, -5, 2, 2, 9)
        val sum = 13

        val actual = checkIfSubarrayWithGivenSumByHashing(arr, sum)

        assertEquals(actual, true)
    }

    @Test
    fun checkIfSubarrayWithGivenSumByHashing_returnFALSE(){
        val arr = arrayOf(-1, 5, 2, 2, 9, -1)
        val sum = 0

        val actual = checkIfSubarrayWithGivenSumByHashing(arr, sum)

        assertEquals(actual, false)
    }
}