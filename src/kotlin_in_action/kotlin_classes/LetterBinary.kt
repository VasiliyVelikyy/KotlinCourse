package kotlin_in_action.kotlin_classes

import java.io.BufferedReader

class LetterBinary {
    fun readNumber(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (е: NumberFormatException) {
            return
        }
        println(number)
    }

    fun readNumberNull(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (е: NumberFormatException) {
            null
        }
        println(number)
    }
}




