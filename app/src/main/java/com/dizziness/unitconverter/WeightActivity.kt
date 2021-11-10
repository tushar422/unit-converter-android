package com.dizziness.unitconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_weight.*


class WeightActivity : AppCompatActivity() {
    companion object{
        val units = listOf("Milligrams","Grams","Kilograms","Pounds","Ounces","Tonnes")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)


        with(insertBox) {
            addTextChangedListener {
                val y: Double = try {
                    it.toString().toDouble()
                } catch (e: Exception) {
                    0.0
                }

//                gram_converted_output.text = "${"%.4f".format(y * 1000)} grams"
//                pound_converted_output.text = "${"%.4f".format(y * 2.205)} lbs"
//                ounce_converted_output.text = "${"%.4f".format(y * 35.274)} oz"
//                tonne_converted_output.text = "${"%.4f".format(y / 1000.0)} tonnes"

                


            }


        }

        img_btn_length.setOnClickListener {
            val intent = Intent(this, LengthActivity::class.java)
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