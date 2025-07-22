package lesson4

import kotlin.math.sqrt


fun calculateSum(a : Int, b: Int) : Int {
    return a + b
}

fun calculateProduct(a : Int, b : Int) = a * b

fun vec2Length(vector2 : Pair<Double, Double>) : Double{
    val x = vector2.first
    val y = vector2.second
    return sqrt(x * x + y * y)
}
fun playSound(frequency: Double, notes: List<Double>){
    for (a in notes){ print("$a ") }
    println();
}

//fun runFunction (func : ???? ) {
//
//}

fun main(){
    //runFunction( ???? calculateProduct )
}