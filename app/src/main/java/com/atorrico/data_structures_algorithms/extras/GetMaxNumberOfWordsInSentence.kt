package com.atorrico.data_structures_algorithms.extras

/*
Write a function that given a string S consisting of N character, returns the maximum number of words
in a sentence
 */


fun getMaxNumberOfWordsInSentence(S: String): Int {
    val sentences = S.split(".", "?", "!")
    var maxWord = 0

    sentences.forEach { sentence ->
        val words = sentence.split("\\s+".toRegex()).filter { it != "" }

        if (words.size > maxWord) maxWord = words.size
    }

    return maxWord
}

fun main(){
    println(getMaxNumberOfWordsInSentence(
        "We test coders. Give us a try?"
    ))

    println(getMaxNumberOfWordsInSentence(
        "Forget CVs..Save time . x x"
    ))
}