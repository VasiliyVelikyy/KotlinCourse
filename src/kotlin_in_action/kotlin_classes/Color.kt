package kotlin_in_action.kotlin_classes

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIG0(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
    fun getMnemonic(color: _root_ide_package_.kotlin_in_action.kotlin_classes.Color) =
            when (color) {
                _root_ide_package_.kotlin_in_action.kotlin_classes.Color.RED -> "Каждый"
                _root_ide_package_.kotlin_in_action.kotlin_classes.Color.ORANGE -> "Охотник"
                _root_ide_package_.kotlin_in_action.kotlin_classes.Color.YELLOW -> "Желает11"
                _root_ide_package_.kotlin_in_action.kotlin_classes.Color.GREEN -> "Знать"
                _root_ide_package_.kotlin_in_action.kotlin_classes.Color.BLUE -> "Где"
                _root_ide_package_.kotlin_in_action.kotlin_classes.Color.INDIG0 -> "Сидит"
                else -> ""
            }
}