fun main() {
    // put your code here
    val input1:Int = readLine()!!.toInt()
    val input2:Int = readLine()!!.toInt()

    if(input2 == 0) {
        println("Division by zero, please fix the second argument!")
    } else {
        println(input1 / input2)
    }

}

