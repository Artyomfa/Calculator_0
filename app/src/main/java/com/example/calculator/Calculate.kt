package com.example.calculator

import kotlinx.android.synthetic.main.activity_main.*

class Calculate {
    public var first_number: Double = 0.0
    public var second_number: Double = 0.0
    public var action: String = ""

    public val window = MainActivity() // todo вообще, лучше так не делать, андроид не любит, когда сами вьюшки между классами перекидываются. Да, я вижу, что эта переменная в методах, которые не вызываются, но в целом на будущее
    public fun clean(){
        first_number = 0.0
        second_number = 0.0
        action = ""
    }
    public fun plus(){
        first_number += second_number
    }
    public fun minus(){
        first_number -= second_number
    }
    public fun mul(){
        first_number *= second_number
    }
    public fun div(){
        first_number /= second_number
    }

    public fun sum(){
        if (window.enter == "")
            second_number = 0.0
        else
            second_number = window.enter.toDouble()
        fixvalue()
    }
    public fun multy(){
        if (window.enter == "")
            second_number = 1.0
        else
            second_number = window.enter.toDouble()
        fixvalue()
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