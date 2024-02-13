package org.example

/*
Solicitar al usuario que ingrese un numero entero
Determinar si el numero es primo o no
Los numeros primos son mayores que uno, y son divisibles entre ellos mismos y por uno


*/
fun main() {
    while (true) {
        println("Ingrese un numero entero:")
        val input = readLine()
        if (input == "exit") {
            println("Saliendo del programa.")
            break
        }
        val numero = input?.toIntOrNull()
        if (numero != null) {
            var esPrimo = true
            var i = 2
            while (i <= numero / 2) {
                if (numero % i == 0) {
                    esPrimo = false
                    break
                }
                i++
            }
            if (esPrimo)
                println("$numero es un numero primo")
            else
                println("$numero no es un numero primo")
        } else {
            println("Entrada no valida. Por favor, ingrese un numero entero o 'exit' para salir.")
        }
    }
}