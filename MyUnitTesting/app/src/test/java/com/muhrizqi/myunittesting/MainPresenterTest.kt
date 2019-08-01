package com.muhrizqi.myunittesting

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

import org.junit.Assert.*
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import com.muhrizqi.myunittesting.MainActivity.MainModel

@RunWith(MockitoJUnitRunner::class)
class MainPresenterTest {

    @Mock
    private var presenter: MainPresenter? = null
    private var view: MainView? = null

    @Before
    fun setup() {
        view = mock<MainView>(MainView::class.java)
        presenter = MainPresenter(view)
    }

    @Test
    fun testVolumeWithIntegerInput() {
        val volume = presenter!!.volume(2.0, 8.0, 1.0)
        assertEquals(16.0, volume, 0.0001)
    }

    @Test
    fun testVolumeWithDoubleInput() {
        val volume = presenter!!.volume(2.3, 8.1, 2.9)
        assertEquals(54.026999999999994, volume, 0.0001)
    }

    @Test
    fun testVolumewithZeroInput() {
        val volume = presenter!!.volume(0.0, 0.0, 0.0)
        assertEquals(0.0, volume, 0.0001)
    }

    @Test
    fun testcalculatevolume() {
        presenter!!.calculateVolume(11.1, 2.2, 1.0)
        verify<MainView>(view).showVolume(any(MainModel::class.java!!))
    }

}