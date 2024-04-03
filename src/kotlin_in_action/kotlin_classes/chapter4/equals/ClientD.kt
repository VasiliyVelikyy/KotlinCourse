package kotlin_in_action.kotlin_classes.chapter4.equals
// data значит уже им переопр методы  toString, equals и hashCode

//Обратите внимание, что свойства, не
//объявленные в основном конструкторе, не принимают участия в проверках равенства и вычислении хэш-кода
data class ClientD(val name: String, val postalCode: Int) {

}