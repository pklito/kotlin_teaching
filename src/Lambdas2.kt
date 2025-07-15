// TODO: pick this signature
// fun doOnRepeat(func : [PICK A SIGNATURE]){
//    while(true){
//        func()
//        Thread.sleep(1000)
//    }
// }

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

    //TODO: Randomize a name!
}

fun main(){
    //doOnRepeat( TODO: ? )
}