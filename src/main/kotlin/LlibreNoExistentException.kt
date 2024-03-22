package org.example

class LlibreNoExistentException: Exception {
    constructor(): this ("Ho sento, aquest llibre no existeix!!")
    constructor(message: String): super(message)
}