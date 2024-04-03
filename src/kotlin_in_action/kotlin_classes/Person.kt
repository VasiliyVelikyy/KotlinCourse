package kotlin_in_action.kotlin_classes

data class Person(val name: String,
                  var age: Int? = null){
    val isMan : Boolean
    get() {
        return true
    }
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
            Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

    var person1= Person("Ivan", 23);
    person1.age=24
    println(person1.isMan)
}

class PersonWoman(val name: String,
                  var age: Int? = null){
    val isMan : Boolean
        get() {
            return false
        }
}


