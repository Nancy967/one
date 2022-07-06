package com.tom

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var counter = 1
    var ms = measureTimeMillis {
        for (n in 1..100_000){
            thread {
                counter++
            }
        }
    }
    println("thread: $ms")


    var counter1 = 1
    var ms1 = measureTimeMillis {
        for (n in 1..100_000){
            GlobalScope.launch {
                for (n in 1..100_000){
                    counter1++
                }
            }
        }
    }
    println("coroutines: $ms1")
}