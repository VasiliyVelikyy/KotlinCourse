package kotlin_in_action.kotlin_classes.chapter4

interface Clickable {
   fun click()

    //метод по умолчанию
    fun defMethod()= println("this is default method")
    fun defMethod2()= println("this is default method2")
}