package org.example

class Biblioteca {
    var llibres = mutableListOf<Llibre>()
    fun afegirLlibre(llibre: Llibre) {
        try {
            for (libro in llibres) {
                if (libro.titol == llibre.titol) {
                    throw LlibreDuplicatException("Error: Aquest llibre ja existeix a la biblioteca.")
                }
            }
            llibres.add(llibre)
            println("Llibre afegit correctament: ${llibre.titol} de ${llibre.autor}")

        } catch (e: LlibreDuplicatException) {
            println(e.message)
        }
    }
    fun eliminarLlibre(llibre: Llibre) {
        try {
            if (llibres.remove(llibre)) {
                println("Llibre eliminat correctament: ${llibre.titol} de ${llibre.autor}")
            } else {
                throw LlibreNoExistentException("Aquest llibre no existeix per tant no es pot borrar!!")
            }
        } catch (e: LlibreNoExistentException) {
            println(e.message)
        }
    }
    fun cercarLlibresPerTitolExacte(titulo: String): Llibre {
        if (llibres.isEmpty()) {
            throw BibliotecaBuidaException("La biblioteca està buida, torna un altre dia!!")
        }
        for (llibre in llibres) {
            if (titulo == llibre.titol) {
                return llibre
            }
        }
        throw LlibreNoExistentException("El llibre no s'ha trobat!!")
    }
    /*
       fun cercarLlibresPerTitol(empiece: String, final: String): List<Llibre> {
            if (llibres.isEmpty()) {
                throw BibliotecaBuidaException("La biblioteca està buida, torna un altre dia!!")
            } else
                }
     */
    fun cercarLlibresPerAutor(autor: String): List<Llibre> {
        val llibresAutor = mutableListOf<Llibre>()
        for (llibre in llibres) {
            if (llibre.autor.contains(autor)) {
                llibresAutor.add(llibre)
            }
        }
        if (llibresAutor.isEmpty()) {
            throw BibliotecaBuidaException("La biblioteca està buida torna un altre dia!!")
        }
        return llibresAutor
    }
    fun llistarLlibres() {
        try {
            if (llibres.isEmpty()) {
                throw BibliotecaBuidaException("La biblioteca està buida, torna un altre dia!!")
            } else {
                println("Llistat de llibres:")
                for (llibre in llibres) {
                    println("${llibre.titol} - ${llibre.autor} (${llibre.anyPublicacio})")
                }
            }
        } catch (e: BibliotecaBuidaException) {
            println(e.message)
        }
    }
}