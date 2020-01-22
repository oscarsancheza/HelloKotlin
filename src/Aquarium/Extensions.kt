package Aquarium

fun String.hasSpaces(): Boolean {
    return this.find { it == ' ' } != null
}

fun extensionsExample() {
    println("Does it have spaces".hasSpaces())
    println("Does it have spaces".hasSpaces2())
}

fun String.hasSpaces2() = find { it == ' ' } != null


open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(val size: Int) : AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "RED"

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(50)
    plant.print()

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
    println(aquariumPlant.isGreen)
}

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"


fun AquariumPlant?.pull() {
    this?.apply { println("removing $this") }
}

fun nullableExample() {
    val plant = AquariumPlant("", 2)
    plant.pull()

    val plant2: AquariumPlant? = null
    plant2.pull()
}