package com.muhrizqi.myunittesting

import com.muhrizqi.myunittesting.MainActivity.MainModel

class MainPresenter internal constructor(private val view: MainView) {

    fun volume(length: Double, width: Double, height: Double): Double {
        return length * width * height
    }

    fun calculateVolume(length: Double, width: Double, height: Double) {
        val volume = volume(length, width, height)
        val model = MainModel(volume)
        view.showVolume(model)
    }
}
