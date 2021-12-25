package com.example.kotlinproject1

class conditionsAndLoops {

}
fun main(){

    // Creating an Immutable Set and retrieving an item
    var teaTypes = setOf<String>("Black Tea", "White Tea", "Green Tea", "Tea")
    println(teaTypes.elementAt(2))
    // to avoid an error should an index not exist you use the null expression
    println(teaTypes.elementAtOrNull(30))


    // Creating a mutable Set
    val popularPlaces = mutableSetOf<String>("Eiffel Tower", "Accra", "London", "New York", "Texas")
    println(popularPlaces)

    // Adding and removing elements
    var popularCities = mutableSetOf<String>()
    var cityNames = listOf<String>("Kumasi", "Accra", "London", "New York", "Texas")
    popularCities.addAll(cityNames)
    println(popularCities)
    // to print number of cities
    println("There are ${popularCities.size} cities in the Set.")

    // to clear elements
    popularCities.clear()
    println(popularCities)


    // 2
    var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)

    var summ = testGrades.sum()
    var numStudents = testGrades.size
    var average = summ / numStudents

    if (average < 65) {
        println("Failed")
    } else {
        println("Passed")
    }

    // Maps : Immutable
    // map showing Ghanaian Regions and their capitals
    var regionsAndCapitals = mapOf(
        "Western Region" to "Sekondi-Takoradi",
        "Greater Accra" to "Accra",
        "Ashanti Region" to "Kumasi"
    )
    println("These are some regions and their capitals in Ghana $regionsAndCapitals")

    // Retrieving Keys and Values
    println(regionsAndCapitals["Western Region"])// retrieves its value
    println(regionsAndCapitals.keys) // retrieves all keys

    println("The capital of Greater Accra is ${regionsAndCapitals["Greater Accra"]}") // test with string statement

    // Maps : mutable
    var quizPositions = mutableMapOf("John" to "1st", "Katy" to "2nd", "Jane" to "3rd")
    quizPositions["John"] = "4th" // updates Johns position
    println(quizPositions)
    println("In the previous quiz the positions were as follows ${quizPositions}")
    println("Katy came in ${quizPositions["Katy"]}, John came in ${quizPositions["John"]} and Jane came in ${quizPositions["Jane"]}, congrats to you all!")

    // Adding and Removing Map Entries
    quizPositions.put("Kan", "1st") // adds a new key and value
    quizPositions.put("Jin", "5th")
    println(quizPositions)

    quizPositions.remove("Jin")// removes entry
    println(quizPositions)

    // LOOPS : for Loop
    // read loops again
    var winningNumber = 10
    for (winningNumber in 5..winningNumber)
        println("$winningNumber won")

    // Controlling the Iteration
    // using down to and step
    for (n in 1..10) {
        println(n)
    }
    for (n in 8 downTo 1 step 3) {// counts backwards from 8  in increments of threes
        println(n)
    }

    // Iterating Through Collections

    var dogBreeds = listOf<String>("German shepherd", "Doberman", "Great Dane", "Beagle", "Terrier")
    for (dog in dogBreeds) {
        println("a $dog is a breed of dog.")
    }
    // to see the index
    for (indexOfDog in dogBreeds.indices) {
        println("Index = $indexOfDog")
    }
    // using withIndex to output both index and element
    for ((indexOfDog, dog) in dogBreeds.withIndex()) {
        println("$indexOfDog is the index of the element $dog")
    }

    // Iterating through Maps
    println("\nIterating one entry per iteration")
    var clothesColour =
        mapOf("Red shirt" to 1, "White shirts" to 5, "Black Shirt" to 1, "Orange shirts" to 0)
    for (clothes in clothesColour) {

        println("I have ${clothes.value} ${clothes.key} in my bag.")//prints item value and item key
    }

    // to iterate both value and key using parenthesis
    println("\nIterating in parenthesis using for((itemKey,itemValue) in itemVariable){}")
    for ((clotheName, clothesNumber) in clothesColour) {

        println("There are $clothesNumber $clotheName in the bag")
    }


    //while Loop
    var todaysDate = listOf<String>("16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th")
    var index = 0
    while (todaysDate[index] != "25th") {
        println("${todaysDate[index]} is not Christmas.")
        index += 1
    }

    // while loop 2
    var test = 1

    while (test <= 5) {
        println("Line $test")
        test++
    }



    // do while Loop
    var m = 0
    var x : Int
    do {
        println("result of m is below")
        x = m/2
        m++
    }while (x == 3)
    println("m = $m")








}

