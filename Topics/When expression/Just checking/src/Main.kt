fun main() {
    // write your code here
//    println("Which programming language are you learning?\n" +
//            "1. Java\n" +
//            "2. Kotlin\n" +
//            "3. Scala\n" +
//            "4. Python")

    var input = readLine()!!.toInt()

    when(input){
        2 -> println("Yes!")
        1,3,4 -> println("No!")
        else -> println("Unknown number")
    }
}
