package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* // todo синтетика в андроиде уже не актуальна, в следующем задании хотелось бы видеть viewBinding

class MainActivity : AppCompatActivity() {
    public var enter: String = "" // todo студия подсвечивает, что тут обозначать public не обязательно
    public var output: String = ""// todo студия подсвечивает, что тут обозначать public не обязательно
    public var int_enter: Int = 0// todo студия подсвечивает, что тут обозначать public не обязательно
    public var dot: Boolean = false// todo студия подсвечивает, что тут обозначать public не обязательно
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculate = Calculate()

        setContentView(R.layout.activity_main)
        btn_0.setOnClickListener{
            check_zero()
            setTextFields("0")
            enter += "0"
            newTextFields(enter)
        }
        btn_1.setOnClickListener{
            check_zero()
            enter += "1"
           // setTextFields("1")
            newTextFields(enter)
        }
        btn_2.setOnClickListener{
            check_zero()
            enter += "2"
           // setTextFields("2")
            newTextFields(enter)
        }
        btn_3.setOnClickListener{
            check_zero()
           // setTextFields("3")
            enter += "3"
            newTextFields(enter)
        }
        btn_4.setOnClickListener{
            check_zero()
          //  setTextFields("4")
            enter += "4"
            newTextFields(enter)
        }
        btn_5.setOnClickListener{
            check_zero()
           // setTextFields("5")
            enter += "5"
            newTextFields(enter)
        }
        btn_6.setOnClickListener{
            check_zero()
           // setTextFields("6")
            enter += "6"
            newTextFields(enter)
        }
        btn_7.setOnClickListener{
            check_zero()
          //  setTextFields("7")
            enter += "7"
            newTextFields(enter)
        }
        btn_8.setOnClickListener{
            check_zero()
           // setTextFields("8")
            enter += "8"
            newTextFields(enter)

        }
        btn_9.setOnClickListener{
            check_zero()
         //   setTextFields("9")
            enter += "9"
            newTextFields(enter)
        }
        btn_point.setOnClickListener(){
         //   setTextFields(".")
            if (dot == false) {
                enter += "."
                newTextFields(enter)
                dot = true
            }
        }
        btn_plus.setOnClickListener{
            if (enter == "")
                calculate.second_number = 0.0
            else
                calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            enter = ""
            output = calculate.first_number.toString()
            check_int()
            if(calculate.action != "")
                //newTextFields(calculate.first_number.toString())
                newTextFields(output)
            calculate.action = "+"

        }
        btn_minus.setOnClickListener{
            if (enter == "")
                calculate.second_number = 0.0
            else
                calculate.second_number = enter.toDouble()
            calculate.fixvalue()

            enter = ""
            output = calculate.first_number.toString()
            check_int()
            if(calculate.action != "")
                //newTextFields(calculate.first_number.toString())
                newTextFields(output)
            calculate.action = "-"
        }
        btn_mul.setOnClickListener{
            if (enter == "")
                calculate.second_number = 1.0
            else
                calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            enter = ""
            output = calculate.first_number.toString()
            check_int()
            if(calculate.action != "")
                //newTextFields(calculate.first_number.toString())
                newTextFields(output)
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
            enter = ""
            output = calculate.first_number.toString()
            check_int()
            if(calculate.action != "")
               // newTextFields(calculate.first_number.toString())
                newTextFields(output)
            calculate.action = "/"
        }
        btn_eq.setOnClickListener{
            calculate.second_number = enter.toDouble()
            calculate.fixvalue()
            output = calculate.first_number.toString()
            check_int()
            newTextFields(output)
            //newTextFields(calculate.first_number.toString())
            calculate.action = ""
            enter = resultField.text.toString()
        }
        btn_clear.setOnClickListener{
            calculate.clean()
            resultField.text = ""
            enter = ""
        }
    }
    fun check_zero(){ //todo Данная функция должна быть private
        if (enter == "0") {
            enter = ""
            newTextFields("")
        }
    }
    fun check_int() { //todo Данная функция должна быть private
        if (output.substringAfter(".") == "0")
            output = output.substringBefore(".")
    }

    fun newTextFields(str: String) { //todo Данная функция должна быть private
        resultField.text = ""
        resultField.text = str
    }

    private fun setTextFields(str: String) {
            resultField.append(str)
    }
}