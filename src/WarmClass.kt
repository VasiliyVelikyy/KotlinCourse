import kotlin_in_action.kotlin_classes.Color
import  kotlin_in_action.kotlin_classes.Color.*

class WarmClass
fun main(args: Array<String>) {

    println(mix(BLUE,YELLOW))
}
fun getWarmth(color: _root_ide_package_.kotlin_in_action.kotlin_classes.Color) = when (color) {
    RED, ORANGE, YELLOW -> "теплый"
    else -> ""
}

fun mix(c1: _root_ide_package_.kotlin_in_action.kotlin_classes.Color, c2: _root_ide_package_.kotlin_in_action.kotlin_classes.Color) =
        when (setOf(c1, c2)) {
            setOf(YELLOW, BLUE) -> GREEN
            else -> ""
        }
