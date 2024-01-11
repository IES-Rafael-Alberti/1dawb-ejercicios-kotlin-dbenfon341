/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */

fun pedirNum(min: Int, max: Int): Int {
    var numero: Int = min - 1

    do {
        print("Introduzca un número entre $min y $max: ")
        val input = readLine()

        try {
            numero = input?.toInt() ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            print("**Error** Número no válido (pulse ENTER para continuar...)")
            readLine()
            continue
        }

        if (numero < min || numero > max) {
            print("**Error** Número no válido (pulse ENTER para continuar...)")
            readLine()
        }

    } while (numero < min || numero > max)

    return numero
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */

fun pregunta(text: String): Boolean {
    print("$text (s/n): ")
    val respuesta = readLine()?.toLowerCase()

    return when (respuesta) {
        "s", "si" -> true
        "n", "no" -> false
        else -> {
            print("**Respuesta no válida** (pulse ENTER para continuar...)")
            readLine()
            pregunta(text)
        }
    }
}

fun main() {
    do {
        val numero = pedirNum(1, 100)

        val tablaMultiplicar = Array(10) { i -> (i + 1) * numero }

        println("La tabla de multiplicar del $numero: es")

        for (i in 1..10) {
            println("$i -> $numero x $i = ${tablaMultiplicar[i - 1]}")
        }

        val otraTabla = pregunta("¿Deseas generar otra tabla de multiplicación?")
    } while (otraTabla)

    println("CERRANDO")
}