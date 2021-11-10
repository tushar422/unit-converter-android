package com.dizziness.unitconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_temp.*

class TempActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)

        with(insertBox){
            addTextChangedListener {
                val y :Double = try {
                    it.toString().toDouble()
                }catch (e: Exception){
                    0.0
                }
                celsius_converted_output.text = "${"%.4f".format(y * 1)} °C";
                farh_converted_output.text = "${"%.4f".format((y * 9.0/5.0)  + 32)} °F";
                kelvin_converted_output.text = "${"%.4f".format(y + 273.15)} K";


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
        img_btn_time.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
        }
    }
}