package com.example.kotlinproject1
// The Init Block
    class Ghanacard(fullName:String, nationality: String, age: Int) {

        val nationality = "Ghanaian"


        init {
            if (nationality == "Ghanaian") {
                println("$fullName you are a $age year old $nationality, therefore, you are eligible for a Ghana card.")
            } else {
                println("$fullName you are not eligible for a Ghana card because you are $nationality.")
            }
        }
    }


    fun main() {
        var myStatus = Ghanacard("Michael Mensah", "Ghanaian", 22)



        var myFriend = Ghanacard("Peter Griffin", "American", 45)


    }

