fun main() {
    // put your code here
    val input = readLine()!!.toCharArray()

    val alphabetString = "abcdefghijklmnopqrstuvwxyz"
    val alphabetArray = alphabetString.toCharArray()

    var finalString = ""

    for (ch in alphabetArray) {
        if (input.contains(ch)) {
            continue
        } else {
            finalString += ch
        }
    }

    println(finalString)

}
