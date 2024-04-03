package kotlin_in_action.kotlin_classes.chapter6

class Person3(val name: String, val age: Int? = null) {
    /*Обратите внимание, что здесь применяются обычные правила работы
    со значением nul l. Нельзя просто взять и сравнить два значения типа
    Int?, поскольку одно из них может оказаться nul l. Вместо этого вам нужно убедиться, что оба значения не равны nu l l, и после этого компилятор
    позволит работать с ними как обычно. */
    fun isOlderThan(other: Person3): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }

}