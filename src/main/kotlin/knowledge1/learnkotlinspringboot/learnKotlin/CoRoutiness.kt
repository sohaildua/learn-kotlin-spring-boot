package knowledge1.learnkotlinspringboot.learnKotlin

import kotlinx.coroutines.*


fun firstCoroutine() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(5000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

fun coroutineBuilder() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}


fun main() {
    firstCoroutine()
    coroutineBuilder()
}