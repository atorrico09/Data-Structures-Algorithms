package com.atorrico.data_structures_algorithms

import junit.framework.Assert.assertEquals
import org.junit.Test

class `1_FindPairWithGivenSumInArrayTest` {
    @Test
    fun findPairByBruteForce_returnPairFound(){
        val arr = arrayOf(8, 7, 2, 5, 3, 1)
        val sum = 10

        val expected = Pair(8, 2)
        val actual = findPairByBruteForce(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findPairByBruteForce_returnPairNotFound(){
        val arr = arrayOf(5, 2, 6, 8, 1, 9)
        val sum = 12

        val expected = null
        val actual = findPairByBruteForce(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findPairBySorting_returnPairFound(){
        val arr = arrayOf(1, 2, 3, 5, 7, 8)
        val sum = 15

        val expected = Pair(7, 8)
        val actual = findPairBySorting(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findPairBySorting_returnNotFound(){
        val arr = arrayOf(1, 2, 3, 5, 7, 8)
        val sum = 2

        val expected = null
        val actual = findPairBySorting(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findPairByHashing_returnPairFound(){
        val arr = arrayOf(8, 7, 2, 5, 3, 1)
        val sum = 10

        val expected = Pair(8, 2)
        val actual = findPairByHashing(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findPairByHashing_returnPairNotFound(){
        val arr = arrayOf(8, 7, 2, 5, 3, 1)
        val sum = 2

        val expected = null
        val actual = findPairByHashing(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findAllPairsByHashing_returnPairsFound(){
        val arr = arrayOf(8, 7, 2, 5, 3, 1)
        val sum = 8

        val expected = hashMapOf(Pair(5, 3), Pair(7, 1))
        val actual = findAllPairsByHashing(arr, sum)

        assertEquals(expected, actual)
    }

    @Test
    fun findAllPairsByHashing_returnPairsNotFound(){
        val arr = arrayOf(8, 7, 2, 5, 3, 1)
        val sum = 2

        val expected = HashMap<Int, Int>()
        val actual = findAllPairsByHashing(arr, sum)

        assertEquals(expected, actual)
    }


}