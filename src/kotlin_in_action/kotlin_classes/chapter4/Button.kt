package kotlin_in_action.kotlin_classes.chapter4

open class Button : Clickable {
    override fun click() = println("Button click")

    override fun defMethod() = println("Overide default method")

    override fun defMethod2() {
        super<Clickable>.defMethod2() //вызов метода родителя
    }

    open fun parentMethodForButton() {
        println("Iam button")
    }

}
