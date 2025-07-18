package Lesson3.solutions

fun discountFivePercent(price: Double): Double { return price * 0.95  }
fun DiscountFivePercent(price: Double): Double = price * 0.95

var discount : ((Double)->Double)? = null

fun generateDiscount(){
    discount = ::discountFivePercent
    // We can also inline it like this:
    discount = { x : Double -> x * 0.95 }

}


fun main(){
    generateDiscount()
    println(discount!!(50.0))
}

//TODO: I don't want no Lesson3.discount to be applied, I want an error if Lesson3.generateDiscount isn't called!