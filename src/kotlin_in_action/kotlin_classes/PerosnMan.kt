package kotlin_in_action.kotlin_classes

class PersonMan(val name: String,
             var age: Int? = null){
    val isMan : Boolean
        get() {
            return true
        }
}