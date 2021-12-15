fun main() {
    val input = readLine()!!

    val inputArray = input.toCharArray()

    val finalArray = mutableListOf<Char>()
    val removedCharArray = mutableListOf<Char>()

    for (ch in inputArray) {
        if (finalArray.contains(ch)) {
            finalArray.remove(ch)
            removedCharArray.add(ch)

        } else if (removedCharArray.contains(ch)) {
            continue
        } else {
            finalArray.add(ch)
        }
    }
    println(finalArray.size)
}
