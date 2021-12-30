package com.example.kotlinproject1

import android.provider.MediaStore

class customClass {

    class Moviegenres(val name:String, val genres:String, val rating:Int)
}

fun main(){
    val myMovie1 = customClass.Moviegenres("The Avengers","Action",87)
    val myMovie2 = customClass.Moviegenres("Harry Potter","Fantasy Fiction",93)
    val myMovie3 = customClass.Moviegenres("John Wick","Action",91)

    println("${myMovie1.name} is an ${myMovie1.genres} movie with a rating of ${myMovie1.rating}% on Google.")

    println("${myMovie2.name} is a ${myMovie2.genres} movie with a rating of ${myMovie2.rating}% on Google.")

    println("${myMovie3.name} is an ${myMovie3.genres} movie with a rating of ${myMovie3.rating}% on Google.")



}