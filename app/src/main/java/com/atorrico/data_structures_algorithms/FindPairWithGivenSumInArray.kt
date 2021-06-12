package com.atorrico.data_structures_algorithms

/*
Find a pair with the given sum in an array:
Given an unsorted integer array, find a pair with the given sum in it

Input:
arr = [8, 7, 2, 5, 3, 1]
sum = 10

Output:
Pair found (8, 2)
or
Pair found (7, 3)

Input:
arr = [5, 2, 6, 8, 1, 9]
sum = 12

Output: Pair not found
*/


/*
Brute-Force Solution = O(n^2)
1. iterate each number
2. sum with others values in array
3. validate if its sum is equals to given sum
 */
fun findPairByBruteForce(arr: Array<Int>, sum: Int): Pair<Int, Int>? {
    for ((index, value) in arr.withIndex()) {
        for ((index2, value2) in arr.withIndex()) {
            if (index != index2) {
                val currentSum = value + value2
                if (currentSum == sum) {
                    return Pair(value, value2)
                }
            }
        }
    }

    return null
}

/*
Sorting Solution = O(n*log(n))
1. Sort given array asc order
2. Maintain two indices (low and high)
3. Iterate comparing the sum of elements at these indices
4. Increment low if the sum is less than the expected.
   Decrement high if the sum is more than the expected
5. Return if the pair is found
 */
fun findPairBySorting(arr: Array<Int>, sum: Int): Pair<Int, Int>? {
    arr.sort()
    var lowIndex = 0
    var highIndex = arr.size - 1

    while (lowIndex != highIndex) {
        val currentSum = arr[lowIndex] + arr[highIndex]
        when {
            currentSum < sum -> lowIndex++
            currentSum > sum -> highIndex--
            currentSum == sum -> return Pair(arr[lowIndex], arr[highIndex])
        }
    }
    return null
}

/*
Hashing Solution = O(n)
1. iterate the array
2. check if difference exists in the hashmap
3. if exists return the pair, if not add the element to the hashmap
 */
fun findPairByHashing(arr: Array<Int>, sum: Int): Pair<Int, Int>? {
    val hashMap: HashMap<Int, Int> = HashMap()

    arr.forEachIndexed { i, element ->
        val diffValue = sum - element
        if (hashMap.containsValue(diffValue))
            return Pair(diffValue, element)
        else
            hashMap[i] = element
    }

    return null
}

/*
Hashing Solution Extended = O(n)
1. iterate the array
2. check if difference exists in the hashmap
3. if exists save the pair found, if not add the element to the hashmap
 */
fun findAllPairsByHashing(arr: Array<Int>, sum: Int): HashMap<Int, Int>? {
    val hashMap: HashMap<Int, Int> = HashMap()
    val myPairsFound: HashMap<Int, Int> = HashMap()

    arr.forEachIndexed { i, element ->
        val diffValue = sum - element
        if (hashMap.containsValue(diffValue))
            myPairsFound[diffValue] = element
        else
            hashMap[i] = element
    }

    return myPairsFound
}


fun main() {
    val arr = arrayOf(8, 7, 2, 5, 3, 1, 6)
    val sum = 8

//    val result = findPairByHashing(arr, sum)
//    if (result != null) {
//        println("Pair found (${result.first},${result.second})")
//    }

    val result = findAllPairsByHashing(arr, sum)
    result?.forEach {
        println("Pair found (${it.key},${it.value})")
    }

}