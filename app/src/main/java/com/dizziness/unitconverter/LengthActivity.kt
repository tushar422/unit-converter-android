package com.dizziness.unitconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_length.*


class LengthActivity : AppCompatActivity() {
    companion object{
        val units = listOf("Millimeter","Centimeter","Inches","Metres","Feet","Miles","")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)

        with(insertBox){
            addTextChangedListener {
                val y :Double = try {                   // stores meters
                    it.toString().toDouble()
                }catch (e: Exception){
                    0.0
                }                       // cm , yd, km , mile
                cm_converted_output.text = "${"%.4f".format(y * 100)} cms";
                yard_converted_output.text = "${"%.4f".format(y * 1.094)} yards";
                km_converted_output.text = "${"%.4f".format(y / 1000)} kms";
                mile_converted_output.text = "${"%.4f".format(y / 1609)} miles";

            }


        }



        img_btn_weight.setOnClickListener {
            val intent = Intent(this, WeightActivity::class.java)
            startActivity(intent)
        }
        img_btn_time.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
        }
        img_btn_temp.setOnClickListener {
            val intent = Intent(this, TempActivity::class.java)
            startActivity(intent)
        }
    }
}