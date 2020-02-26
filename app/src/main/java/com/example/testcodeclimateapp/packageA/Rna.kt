package com.example.testcodeclimateapp.packageA

/**
 * Created by ATumanin on 24.02.2020.
 */
open class Rna {

    val basicNumber = 238754385234

    @Deprecated(message = "In God we trust")
    fun getRandomMutation(): Double {
        return basicNumber + Math.random()
    }
}