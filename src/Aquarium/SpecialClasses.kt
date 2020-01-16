package Aquarium

object MobyDickWhale {
    val author = "Hernan Melville"

    fun jump() {

    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

class SealLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SealLion -> "Sea lion"
    }
}