package com.example.kotlinproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// TESTING BASIC KOTLIN
// creating your main function
fun main() {
    println("First session!")

    // understanding diff b/n println and print
    println("this is a test")
    print("this is also a test 1 ")
    println("this is also a test 2 ")

    val sum = 100 * 5
    println("sum = " + sum)

    // TESTING ORDER OF EXECUTION
    println("my first")
    println("my second")
    println("my third")

    // practice
    print("I am ")
    print(2021 - 1999)
    print(" years old")

    // TESTING INITIALIZING KOTLIN VARIABLES
    // var mutable variable can be modified
    var currentWeather: String
    currentWeather = "\nSunny feels like 40 degrees"
    println(currentWeather)

    // val immutable variable constant cannot be modified
    val pi: Double
    pi = 3.14
    print(pi)

    // Type Inference
    var typeTest = true
    println("\n${typeTest::class.simpleName}")

    // Practice random song test
    var stillWoozy: String = "Lucy"
    println("Track name: " + stillWoozy)

    val lucy: Int = 4
    println("runtime: " + lucy + " minutes")

    var listeningNow: Boolean = false
    println("listening now ?: " + listeningNow)

    // String Concatenation practice
    val firstName = "Michael"
    val secondName = "Mensah"
    println(firstName + " " + secondName)

    // 2nd try without string templates
    val state = "Western Region"
    val population = 3000000
    val location = "Ghana"
    println(state + " " + "is located in " + " " + location + " " + "and has a population of" + " " + population + " " + "people.")


    // Using String templates
    val state1 = "Western Region"
    val population1 = 3000000
    val location1 = "Ghana"
    println("$state1 is located in  $location1 and has a population of $population1 people.")

    // Using built in properties
    // capitalize and length
    val name = "kotlin"
    println(name.capitalize())
    val wordSize = name.length
    println("$name has $wordSize letters and is a native android language")

    // Practicing Character escape sequences

    val escapeSequence =
        "my name is mike \nI am testing this sequence\nThis is a Thanos quote\" I am inevitable \" "
    println(escapeSequence)

    // Arithmetic operators
    // test to print restaurant receipt
    val fufu = 25.50
    val rice = 5
    val fanta = 3
    var tip = 0.18

    var total = fufu + rice + fanta

    var totalSum = total * tip + total
    println(totalSum)

    // Order of Operations
    var answer1 = 7 - 5 + 4 * 3
    var answer2 = (9 - 3) / 2
    var answer3 = (6 + 8) + (4 - 7)

    println(answer1)
    println(answer2)
    println(answer3)


    // Augmented Assignment Operators

    /*
Operation	Long Syntax	 Short Syntax
Add	         a = a + b    	a += b
Subtract     a = a - b	    a -= b
Multiply	 a = a * b	    a *= b
Divide	     a = a / b	    a /= b
Mod	         a = a % b	    a %= b
    */

    // example

    var ps5Price = 550
    ps5Price += 50

    println("The price of a Ps5 is $${ps5Price}.")

    var blabla = 200
    blabla -= 40
    println("blabla = $blabla")

    var mhn = 300
    mhn %= 400
    println("mhh = $mhn")

    var jfk = 2000.934
    jfk *= -6000
    println("jfk = $jfk")

    // Increment and Decrement Operators -- reduces by 1 , ++ increases by 1 useful for conditionals and loops
    var a = 5
    a += 6

    var b = a * 9
    var c = b / 3
    c++

    var d = c + 8
    d %= 4
    d--

    println("d = $d")

    // Conditionals
    // If expression
    var mathGrade = 80 - 20
    if (mathGrade >= 80) {
        println("Excellent")
    } else {
        println("Better luck next time")
    }

    // try 2
    var isRaining = true
    if (isRaining) {
        println("Remember to take an umbrella.")
    }

    // try 3
    var isHoliday = true
    var date: String

    if (isHoliday) {
        date = "25th"
    } else {
        date = "20th"
    }
    println("Tommorow is $date,December that's Christmas.")

    var gpa1 = false
    var firstClass: Double
    if (gpa1) {
        firstClass = 4.0
    } else {
        firstClass = 2.5
    }
    println("You had a $firstClass average, unfortunately that's not a first class gpa.")


    // Comparison Operators
    var gpa = 4.0
    if (gpa >= 3.5) {
        println("Congratulations you had a first class.")
    } else {
        println("Congratulations you had a second class.")
    }

    // try to find even and odd numbers
    var num1 = 10
    var num2 = 13
    if (num1 % 2 == 0) {
        println("$num1 is an even number.")
    }
    if (num2 % 2 != 0) {
        println("$num2 is an odd number.")
    }

    // Store member type check
    var rewardsPoints = 17
    var memberType: String

    if (rewardsPoints >= 50) {
        memberType = "Platinum"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }
    println("You are a $memberType type member.")


    // Logic operators

    var a1 = true
    var b1 = false
    var c1 = true
    var d1 = false

    if (a1 || b1) {
        println("Hoorah!")
    }

    if (!b1 && c1) {
        println("Woohoo!")
    }

    if (a1 || d1) {
        println("Yay!")
    }

    if (!(!d1 && b1)) {
        println("Wow!")
    }


    /*Order of Evaluation
    We can combine expressions containing logical operators to create even more complex Boolean expressions.
    When combining logical operators, the order of evaluation is as follows:
    1.Boolean expressions contained within parentheses
    2.NOT - !
    3.AND - &&
    4.OR - ||*/

    var expressionValue: Boolean
    expressionValue = false

    if (!true && (false && true || !false)) {
        println("Hello")
    } else {
        println("Goodbye")
    }
    println(expressionValue)
    /* (false  && true || !false)
     false && true || true
     false || true
     !true && true
     false && true
   */


    // Nested Conditionals
    var orbitsStar = true // Rule 1
    var hydrostaticEquilibrium = true // Rule 2
    var clearedOrbit = false // Rule 3

    if (orbitsStar && hydrostaticEquilibrium) {
        if (clearedOrbit) {
            println("Celestial body is a planet.")
        } else {
            println("Celestial body is a dwarf planet.")
        }
    }

    // CONDITIONAL EXPRESSIONS : when Expressions
    // when expression for meal schedule

    var meal = "breakfast"
    when (meal) {
        "breakfast" -> println("Have some porridge.")
        "lunch" -> println("Eat some plantain and beans.")
        "dinner" -> println("Eat some rice.")
        else -> println("Not a valid time to eat.")
    }

    // test 2
    var drakeTickets = 1000
    when {
        drakeTickets < 100 -> println("You sitting in the trenches boss")
        drakeTickets == 500 -> println("You aiight.")

        drakeTickets > 500 -> println("Oh you've got money money!")

        else -> println("You aint supposed to be here fam!")
    }



    // Range
    // test for phone tier using range
    var price=6000
    var tier:String

    if (price in 0..1200){
        tier = "budget mobile phone"
    }else if (price in 1500..2500){
        tier= "midrange mobile phone"
    }else if (price in 2600..9000){
        tier="Flagship mobile phone"
    }else {
        tier= "Category not included"
    }
    println("Your device is a $tier.")


    // 2 Pizza size and price using range
    var pizza = 150
    var priice: String
    if (pizza in 0..25) {
        priice = "Small Size Pizza!"
    } else if (pizza in 26..50) {
        priice = "Medium Size Pizza!"
    } else if (pizza in 60..1600) {
        priice = "Large Size Pizza!"
    } else {
        priice = "Special Order!"
    }
    println("Customer wants a $priice for $pizza cedis.")


    // Creating an Immutable List
    var localCuisine = listOf<String>("Banku", "Fufu", "Red Red")
    println(localCuisine)

    // test 2
    var eplTop3 = listOf<String>("Manchester City", "Chelsea", "and Liverpool")
    println("The top three teams in the EPL are $eplTop3.")

    // Accessing index of a list NB:items in a list start numerically from 0.
    println(eplTop3[2])//prints out the 3rd team.

    // Creating a Mutable List
    var goodMovies = mutableListOf<String>("Avengers","Cat in the hat","I care a lot")
    goodMovies[2]= "Lorax"
    println(goodMovies)

    // The size Property
    var majorCities = mutableListOf<String>("Sekondi-Takoradi","Cape-Coast","Accra","Tema","Ho","Kumasi")
    // to print the size(number of items) in this list
    println("These are ${majorCities.size} major cities in Ghana.")

    //to find item in list
    println(majorCities[majorCities.size-3])

    // List Functions
    var footballTeams =
        mutableListOf<String>("Blackburn", "Burnley", "Dynamo Kiev", "Santos", "Pizza hut fc")
    // to add a team
    footballTeams.add("Wolverhampton")

    // to remove a team
    footballTeams.remove("Pizza hut fc")

    // to show a random team
    println(footballTeams.random())

    println(footballTeams)

    // others

    println(footballTeams.indexOf("Burnley"))


}









