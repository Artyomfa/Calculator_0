package com.example.calculator

import kotlinx.android.synthetic.main.activity_main.*

class Calculate {
    var first_number: Double = 0.0
    var second_number: Double = 0.0
    var action: String = ""
    var current_action:String = ""

    fun clean(){
        first_number = 0.0
        second_number = 0.0
        action = ""
    }
    fun plus(){
        first_number += second_number
    }
    fun minus(){
        first_number -= second_number
    }
    fun mul(){
        first_number *= second_number
    }
    fun div(){
        first_number /= second_number
    }

    fun eq(){

    }

    fun fixvalue(){
        if(action == "")
            first_number = second_number
        else if(action == "+") {
            if (second_number == 1.0 && (current_action == "*" || current_action == "/"))
                second_number = 0.0
            plus()
        }
        else if(action == "-"){
            if (second_number == 1.0 && (current_action == "*" || current_action == "/"))
                second_number = 0.0
            minus()
        }

        else if(action == "*"){
            if (second_number == 0.0 && (current_action == "+" || current_action == "-"))
                second_number = 1.0
            mul()
        }

        else if(action == "/") {
            if (second_number == 0.0 && (current_action == "+" || current_action == "-"))
                second_number = 1.0
            div()
        }
        second_number = 0.0
    }
}