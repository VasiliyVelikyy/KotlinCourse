package kotlin_in_action.kotlin_classes

class StringHelper {

    fun <T> joinToString(collection: Collection<T>,
                         separator: String,
                         prefix: String,
                         postfix: String
    ): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }
        result.append(postfix)
        return result.toString()
    }

    @JvmOverloads
    fun <T> joinToStringWithDefaultValues(collection: Collection<T>,
                                          separator: String = ",",
                                          prefix: String = " ",
                                          postfix: String = " "
    ): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }
        result.append(postfix)
        return result.toString()
    }
}
