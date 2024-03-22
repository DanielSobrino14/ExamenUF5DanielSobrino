package org.example

class BibliotecaBuidaException: Exception {
    constructor(): this ("La biblioteca està buida, torna un altre dia!!")
    constructor(message: String): super(message)
}