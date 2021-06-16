package com.atorrico.data_structures_algorithms

import com.atorrico.data_structures_algorithms.util.MultiMap


/*
Brute Force Solution
1. iterate each element
2. sum current element with rest of numbers in array until end (endIndex)
3. check if sum = 0  => save array and decrement endIndex
         if sum != 0 => decrement endIndex
4. save this new array and break loop
*/
fun printAllSubarraysWithZeroSumByBruteForce(arr: Array<Int>): ArrayList<ArrayList<Int>> {
    val resultArray: ArrayList<ArrayList<Int>> = arrayListOf()

    arr.forEachIndexed { index, i ->
        //reset endindex to start with next element in array
        var endIndex = arr.size - 1

        //start again with endindex decremented - 1
        while (index <= endIndex) {
            val subArray: ArrayList<Int> = arrayListOf(i)
            var sum = i

            //sum current element with following ones
            var nextIndex = index + 1
            while (nextIndex <= endIndex) {
                subArray.add(arr[nextIndex])
                sum += arr[nextIndex]
                nextIndex++
            }

            when {
                sum != 0 -> {
                    endIndex--
                }
                sum == 0 -> {
                    resultArray.add(subArray)
                    endIndex--
                }
            }
        }

    }
    return resultArray
}

fun printAllSubarraysWithZeroSumByMultimap(arr: Array<Int>): ArrayList<ArrayList<Int>> {
    val multiMap: MultiMap<Int, Int> = MultiMap()
    val resultArray: ArrayList<ArrayList<Int>> = arrayListOf()
    var subArray: ArrayList<Int> = arrayListOf()

    multiMap.put(0, -1)
    var sum = 0

    arr.forEachIndexed { index, i ->
        sum += i

        if (multiMap.containsKey(sum)) {
            multiMap[sum]!!.forEach {
                //add elements with sum == 0 from start index until end index
                for (j in it + 1..index) {
                    subArray.add(arr[j])
                }
                resultArray.add(subArray)
                subArray = arrayListOf()
            }
        }

        multiMap.putIfAbsent(sum, index)
    }

    return resultArray
}


fun main() {
    val arr = arrayOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2)
//    val arr = arrayOf(4, 2, 3, 1, 0, 4)

    val result = printAllSubarraysWithZeroSumByMultimap(arr)

    result.forEach {
        println(it.toString())
    }

}

