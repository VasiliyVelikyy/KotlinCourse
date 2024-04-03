package kotlin_in_action.kotlin_classes

import java.lang.IllegalArgumentException


class User2(val id: Int, val name: String, val address: String) {

    //создание функции расширения
    fun User2.validateBeforeSave() {
        fun validate(value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("cant save person $id: empty $fieldName")
            }
        }
        validate(name, "Name")
        validate(address, "Address")
    }

    fun saveUser(user2: User2) {
        user2.validateBeforeSave()
    }
}