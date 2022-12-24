package data.list

interface Stack<E> {

    fun push(e: E)

    fun pop(): E?

    fun peek(): E?


}