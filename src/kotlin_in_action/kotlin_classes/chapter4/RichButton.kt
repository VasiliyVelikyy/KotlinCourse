package kotlin_in_action.kotlin_classes.chapter4

class RichButton : Clickable, Button() {
    override fun click() {
        println("click to RichButton")
    }

    override fun parentMethodForButton() {

    }
}
