package com.example.testcodeclimateapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment

/**
 * Created by ATumanin on 24.02.2020.
 */
open class AppFragment : Fragment(){

    val count = 10
    var anotherCOUNT: Int? = null
    var name = "name"
    var lastname: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        letCount()
    }

    fun letCount(): Int {
        var newInt = 0
        if(anotherCOUNT ?: 0 > 0) {
            newInt = 1
            if(lastname?.equals("lastname") == true) {
                newInt = 2
            }
            if(lastname?.equals("name") == true) {
                newInt = 3
            }
        } else {
            newInt = 4
        }
        when (newInt) {
            0 -> return 5
            1 -> return 6
            2 -> return 7
            else -> return 8
        }
    }
}