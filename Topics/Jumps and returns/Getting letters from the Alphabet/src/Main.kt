fun main() {
    // put your code here
    val input = readLine()!!
    val alphabetString = "abcdefghijklmnopqrstuvwxyz"
    val alphabetArray = alphabetString.toCharArray()
    var finalString = ""

    for (ch in alphabetArray) {
        if (ch.toString() != input) {
            finalString += ch
        } else {
            break
        }
    }
    println(finalString)
}
