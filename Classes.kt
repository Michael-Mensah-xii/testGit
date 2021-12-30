package com.example.kotlinproject1
//creating  class
class Classes {
    val studentNum = 30
    val readingLvl = "10th grade reading level."
    val expressiveness = "very expressive in their reasoning."
}

// Creating an Instance of the class
fun main(){
    println("\n--Instance of the class Classes--")
    val class4 = Classes()
    println("class number = ${class4.studentNum}")
    println(class4.readingLvl)
    println(class4.expressiveness)
}