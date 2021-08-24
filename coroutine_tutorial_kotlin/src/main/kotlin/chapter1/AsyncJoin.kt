package chapter1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

@InternalCoroutinesApi
fun main(args : Array<String>) = runBlocking{
    val task = GlobalScope.async{
        doSomething()
    }
    task.join()
    if(task.isCancelled){
        val exception = task.getCancellationException()
        println("error with message : ${exception.cause}")
    } else{
        println("success")
    }
}

private fun doSomething() {
    throw UnsupportedOperationException("Can't do")
}