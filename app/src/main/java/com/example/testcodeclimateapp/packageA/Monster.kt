package com.example.testcodeclimateapp.packageA

import android.util.Log
import androidx.annotation.StringRes
import com.example.testcodeclimateapp.packageB.CoronaVirus

/**
 * Created by ATumanin on 24.02.2020.
 */
open class Monster(val leftEye: Boolean,
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
              val health: Int
) : TRex,
    Mammut,
    KomodoDragon,
    Crocodile,
    Snake,
    Bear,
    Tiger,
    Shark,
    Camel,
    Eagle,
    Rna() {

    var coronaVirus: CoronaVirus? = null

    fun scaryPeople() {
        Log.d("Monster", "R-r-r-r-r!!!")
    }

    fun getEatenPeople(): List<String>? {
        return null
    }

    fun doYouHaveAnyTeeth(): Boolean {
        return if (leftFang || rightFang) true else false
    }

    fun doEvolution() {
        var newRna = getRandomMutation()
        depend()
    }

    fun depend() {
        coronaVirus = CoronaVirus()
        coronaVirus?.monster = this
    }

    fun duplicate() {
        var one = 1
        var two = 2
        var three = one + two
    }
}