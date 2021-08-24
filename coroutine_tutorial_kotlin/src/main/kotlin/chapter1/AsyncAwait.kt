package chapter1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(args : Array<String>) = runBlocking{
    val task = GlobalScope.async{
        doSomething()
    }
    task.await()
    println("completed")
}

private fun doSomething() {
    throw UnsupportedOperationException("Can't do")
}