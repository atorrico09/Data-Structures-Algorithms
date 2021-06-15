package com.atorrico.data_structures_algorithms.util

class CustomHashMap<A, B> {

    private var values: MutableList<Pair<A, B>> = mutableListOf()

    fun get(key: A): B?{
        for (pair in values){
            if (pair.first == key){
                return pair.second
            }
        }
        return null
    }

    fun put(key: A, value: B){
        val myPair = Pair(key, value)

        //replace pair inserted with key duplicated
        for ((index,pair) in values.iterator().withIndex()){
            if (pair.first == key){
                values[index] = myPair
                return
            }
        }

        values.add(myPair)
    }
}