package kotlin_in_action.kotlin_classes.chapter5

fun main(args: Array<String>) {

    //  streamFunct()
    //withFunct()
    //applyFunct()
    buildStringFunct()
}

fun buildStringFunct() {
    // Например, функцию append можно упростить с помощью стандартной библиотечной функции bui ldString, которая позаботится о создании экземпляра StringBui lder и вызовет метод
    //toString.
    fun alphabet() = buildString {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append(" Now I know the alpnabet !")
    }
}

fun applyFunct() {
    //передали стрингбилдер , сделали операции и его же вернули, после апплай сделали ту стринг
    fun alphabet() = java.lang.StringBuilder().apply {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append(" Now I know the alpnabet !")
    }.toString()
    println(alphabet())
}

fun withFunct() {
    //без применения with
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append(" Now I know the alpnabet !")
    val answ = result.toString()
    println(answ)
    println("_________________")

    //с применением with
    println("with constructction")
    val sb = java.lang.StringBuilder()
    val answ2 = with(sb) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        this.append(" Now I know the alpnabet !")
        this.toString()
    }
    println(answ2)
    println("_________________")

    //значение выполнения присвоить переменной функции
    println("without this notation")
    fun alhabet() = with(java.lang.StringBuilder()) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append(" Now I know the alpnabet !")
        toString()
    }

    println(alhabet())
}

fun streamFunct() {
    val books = listOf(Book("Faritail", listOf("Vasia", "Petia")))
    val authorList = books.flatMap { it.authors }.toList()
    println(authorList)

    val books2 = listOf(Book("Тhursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    println(books2.flatMap { it.authors }.toSet())
    //здесь будет создано 2 промежуточные коллекции после мап и фильтра
    books.map(Book::title).filter { it.startsWith("F") }

    //для того чтобы норм исп стрим нужно исп полседовтальностт вместа коллекц
    //Любую коллекцию можно преобразовать в последовательность, вызвав
    //функцию-расширение asSequence. Обратное преобразование выполняется вызовом функции toList.
    books.asSequence().map(Book::title).filter { it.startsWith("F") }.toSet()

}
