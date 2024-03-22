package org.example

class LlibreDuplicatException: Exception {
    constructor(): this ("Aquest llibre esta duplicat!!")
    constructor(message: String): super(message)
}