package com.example.kotlinproject1

class Functions {
}
// main
fun main() {

    // invoking calculateSpeed in the main function
    println("\n--for speed--")
    calculateSpeed(200, 30)

    println("\n--for power--")
    // invoking  calculatePower()
    calculatePower(200, 34)

    println("\n--for addition--")
    addnum(8012, 444)


    // Invoking getPrice
    println("\n--Checking a coupon--")
    getPrice(price = 234.56, couponCode = "save15")

    // Invoking passTest
    println("\n--passed class checker--")
    passClass(examScore = 60.50, classScore = 32.45)

    // oz to tsp converter
    println("\n--oz to tsp converter--")
    // setting tspNeeded as the return value
    var tspNeeded = ozToTsp(2.789)

    println("You will need $tspNeeded tsp of vanilla extract for this recipe.")


    // anonymous expression
    println("\n--for anonymous expression--")
    var area = fun(base:Int,height:Int):Int{
        return (base*height)/2
    }
    println(area(15,19))

    // lambda expression
    println("\n--for lambda expression--")
    var perimeter = {side1: Int , side2 :Int -> (side1 + side2 )* 2 }
    println(perimeter(15,24))

}



// Creating a function that calculates speed
fun calculateSpeed(distance: Int, time: Int) {
    var speed = distance / time
    println("$speed meters per second.")
}

// Function that calculates power
fun calculatePower(force: Int, velocity: Int) {
    var power = force * velocity
    println("$power watt.")
}

// adding two numbers
fun addnum(num1: Int, num2: Int) {
    var add = num1 + num2
    println("The sum of num1 and num2 is $add")

}

// function that checks if there is a sale

fun getPrice(price: Double, couponCode: String = "None") {
    var finalPrice: Double

    if (couponCode == "save15") {
        finalPrice = price * .85
    } else {
        finalPrice = price
    }
    println("The total price is $finalPrice.")
}

// function checking to see if you passed or failed a class
fun passClass(examScore:Double,classScore:Double){
    var percentage = 100
    var totalScore = examScore+classScore/percentage
    if (totalScore<50){
        println("You had ${totalScore}%,unfortunately you failed and will need to take this class again next semester.")
    }else if (totalScore>50){
        println("You had ${totalScore}%,congratulations you passed this class,see you next semester!")
    }else {
        println("Score could not be checked")
    }
}


// Return Statements
// conversion of oz to tsp
fun ozToTsp(oz:Double):Double{
    var tsp = oz * 6
    return tsp// check main for continuation
}
