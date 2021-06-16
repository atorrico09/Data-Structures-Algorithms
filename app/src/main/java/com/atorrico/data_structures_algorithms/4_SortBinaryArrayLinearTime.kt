package com.atorrico.data_structures_algorithms

/*
Sort binary array in linear time
Given a binary array, sort it in linear time and constant space.
The output should print all zeroes, followed by all ones.

Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }

Output: { 0, 0, 0, 0, 1, 1, 1, 1 }
 */


/*
1. count zero numbers in array
2. fill new array with same amount of zeros followed by ones
Time complexity: O(n)
 */
fun sortBinaryArrayInLinearTimeByBruteForce(arrayList: ArrayList<Int>): ArrayList<Int> {
    val newArrayList: ArrayList<Int> = ArrayList()
    var zeros = 0

    arrayList.forEach {
        if (it == 0)
            zeros++
    }

    var i = arrayList.size
    while (i > 0) {
        if (zeros > 0)
            newArrayList.add(0)
        else
            newArrayList.add(1)

        zeros--
        i--
    }

    return newArrayList
}

/*
1. define a new array with same size as original array and fill with zeroes
2. traverse original array
3. define endIndex with original array size
3. if element == 1 => replace 0 by 1 at the end of new array, then decrement endIndex
Time complexity: O(n)
 */
fun sortBinaryArrayInLinearTimeByBruteForceWithIndex(arrayList: ArrayList<Int>): List<Int> {
    val newArrayList = IntArray(arrayList.size) { 0 }
    var endIndex = arrayList.size - 1

    arrayList.forEach {
        if (it == 1) {
            newArrayList[endIndex] = 1
            endIndex--
        }
    }

    return newArrayList.asList()
}

/*
1. traverse the array
2. if element < 1 => swap positions with next index value (j)
3. return modified array
Time complexity: O(n)
 */
fun sortBinaryArrayInLinearTimeByQuickSortPartition(arrayList: ArrayList<Int>): ArrayList<Int> {
    val pivot = 1
    var j = 0

    arrayList.forEachIndexed { index, i ->
        if (i < pivot) {
            swap(arrayList, index, j)
            j++
        }
    }

    return arrayList
}

/*
Extended exercise
Rearrange even and odd numbers in an array in linear time
such that all even numbers come before all odd numbers
 */

fun sortEvenAndOddNumbersInLinearTimeByQuickSortPartition(arrayList: ArrayList<Int>): ArrayList<Int> {
    val pivot = 0
    var j = 0

    arrayList.forEachIndexed { index, i ->
        if (i % 2 == pivot) {
            swap(arrayList, index, j)
            j++
        }
    }

    return arrayList
}

fun swap(arrayList: ArrayList<Int>, index: Int, j: Int) {
    val temp = arrayList[index]
    arrayList[index] = arrayList[j]
    arrayList[j] = temp
}


fun main() {
//    val array = arrayListOf(1, 0, 1, 0, 1, 0, 0, 1)
    val array = arrayListOf(2, 5, 8, 45, 3, 0, 6, 32)

    val result = sortEvenAndOddNumbersInLinearTimeByQuickSortPartition(array)
    println(result.toString())
}