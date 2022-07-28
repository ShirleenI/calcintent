package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd: Button
    lateinit var firstnumber: EditText
    lateinit var secondnumber: EditText
    lateinit var textanswer: TextView
    lateinit var Buttonsub: Button
    lateinit var Buttonmult: Button
    lateinit var Buttondiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Buttonadd = findViewById(R.id.add)
        Buttonsub = findViewById(R.id.btn_sub)
        Buttonmult = findViewById(R.id.Btn_mult)
        Buttondiv = findViewById(R.id.Btn_div)

        Buttonadd.setOnClickListener {
            var firstnum = firstnumber.text.toString()
            var secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please fill all the details"


            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                textanswer.text = answer.toString()

            }
        }
        Buttonsub.setOnClickListener {
            var firstnum = firstnumber.text.toString()
            var secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please fill all the details"
            } else {
                var answer = firstnum.toDouble() - secondnum.toDouble()
                textanswer.text = answer.toString()
            }
            Buttonmult.setOnClickListener {
                var firstnum = firstnumber.text.toString()
                var secondnum = secondnumber.text.toString()
                if (firstnum.isEmpty() && secondnum.isEmpty()) {
                    textanswer.text = "please fill all the details"
                } else {
                    var answer = firstnum.toDouble() * secondnum.toDouble()
                    textanswer.text = answer.toString()
                }
                Buttondiv.setOnClickListener {
                    var firstnum = firstnumber.text.toString()
                    var secondnum = secondnumber.text.toString()
                    if (firstnum.isEmpty() && secondnum.isEmpty()) {
                        textanswer.text = "please fill all the details"
                    } else {
                        var answer = firstnum.toDouble() / secondnum.toDouble()
                        textanswer.text = answer.toString()
                    }

                }
            }
        }
    }
}

