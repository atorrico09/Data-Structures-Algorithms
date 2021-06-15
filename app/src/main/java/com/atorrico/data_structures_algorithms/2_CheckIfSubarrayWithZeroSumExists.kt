package com.atorrico.data_structures_algorithms

import kotlin.math.abs


/*
Check if a subarray with 0 contiguous sum exists or not
Given an integer array, check if it contains a subarray having zero-sum

Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
Output: Subarray with zero-sum exists

The subarrays with a sum of 0 are:
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 1, -4 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

 */

/*
Brute Force solution = O(n*log(n)) ?
1. iterate each element
2. sum with followings ones
3. if sum == 0 => return true
   if sum != 0 => continue adding up until end of array
*/

fun checkIfSubarrayWithZeroSumByBruteForce(array: Array<Int>): Boolean {
    array.forEachIndexed { index, i ->
        var sum = i

        var lowIndex = index + 1
        val highIndex = array.size

        while (lowIndex < highIndex) {
            sum += array[lowIndex]

            if (sum == 0) {
                return true
            }

            lowIndex++
        }
    }

    return false
}

/*
Hashing solution = O(n)
1. iterate each element
2. sum elements so far
3. check if the sum exist in Set => return true (because the sum == 0 reset the total sum to a previous value)
         if not => add the sum into the Set

 */
fun checkIfSubarrayWithZeroSumByHashing(array: Array<Int>): Boolean {
    val set = mutableSetOf(0)
    var sum = 0

    array.forEach {
        sum += it

        if (set.contains(sum)) {
            return true
        }

        set.add(sum)
    }

    return false
}

/*
Extended Solution for non-zero sum
 */
fun checkIfSubarrayWithGivenSumByHashing(array: Array<Int>, sumParam: Int): Boolean {
    val set = mutableSetOf(0)
    var sum = 0

    array.forEach {
        sum += it
        val diff = abs(sumParam - sum)

        if (set.contains(diff)) {
            return true
        }

        set.add(sum)
    }

    return false
}


fun main() {
    val arr = arrayOf(3, 10, 12, -5, -1)
    val sum = -60
//    val arr = arrayOf(3, 4, 7, 3, 1, 3, 1, 4, 2, 2)

    val result = checkIfSubarrayWithGivenSumByHashing(arr, sum)

    if (result)
        println("Subarray with sum exists")
    else
        println("Subarray with sum NOT exists")
}