package com.example.calculator

class Calculate {
    public var first_number: Double = 0.0
    public var second_number: Double = 0.0
    public var action: String = ""
    public val window = MainActivity()
    public fun plus(){
        action = "+"
        println(window.enter)
      //  first_number = window.enter.toDouble()
       // window.enter = ""
       // println(first_number)
    }
    public fun minus(){
        action = "-"
     //   first_number = window.enter.toDouble()
      //  window.enter = ""
      //  println(first_number)
    }
    public fun mul(){
        action = "*"
        //first_number = window.enter.toDouble()
      //  window.enter = ""
      //  println(first_number)
    }
    public fun div(){
        action = "/"
        first_number = window.enter.toDouble()
     //   window.enter = ""
     //   println(first_number)
    }
    public fun eq(){

    }
}