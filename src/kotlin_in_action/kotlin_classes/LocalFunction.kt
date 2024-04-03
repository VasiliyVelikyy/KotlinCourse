package kotlin_in_action.kotlin_classes

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

class LocalFunction {

    fun savePerson(user: _root_ide_package_.kotlin_in_action.kotlin_classes.User) {
        fun validate(value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("cant save person ${user.id}: empty $fieldName")
            }
        }
        validate(user.name, "Name")
        validate(user.address, "Address")
    }
}
