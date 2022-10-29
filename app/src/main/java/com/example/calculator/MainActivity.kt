package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public var enter: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculate = Calculate()

        setContentView(R.layout.activity_main)
        btn_0.setOnClickListener{
            setTextFields("0")
            enter += "0"
        }
        btn_1.setOnClickListener{
            setTextFields("1")
            enter += "1"
        }
        btn_2.setOnClickListener{
            setTextFields("2")
            enter += "2"
        }
        btn_3.setOnClickListener{
            setTextFields("3")
            enter += "3"
        }
        btn_4.setOnClickListener{
            setTextFields("4")
            enter += "4"
        }
        btn_5.setOnClickListener{
            setTextFields("5")
            enter += "5"
        }
        btn_6.setOnClickListener{
            setTextFields("6")
            enter += "6"
        }
        btn_7.setOnClickListener{
            setTextFields("7")
            enter += "7"
        }
        btn_8.setOnClickListener{
            setTextFields("8")
            enter += "8"
        }
        btn_9.setOnClickListener{
            setTextFields("9")
            enter += "9"
        }
        btn_point.setOnClickListener(){
            setTextFields(".")
            enter += "."
        }
        btn_plus.setOnClickListener{
            calculate.second_number = enter.toDouble()
            calculate.plus()
            testview.text = enter
            enter = ""
        }
        btn_minus.setOnClickListener{
            calculate.second_number = enter.toDouble()
            calculate.minus()
            testview.text = enter
            enter = ""
        }
        btn_mul.setOnClickListener{
            calculate.second_number = enter.toDouble()
            calculate.mul()
            testview.text = enter
            enter = ""
        }
        btn_div.setOnClickListener{
            calculate.second_number = enter.toDouble()
            calculate.div()
            testview.text = enter
            enter = ""
        }
        btn_eq.setOnClickListener{
            calculate.second_number = enter.toDouble()
            calculate.eq()
            testview.text = enter
            enter = ""
            resultField.text = calculate.first_number.toString()
        }
    }

    fun enter_number(str: String){
        if (enter == "")
            enter = str
        else
            enter += str
      //  testview.text = enter

    }

    fun newTextFields(str: String) {
        resultField.text = "0"
        resultField.text = str
    }

    private fun setTextFields(str: String) {
        resultField.append(str)
    }
}