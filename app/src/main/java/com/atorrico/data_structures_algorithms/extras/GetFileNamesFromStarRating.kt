package com.atorrico.data_structures_algorithms.extras
/*
Have the function StarRating(str) take the str parameter being passed which will be an
average rating between 0.00 and 5.00, and convert this rating into a list of 5 image names
to be displayed in a user interface to represent the rating as a list of stars and half stars.
Ratings should be rounded to the nearest half. There are 3 image le names available:
"full.jpg", "half.jpg", "empty.jpg". The output will be the name of the 5 images (without the extension),
from left to right, separated by spaces.

For example: if str is "2.36"
So your program should return the string "full full half empty empty".
 */


/*
1. init an array with "empty" values
2. split the rating string and convert it to integer values
3. replace array values with "full" string
4. if there is a decimal number != 0 => replace one more item array with "half"
 */
fun getFileNamesFromStarRating(str: String): String{
    val arrayNames = arrayListOf("empty", "empty", "empty", "empty", "empty")

    val listString = str.split(".")
    val wholeNumber = listString.first().toInt()
    val decimalNumber = if (listString.size > 1) listString.last().toInt() else 0

    var j = 0
    for (i in 1..wholeNumber) {
        arrayNames[j] = "full"
        j++
    }

    if (decimalNumber > 0)
        arrayNames[j] = "half"

    return "${arrayNames[0]} ${arrayNames[1]} ${arrayNames[2]} ${arrayNames[3]} ${arrayNames[4]}"
}

fun main() {
    val str = "0"
    println(getFileNamesFromStarRating(str))
}