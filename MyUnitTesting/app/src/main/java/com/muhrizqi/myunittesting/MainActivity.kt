package com.muhrizqi.myunittesting

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), MainView {

    internal lateinit var edtwidth: EditText
    internal lateinit var edtlenght: EditText
    internal lateinit var edtheight: EditText
    internal lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtwidth = findViewById(R.id.edt_width)
        edtlenght = findViewById(R.id.edt_hieght)
        edtheight = findViewById(R.id.edt_hieght)
        val btncalculate = findViewById<Button>(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        val presenter = MainPresenter(this)
        btncalculate.setOnClickListener {
            val length = edtlenght.text.toString().trim { it <= ' ' }
            val width = edtwidth.text.toString().trim { it <= ' ' }
            val height = edtheight.text.toString().trim { it <= ' ' }

            var isEmptyFields = false

            if (TextUtils.isEmpty(length)) {
                isEmptyFields = true
                edtlenght.error = "Field ini tidak boleh kososng"
            }
            if (TextUtils.isEmpty(width)) {
                isEmptyFields = true
                edtwidth.error = "Field ini tidak boleh kososng"
            }
            if (TextUtils.isEmpty(height)) {
                isEmptyFields = true
                edtheight.error = "Field ini tidak boleh kososng"
            }
            if (!isEmptyFields) {
                val l = java.lang.Double.parseDouble(length)
                val w = java.lang.Double.parseDouble(width)
                val h = java.lang.Double.parseDouble(height)

                presenter.calculateVolume(l, w, h)
            }
        }
    }

    override fun showVolume(model: MainModel) {
        tvResult.text = model.valume.toString()

    }

    class MainModel(val valume: Double)
}
