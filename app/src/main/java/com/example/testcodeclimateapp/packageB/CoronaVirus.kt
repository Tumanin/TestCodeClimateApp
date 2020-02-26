package com.example.testcodeclimateapp.packageB

import com.example.testcodeclimateapp.packageA.Monster

/**
 * Created by ATumanin on 26.02.2020.
 */
class CoronaVirus {

    var monster: Monster? = null

    fun becomeMonster() {
        monster = Monster(false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            10,
            10)

        monster?.doEvolution()
        monster?.coronaVirus = this
    }
}