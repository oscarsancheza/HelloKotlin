package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
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