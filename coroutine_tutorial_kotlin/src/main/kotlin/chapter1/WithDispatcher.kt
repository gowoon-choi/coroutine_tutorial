package chapter1

import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val dispatcher = newSingleThreadContext(name = "ServiceCall")
    val task = launch(dispatcher) {
        printCurrentThread()
    }
    task.join()
}

fun printCurrentThread(){
    println("running in thread [${Thread.currentThread().name}]")
}