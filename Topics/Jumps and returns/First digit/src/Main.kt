fun main() {
    // put your code here
    val input = readLine()!!

    for (ch in input) {
        if (ch.isDigit()) {
            print(ch)
            break
        }
    }

}
