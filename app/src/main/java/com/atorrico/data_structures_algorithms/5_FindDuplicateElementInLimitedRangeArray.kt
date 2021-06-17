package com.atorrico.data_structures_algorithms

/*
Given a limited range array of size n and containing elements
between 1 and n-1 with one element repeating,
find the duplicate number in it without using any extra space

Input:  { 1, 2, 3, 4, 4 }
Output: The duplicate element is 4

Input:  { 1, 2, 3, 4, 2 }
Output: The duplicate element is 2
 */

/*
1. iterate each element
2. compare with others elements in array
3. if some element is equals => return the duplicate element
 */
fun findDuplicateElementInLimitedRangeArrayByBruteForce(arrayList: ArrayList<Int>): Int? {
    arrayList.forEachIndexed { index, i ->
        arrayList.forEachIndexed { index2, i2 ->
            if (index != index2) {
                if (i == i2)
                    return i
            }
        }
    }

    return null
}

fun findDuplicateElementInLimitedRangeArrayByHashing(arrayList: ArrayList<Int>): Int? {
    val hashMap: HashMap<Int, Int> = HashMap()

    arrayList.forEachIndexed { index, i ->
        if (hashMap.containsValue(i))
            return i
        else
            hashMap[index] = i
    }

    return null
}

fun findDuplicateElementInLimitedRangeArrayBySet(arrayList: ArrayList<Int>): Int? {
    val set = mutableSetOf(0)

    arrayList.forEach {
        if (!set.add(it)) return it
    }

    return null
}


fun findDuplicateElementInLimitedRangeArrayByXOR(arrayList: ArrayList<Int>): Int {
    var x = 0

    arrayList.forEach {
        x = x.xor(it)
    }

    for (i in 1 until arrayList.size) {
        x = x.xor(i)
    }

    return x
}


fun main() {
    val arr = arrayListOf( 1, 4, 3, 4, 2 )
//    val arr = arrayListOf(1, 3, 2, 4, 7, 6, 5, 2)

    val result = findDuplicateElementInLimitedRangeArrayByXOR(arr)

    println("The duplicated element is $result")
}