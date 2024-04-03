package kotlin_in_action.kotlin_classes.chapter4.equals

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun toString(): String {
        return "Client(name='$name', postalCode=$postalCode)"
    }

    override fun hashCode(): Int {
        return name .hashCode() * 31 + postalCode
    }
}