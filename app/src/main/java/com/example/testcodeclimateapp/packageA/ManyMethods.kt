package com.example.testcodeclimateapp.packageA

/**
 * Created by ATumanin on 24.02.2020.
 */
open class ManyMethods {

    var eyesOpen = false
    var armsOpen = false
    var teethSharped = false
    var fingersRotated = false

    fun openEyes() {
        eyesOpen = true
    }

    fun closeEyes() {
        eyesOpen = false
    }

    fun openArms() {
        armsOpen = true
    }

    fun closeArms() {
        armsOpen = false
    }

    fun sharpTeeth() {
        teethSharped = true
    }

    fun rotateFinger() {
        fingersRotated = true
    }

    fun doNothing() {

    }
}