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
            newTextFields(enter)
        }
        btn_1.setOnClickListener{

            enter += "1"
            setTextFields("1")
            newTextFields(enter)
        }
        btn_2.setOnClickListener{
            enter += "2"
            setTextFields("2")
            newTextFields(enter)
            //enter += "2"
        }
        btn_3.setOnClickListener{

            setTextFields("3")
            enter += "3"
            newTextFields(enter)
        }
        btn_4.setOnClickListener{
            setTextFields("4")
            enter += "4"
            newTextFields(enter)
        }
        btn_5.setOnClickListener{
            setTextFields("5")
            enter += "5"
            newTextFields(enter)
        }
        btn_6.setOnClickListener{
            setTextFields("6")
            enter += "6"
            newTextFields(enter)
        }
        btn_7.setOnClickListener{
            setTextFields("7")
            enter += "7"
            newTextFields(enter)
        }
        btn_8.setOnClickListener{
            setTextFields("8")
            enter += "8"
            newTextFields(enter)
        }
        btn_9.setOnClickListener{
            setTextFields("9")
            enter += "9"
            newTextFields(enter)
        }
        btn_point.setOnClickListener(){
            setTextFields(".")
            enter += "."
            newTextFields(enter)
        }
        btn_plus.setOnClickListener{
            if (enter == "")
                calculate.second_number = 0.0
            else
                calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            //calculate.mul()calculate.plus()
            testview.text = calculate.first_number.toString()
            testsecond.text = calculate.second_number.toString()
            //testview.text = enter
            enter = ""
            if(calculate.action != "")
                newTextFields(calculate.first_number.toString())
            calculate.action = "+"

        }
        btn_minus.setOnClickListener{
            if (enter == "")
                calculate.second_number = 0.0
            else
                calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            //calculate.mul()calculate.minus()
            //testview.text = calculate.first_number.toString()
            //testsecond.text = calculate.second_number.toString()
            //testview.text = enter
           // flag = true
            enter = ""
            if(calculate.action != "")
                newTextFields(calculate.first_number.toString())
            calculate.action = "-"
        }
        btn_mul.setOnClickListener{
            if (enter == "")
                calculate.second_number = 1.0
            else
                calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            //calculate.mul()

           // testview.text = calculate.first_number.toString()
           // testsecond.text = calculate.second_number.toString()
            //testview.text = enter
            enter = ""
            if(calculate.action != "")
                newTextFields(calculate.first_number.toString())
            calculate.action = "*"
        }
        btn_div.setOnClickListener{
            if (enter == "")
                calculate.second_number = 1.0
            else
                calculate.second_number = enter.toDouble()
            if (calculate.second_number != 0.0)
                calculate.fixvalue()
            else
                resultField.text = "ERROR"
            //calculate.mul()calculate.div()
          //  testview.text = calculate.first_number.toString()
          ///  testsecond.text = calculate.second_number.toString()
            //testview.text = enter
            enter = ""
            if(calculate.action != "")
                newTextFields(calculate.first_number.toString())
            calculate.action = "/"
        }
        btn_eq.setOnClickListener{
           /* resultField.text = calculate.first_number.toString()
            if (enter == "")
                calculate.second_number = 0.0
            else
                calculate.second_number = enter.toDouble()
            calculate.eq()
          //  testview.text = calculate.first_number.toString()
       //     testsecond.text = calculate.second_number.toString()
            //testview.text = enter
            enter = ""
*/
            calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            newTextFields(calculate.first_number.toString())
            calculate.action = ""
            //enter = operationField.text.toString()
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
        resultField.text = ""
        resultField.text = str
    }

    private fun setTextFields(str: String) {
            resultField.append(str)
    }
}