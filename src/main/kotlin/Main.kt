package org.example


fun main() {
    val biblioteca = Biblioteca()

    // Afegim alguns llibres
    val llibre1 = Llibre("El Senyor dels Anells", "J.R.R. Tolkien", 1954)
    val llibre2 = Llibre("Harry Potter i la Pedra Filosofal", "J.K. Rowling", 1997)
    val llibre3 = Llibre("1984", "George Orwell", 1949)

    biblioteca.afegirLlibre(llibre1)
    biblioteca.afegirLlibre(llibre2)
    biblioteca.afegirLlibre(llibre3)

    // Intentem afegir un llibre duplicat
    biblioteca.afegirLlibre(llibre1)

    // Cerquem llibres per títol
    println("Llibres que contenen 'Harry':")
    // biblioteca.cercarLlibresPerTitol("Harry").forEach { println("${it.titol} - ${it.autor} (${it.anyPublicacio})") }

    // Cerquem llibres per autor
    println("\nLlibres de l'autor 'Tolkien':")
    biblioteca.cercarLlibresPerAutor("Tolkien").forEach { println("${it.titol} - ${it.autor} (${it.anyPublicacio})") }

    // Eliminem un llibre
    biblioteca.eliminarLlibre(llibre1)

    // Llistem tots els llibres
    println("\nTots els llibres a la biblioteca:")
    biblioteca.llistarLlibres()
}