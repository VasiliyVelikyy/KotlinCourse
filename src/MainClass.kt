import kotlin_in_action.java_classes.kotlin_classes.*
import kotlin_in_action.java_classes.kotlin_classes.strings.*
//можно функции присвоит алиас   kotlin_in_action.java_classes.kotlin_classes.strings.lastChar as last (если в разных пакетах одно имя у функции)
import java.io.BufferedReader
import java.io.StringReader
import java.util.*

class MainClass

fun main(args: Array<String>) {

    //createCycle()
    //checkNumber();
    // createCollection()
    //workWithFuncAndParametrs()
    //initPair()
    // printStringFunct()
    // savePersonLocalFun()
    // lambdaFunc()
    streamFunc()
}

fun streamFunc() {
val printActin={age:Int->
    println(age)
}

    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    val people = listOf(Person("Alice", 29), Person("Bob", 31),Person("Ivan", 29))
    val listInt = people.map { elem -> elem.age }

    val canBeinClub = {p: Person -> p.age!! <= 27 }
    println(people.all(canBeinClub))
 //   println(people.first(canBeinClub))
    println(people.find(canBeinClub))
    println(people.groupBy{it.age})

}

fun lambdaFunc() {
    val alise = Person("Alice", 29)
    val persons = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = persons.joinToString(separator = " & ", transform = { person: Person -> person.name })
    println(names)

    //исп стандартной библиотеки joinToString
    val names2 = persons.joinToString(" * ") { person -> person.name }
    println(names2)
    val max = persons.maxBy { person -> person.age!! }
    //тоже самое
    val max2 = persons.maxBy { it.age!! }
    println(max)

    val getAge = { person: Person -> person.age }
    val action = { person: Person, message: String ->
        sendEmail(person, message)
    }

    sendEmail(alise, "hello")

}

fun savePersonLocalFun() {
    _root_ide_package_.kotlin_in_action.kotlin_classes.LocalFunction().savePerson(_root_ide_package_.kotlin_in_action.kotlin_classes.User(1, "Ivan", "1"))
    _root_ide_package_.kotlin_in_action.kotlin_classes.LocalFunction().savePerson(_root_ide_package_.kotlin_in_action.kotlin_classes.User(2, "Vasia", ""))

    val user2 = User2(3, "Jenay", "4")
    user2.saveUser(user2)
}

fun printStringFunct() {
    parsePath(" /Users/yole/kotlin-book/chapter.adoc")

    val kotlinLogo = """| //
                        .|//
                        .|/ \ """
    println(kotlinLogo.trimMargin(".")) //удаляет все что слева включая точку
    println("___________")
    println(kotlinLogo)

}

fun initPair() {
    val (number, name) = 1 to "one"
    println("$number : $name")
}

fun workWithFuncAndParametrs() {
    val numbers = setOf(1, 14, 2)
    val joinStr = StringHelper().joinToString(numbers, ";", "(", ")")
    val joinStr2 = StringHelper().joinToString(numbers, separator = "~", prefix = "[", postfix = "]") //вызов с именами парамеетров
    println(joinStr)
    println(joinStr2)

    println(StringHelper().joinToStringWithDefaultValues(numbers))
    println(StringHelper().joinToStringWithDefaultValues(numbers, "\\"))
    println(StringHelper().joinToStringWithDefaultValues(numbers, postfix = "\\", prefix = "&", separator = "#"))
    println(joinToStringWithOutClass(numbers)) //здесь показан импорт функции без класса
    println(WINDOWS_SEPARATOR) //доступ к онстантам файла function.kt
    println(WINDOWS_SEPARATOR)//так тоже можно
    println("Javac".lastChar())

    //такая же функция как и в файле function.kt только добавлен объект получатель и тип получатель
    println(numbers.joinToStringWithouCollectInParametr(":", "[", "]"))


}


fun createCollection() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last()) //последний элемент в коллекции
    println(strings) //реализован по умолчанию toString()

    val numbers = setOf(1, 14, 2)
    println(numbers.max()) //получить макс число

}


fun checkNumber() {
    val reader = BufferedReader(StringReader("not а number"))
    val reader2 = BufferedReader(StringReader("12"))
    val letterBinary = _root_ide_package_.kotlin_in_action.kotlin_classes.LetterBinary()
    letterBinary.readNumber(reader2)
    letterBinary.readNumberNull(reader)
}

fun createCycle() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((key, value) in binaryReps) {
        println("$key = $value")
    }
    println("ok")

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index : $element ")

    }
}


fun sendEmail(person: Person, message: String) {
    println("send message $message")

}
