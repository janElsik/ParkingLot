package parking

fun main() {

    // declare parking space list and initialize it with empty spaces
    var parkingSpaceList = mutableListOf<String>()


    // initializing exit variable - if set to true, program will exit
    var exit = false
    var parkingLotCreated = false


    // main loop
    while (!exit) {
        // take user input
        val userInput = readLine()!!

        if(userInput.contains("exit")){
            break
        }

        if (!userInput.contains("create") && !parkingLotCreated) {
            println("Sorry, a parking lot has not been created.")
            continue
        }


        // split user input and select just the command, eg. "park", "leave", "exit"
        val userCommand = userInput.split(" ")[0]

        when (userCommand) {
            "create" -> {
                // create parking lot with given number of spaces
                parkingSpaceList = createParkingLot(userInput.split(" ")[1].toInt())
                parkingLotCreated = true
                println("Created a parking lot with " + parkingSpaceList.size + " spots.")

            }
            "status" -> {
                if (isParkingLotEmpty(parkingSpaceList)) {
                    println("Parking lot is empty.")
                } else {
                    for (car in parkingSpaceList) {
                        if (car == "empty") {
                            continue
                        } else {
                            var slotNumber : Int = parkingSpaceList.indexOf(car) + 1
                            var slotNumberToString = slotNumber.toString()
                            println("$slotNumberToString $car")
                        }
                    }
                }

            }

            "park" -> {
                // 1. check if there is parking space available, if not, return empty and return
                val parkingSpace = findClosestFreeSpotIndex(parkingSpaceList)

                when (parkingSpace) {
                    "none" -> println("Sorry, the parking lot is full.")

                    // 2. if there is space, park the car (add to list) and return the parking space number + color of the car

                    else -> {
                        // number of parking space = adding one because findClosestFreeSpotIndex() returns index
                        var parkingSpaceNumber = parkingSpace.toInt() + 1
                        var registrationNumber = userInput.split(" ")[1]
                        var color = userInput.split(" ")[2]
                        parkingSpaceList[parkingSpace.toInt()] = "$registrationNumber $color"
                        println("$color car parked in spot $parkingSpaceNumber.")

                    }
                }

            }
            "leave" -> {
                // check user input number (minus 1 because of indexing)
                val parkingSpaceNumber = userInput.split(" ")[1].toInt() - 1
                if (parkingSpaceList[parkingSpaceNumber] != "empty") {
                    parkingSpaceList[parkingSpaceNumber] = "empty"
                    println("Spot " + (parkingSpaceNumber + 1) + " is free.")
                }
            }
            "exit" -> exit = true
        }

    }


}

// return closest empty space index
fun findClosestFreeSpotIndex(mutableList: List<String>): String {
    for (i in mutableList) {
        if (i == "empty") {
            return mutableList.indexOf(i).toString()
        }
    }
    return "none"
}

fun createParkingLot(numberOfSpaces: Int): MutableList<String> {
    // create parking space list and initialize it with empty spaces
    var parkingSpaceList = mutableListOf<String>()
    for (i in 1..numberOfSpaces) {
        parkingSpaceList.add("empty")
    }
    return parkingSpaceList
}

fun isParkingLotEmpty(mutableList: List<String>): Boolean {
    for (i in mutableList) {
        if (i != "empty") {
            return false
        }
    }
    return true
}
