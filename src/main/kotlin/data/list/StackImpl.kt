package data.list

class StackImpl<E>() : Stack<E> {

    private val storage = arrayListOf<E>()
    val count: Int
        get() = storage.size

    val isEmpty: Boolean
        get() = count == 0

    override fun push(e: E) {
        storage.add(e)
    }

    override fun pop(): E? {
        if (storage.size == 0) {
            return null
        }
        return storage.removeAt(storage.size - 1)
    }

    override fun peek(): E? {
        return storage.lastOrNull()
    }

    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------")
    }

    companion object {
        fun <E> create(items: Iterable<E>):
                Stack<E> {
            val stack = StackImpl<E>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }
    }

}
fun <E> stackOf(vararg elements: E): Stack<E> {
    return StackImpl.create(elements.asList())
}