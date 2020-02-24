package com.example.testcodeclimateapp.packageA

import android.util.Log

/**
 * Created by ATumanin on 24.02.2020.
 */
class Monster(val leftEye: Boolean,
              val rightEye: Boolean,
              val leftEar: Boolean,
              val rightEar: Boolean,
              val tail: Boolean,
              val leftFrontPaw: Boolean,
              val rightFrontPaw: Boolean,
              val leftRearPaw: Boolean,
              val rightRearPaw: Boolean,
              val leftFang: Boolean,
              val rightFang: Boolean,
              val wool: Boolean,
              val Scales: Boolean,
              val claws: Boolean,
              val trunk: Boolean,
              val aggressiveness: Int,
              val health: Int) : TRex,
    Mammut,
    KomodoDragon,
    Crocodile,
    Snake,
    Bear,
    Tiger,
    Shark,
    Camel,
    Eagle {

    fun scaryPeople() {
        Log.d("Monster", "R-r-r-r-r!!!")
    }
}