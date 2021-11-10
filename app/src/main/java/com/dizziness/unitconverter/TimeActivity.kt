package com.dizziness.unitconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_time.*


class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        with(insertBox){
            addTextChangedListener {
                val y :Double = try {
                    it.toString().toDouble()
                }catch (e: Exception){
                    0.0                                             // ms, s , min, hr
                }
                msec_converted_output.text = "${"%.4f".format(y * 1000)} ms";
                sec_converted_output.text = "${"%.4f".format(y * 1)} s";
                min_converted_output.text = "${"%.4f".format(y / 60)} mins";
                hour_converted_output.text = "${"%.4f".format(y / 3600)} hrs";

            }


        }

        img_btn_weight.setOnClickListener {
            val intent = Intent(this, WeightActivity::class.java)
            startActivity(intent)
        }
        img_btn_length.setOnClickListener {
            val intent = Intent(this, LengthActivity::class.java)
            startActivity(intent)
        }
        img_btn_temp.setOnClickListener {
            val intent = Intent(this, TempActivity::class.java)
            startActivity(intent)
        }
    }

}