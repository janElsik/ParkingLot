fun main() {
    val input = readLine()!!

    var firstCharacterOfInput: Char? = null
    // write code here
    if(input.length != 0){
        firstCharacterOfInput = input.first()
    }
    var finalString: String = ""

    if (firstCharacterOfInput == 'i') {
        var tempString: String = input.replaceFirstChar { "" }

        var tempNumber = tempString.toInt() + 1

        finalString = tempNumber.toString()

        println(finalString)
    } else if (firstCharacterOfInput == 's') {
        finalString = input.replaceFirstChar { "" }
        println(finalString.reversed())
    } else if (input == "") {
        println()
    } else {
        finalString = input
        println(finalString)
    }


}
