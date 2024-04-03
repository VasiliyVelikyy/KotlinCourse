package kotlin_in_action.kotlin_classes.chapter4

import kotlin_in_action.java_classes.kotlin_classes.chapter4.equals.Client
import kotlin_in_action.java_classes.kotlin_classes.chapter4.equals.ClientD

class Main

fun main( args : Array<String>) {
    val button = RichButton()//Button()
    button.click()
    button.defMethod()
    button.defMethod2()


    copyFunction()

}

fun copyFunction() {
    val bob=ClientD("Bob",123)
    val alise=bob.copy(name = "Alise")
    println(bob)
    println(alise)
    val ivan=Client("Ivan",456)
    val s=Client("Ivan",4562)
    println(ivan == s)

    run { print(23) }
}
