package Aquarium

fun main(args: Array<String>) {
    //buildAquarium()
    //makeFish()
    pairs()
    val (tool, use) = giveMeATool()

    println(tool)
    println(use)

    listTutorial()
    mapTutorial()
    extensionsExample()
    staticExample()
    nullableExample()
}


fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Height : ${myAquarium.height} width: ${myAquarium.width} length:${myAquarium.length}")

    myAquarium.height = 80
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Volume: ${smallAquarium.volume} liters")
}


fun delegate() {
    val pleco = Plecostomus(RedColor)
    println("fish has a color ${pleco.color}")
    pleco.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}\nPlecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()

    delegate()
}

fun pairs() {
    val fishnet = "fishnet" to "cashing fish"
    val (tool, use) = fishnet

    println("The $tool is a tool for $use")
}

fun giveMeATool(): Pair<String, String> {
    return ("fishnet" to "catching")
}

fun mapTutorial() {
    val cures: Map<String, String> = mapOf("white spots" to "ich", "red stores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"]) 
    println(cures.getOrDefault("defaul", "Return default"))
    println(cures.getOrElse("bloating") { "No cure for this" })
}

fun listTutorial() {
    val testList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(reverseList(testList))
    println(reverseListAgain(testList))
    println(testList.reversed())
}

fun reverseList(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf<Int>()
    for (i in 0..list.size - 1) {
        result.add(list[list.size - i - 1])
    }
    return result
}

fun reverseListAgain(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}