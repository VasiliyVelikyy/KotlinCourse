package kotlin_in_action.kotlin_classes.chapter6

fun main(args: Array<String>) {

    //  nullFunct()
    //  elviseFunc()
    //equalsTwoPerson()
    // letFunction()
    //lateInitFunct()
   // nullParametr()
   // numOperation()
   // anyObjFunct()
   // unitObjFunct()
    nothingObjFunc()
}

fun nothingObjFunc() {
    val address = Address("Elsestr. 47", 80687, "Munich",
            "Germany")
    val jetbrains = Company("JetBrains", address)
    val company=Company("JetBrains",null)
    val person = Person("Dmitry", jetbrains)
    val answ = company.address ?: fail("No address" )
    println(answ)
}
fun fail(message : String): Nothing {
    throw IllegalStateException(message)
}


fun unitObjFunct() {
  val test:Unit= unitFun()
    funcEnterUnitFunc(test)
}

fun funcEnterUnitFunc(test: Unit) {
    println(test.toString())

}

fun unitFun() :Unit {
    // могу return не писать
    println("this is unit funct")
}

fun anyObjFunct() {
    val answ:Any=1
    println( answ.equals(Any()))
    val objNotify=(answ as Object)
    // objNotify.wait()// так как в Any нет wait() по умолчанию, нужно вручную привести к типу Object

}

fun numOperation() {
    val i=1 //автомат приобразование к типу инт
    val l:Long = i.toLong() //так не сработает  val l:Long =i тк разные типы \ усеч в большую строну

    val i2:Int= l.toInt() //усечение в меньшую
    val x=1;
    val list =listOf(1L,2L,3L)
    //val boolAnsw=x in list // не скомпилруется так как нужно сравнивать один тип
    println(x.toLong() in list)//
}

fun nullParametr() {
    println(printHashCodeWithNull(null))
    //println(printHashCodeWithOutNull(null))
}

/*для вызова функции printHashCode в листинге 6. 13 компилятор определит параметр т как тип Any? с поддержкой null.
 Соответственно, параметр t может оказаться равным nu l l даже притом, что в имени типа Т ""' отсутствует вопросительныи знак.
 */
fun <Т> printHashCodeWithNull(t: Т) {
    println(t?.hashCode())//Обязатепыо допжен испопьзоваться безопасный вызов, поскопьку «t» может хранить null
}

/*Обратите внимание, что типовые параметры - это единственное исклю- u чение из правила <<вопросительныи знак в конце имени типа разрешает
значение nul l, а типы с именами без знака вопроса не допускают null>>
*/
fun <Т : Any> printHashCodeWithOutNull(t: Т) { //Теперь « Т » не поддерживает null
    println(t.hashCode())
}



fun lateInitFunct() {
    val lateClazz = LateClazz()
    lateClazz.age = "12"
}

fun letFunction() {
    val email: String? = "test@mail"
    val email2: String? = null
    //sendEmail(email) //если email допускает null тоткомпилятор не даст вызвать так функцию
    //можно вызвать так
    email?.let { sendEmail(email) } //произойдет дейсвтие
    email2?.let { sendEmail(email2) } //непроизойдет действие
}

fun sendEmail(email: String) {
    println("send email to $email")
}

fun equalsTwoPerson() {
    val р1 = Person2("Dmitry", "Jemerov")
    val р2 = Person2("Dmitry", "Jemerov")
    println(р1 == р2)
    println(р1.equals(42))
}

fun elviseFunc() {
    val address = Address("Elsestr. 47", 80687, "Munich",
            "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
    printShippingLabel(person)
}

fun printShippingLabel(person: Person) {
    val address = person.company?.address
            ?: throw IllegalArgumentException("No address")
    //with принимате объект и у него вытаскивает свойства
    with(address) {
        println(streetAddress)
        println("$zipCode $city , $country")
    }
}

fun nullFunct() {
    println(strLenSafe("test"))
    println(strLenSafe2("test"))
    println(strLenSafe2(null))
}

fun strLenSafe(s: String) = s.length
//fun strLenSafe(s: String?) = s.length

fun strLenSafe2(s: String?): Int =
        if (s != null) s.length else 0
//это эквивалентно s?length
