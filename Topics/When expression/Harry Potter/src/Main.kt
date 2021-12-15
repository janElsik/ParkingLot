fun main() {
    // write your code here
    var input = readLine()!!

    when(input){
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "ravenclaw" -> println("intellect")
        "slytherin" -> println("cunning")
        else -> println("not a valid house")
    }
}
