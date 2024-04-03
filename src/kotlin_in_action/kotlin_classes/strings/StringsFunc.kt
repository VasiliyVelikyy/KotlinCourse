package kotlin_in_action.kotlin_classes.strings


//свойство расширения
val String.lastChar: Char
    get() = get(length - 1)

//как var, потому что содержимое экземпляра StringBuilder может меняться.
var StringBuilder.lastChar: Char
    get() = get(length - 1) //метод четния

    set(value: Char) {     //метод записи
        this.setCharAt(length - 1, value)
    }

//функция расширения
//String - это тип-получатель, а строка "Kotlin"  -объект-получатель
fun String.lastChar(): Char = this.get(this.length - 1)

//можно опустит this
fun String.lastChar2(): Char = get(indexOf('c'))

//такая же функция как и в файле function.kt только добавлен объект получатель и тип получатель
fun <T> Collection<T>.joinToStringWithouCollectInParametr(
        separator: String = ",",
        prefix: String = " ",
        postfix: String = " "
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}