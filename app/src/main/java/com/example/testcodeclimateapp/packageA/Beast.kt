package com.example.testcodeclimateapp.packageA

import android.util.Log

/**
 * Created by ATumanin on 24.02.2020.
 */
class Beast : Monster(true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    10,
    10), Tiger, TRex {

    fun killEverything() {
        Log.d("Beast", "Everything is killed")
    }
}