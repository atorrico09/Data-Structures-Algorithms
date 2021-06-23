package com.atorrico.data_structures_algorithms

import com.atorrico.data_structures_algorithms.extras.getFileNamesFromStarRating
import org.junit.Assert.assertEquals
import org.junit.Test

class GetFileNamesFromStarRatingTest {

    @Test
    fun getFileNamesFromStarRating_withZeroRating_returnFileName(){
        val rat = "0.6"

        val expected = "half empty empty empty empty"
        val actual = getFileNamesFromStarRating(rat)

        assertEquals(expected, actual)
    }

    @Test
    fun getFileNamesFromStarRating_withNonZeroRating_returnFileName(){
        val rat = "4.3"

        val expected = "full full full full half"
        val actual = getFileNamesFromStarRating(rat)

        assertEquals(expected, actual)
    }

    @Test
    fun getFileNamesFromStarRating_withNonDecimalRating_returnFileName(){
        val rat = "5"

        val expected = "full full full full full"
        val actual = getFileNamesFromStarRating(rat)

        assertEquals(expected, actual)
    }
}