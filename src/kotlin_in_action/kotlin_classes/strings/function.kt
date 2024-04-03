@file:JvmName("StringFunctions")
package kotlin_in_action.kotlin_classes.strings

val UNIX_LINE_SEPARATOR = "\n"
const val WINDOWS_SEPARATOR="\\" // равносильно в Java как public static final


@JvmOverloads
fun <T> joinToStringWithOutClass(collection: Collection<T>,
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

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir : $directory , name : $fileName , ext : $extension ")
}