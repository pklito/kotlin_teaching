package Lesson3.solutions

import kotlin.random.Random

fun doOnRepeat(func : () -> Unit){
    while(true){
        func()
        Thread.sleep(1000)
    }
}

var counter = 0
fun countingSystem(){
    println("[Counter]: ${counter++}")
}


fun randomNameGenerator(){
    val firstNames : List<String> = listOf(
        "Marcus", "James", "Michael", "Itay", "Dan", "Jonathan"
    )
    val lastNames : List<String> = listOf(
        "Bay", "Smith", "Goldenberg", "Fujimoto", "Dessandre", "Jackson", "Katsuv", "Shulman"
    )
    //Method 1:
    val firstIndex = Random.nextInt(0, firstNames.size)
    val lastIndex = Random.nextInt(0, lastNames.size)
    var fullName = firstNames[firstIndex] + " " + lastNames[lastIndex]
    println("Hello, $fullName")

    //method 2:
    fullName = firstNames.random() + " " + lastNames.random()
}

fun main(){
    doOnRepeat(::randomNameGenerator)
    doOnRepeat(::countingSystem)
    doOnRepeat { println("hi!!!") }
}