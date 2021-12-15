fun parseCardNumber(cardNumber: String): Long {
    // TODO
    val cardNumberCharArray: CharArray = cardNumber.toCharArray()
    var toLongOrNull = cardNumber.replace(" ", "").toLongOrNull()


    if (cardNumberCharArray.size != 19) {
        throw Exception("Invalid card number, should be 19 digits")
    } else if (cardNumberCharArray[4] != ' ' || cardNumberCharArray[9] != ' ' || cardNumberCharArray[14] != ' ') {
        throw Exception("Invalid card number, should be 4 digits separated by a space")
    } else if (toLongOrNull == null) {
        throw Exception("Invalid card number, should be a number")
    } else {
        return toLongOrNull

    }
}
