package com.example.calculator

import kotlinx.android.synthetic.main.activity_main.*

class Calculate {
    public var first_number: Double = 0.0
    public var second_number: Double = 0.0
    public var action: String = ""

    public val window = MainActivity()
    public fun plus(){
        first_number += second_number
      /*  if (window.enter == "")
            second_number = 0.0
        else
            second_number = window.enter.toDouble()
        plus()
        window.testview.text = second_number.toString()
        //testview.text = enter
        window.enter = ""*/
    //println(window.enter)
        //first_number = window.enter.toDouble()

       // println(first_number)
    }
    public fun minus(){
        first_number -= second_number

        //first_number = window.enter.toDouble()

      //  println(first_number)
    }
    public fun mul(){
        first_number *= second_number
        //fixvalue()

       // first_number = window.enter.toDouble()

      //  println(first_number)
    }
    public fun div(){
        first_number /= second_number
       // fixvalue()

       // first_number = window.enter.toDouble()
       // window.resultField.text = first_number.toString()
     //   println(first_number)
    }
    public fun eq(){

    }
    public fun fixvalue(){
        if(action == "")
            first_number = second_number
        else if(action == "+")
            plus()
        else if(action == "-")
            minus()
        else if(action == "*")
            mul()
        else if(action == "/")
            div()
        second_number = 0.0
    }
}