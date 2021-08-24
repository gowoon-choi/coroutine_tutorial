package chapter1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args : Array<String>) = runBlocking{
    val task = GlobalScope.launch{
        doSomething()
    }
    task.join()
    println("completed")
}

private fun doSomething() {
    throw UnsupportedOperationException("Can't do")
}