package ejercicios.U2

/* SENTENCIAS CONDICIONALES */


/* Ejercicio 2.1.2
Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la
contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable
sin tener en cuenta mayúsculas y minúsculas. */

fun ej2_2() {
    val password = "asdf123456"
    print("Introduce la contraseña: ")
    val check = readLine()!!

    if (check.equals(password, ignoreCase = true)) {
        println("Contraseña correcta.")
    } else {
        println("La contraseña es incorrecta.")
    }
}


/* Ejercicio 2.1.3
Escribir un programa que pida al usuario dos números y muestre por pantalla su división.
Si el divisor es cero el programa debe mostrar un error. */

fun ej2_3() {
    print("Introduce un número: ")
    val num1 = readLine()!!.toDouble()

    print("Introduce otro número: ")
    val num2 = readLine()!!.toDouble()

    if (num2 == 0.0) {
        println("El divisor no puede ser 0.")
    } else {
        val resultado = num1 / num2
        println("El resultado de la división es: $resultado.")
    }
}


/* Ejercicio 2.1.6
Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por
las mujeres con un nombre anterior a la M y los hombres con un nombre  posterior a la N y el grupo B por el resto.
Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde. */

fun ej2_6() {
    print("Introduce tu nombre: ")
    val nombre = readln().toUpperCase()

    print("Introduce tu género (F/M): ")
    val genero = readln().toUpperCase()

    val grupo = if ((genero == "F" && nombre < "M") || (genero == "M" && nombre > "N")) "A" else "B"

    if (genero == "F" || genero == "M") {
        println("Perteneces al grupo: $grupo")
    } else {
        println("Introduce un género correcto.")
    }
}


/* Ejercicio 2.1.8
En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la
evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los puntos que pueden conseguir
los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas. A continuación
se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel
es de 2.400€ multiplicada por la puntuación del nivel. */

fun ej2_8() {
    print("Introduce la puntuación del usuario: ")
    val dinerousuario = readLine()!!.toDouble()

    val variablepunto = when (dinerousuario) {
        0.0 -> "Inaceptable"
        0.4 -> "Aceptable"
        in 0.6..Double.MAX_VALUE -> "Meritorio"
        else -> false
    }

    if (variablepunto != false) {
        val cantidadDinero = dinerousuario * 2400
        println("El nivel del usuario es $variablepunto y la cantidad de dinero recibida es de: $cantidadDinero €")
    } else {
        println("Puntuación incorrecta.")
    }
}


/* Ejercicio 2.1.10
La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada tipo
de pizza aparecen a continuación.

Ingredientes vegetarianos: Pimiento y tofu.
Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le
muestre un menú con los ingredientes disponibles para que elija. Solo se puede eligir un ingrediente además de la
mozzarella y el tomate que están en todas la pizzas. Al final se debe mostrar por pantalla si la pizza elegida es
vegetariana o no y todos los ingredientes que lleva. */

fun ej2_10() {
    print("¡Bienvenido a Bella Napoli!\nTenemos pizzas vegetarianas y no vegetarianas.\n¿Qué tipo de pizza desea?\n1. Vegetariana\n2. No vegetariana\n")
    val tipoPizza = readln().toInt()

    when (tipoPizza) {
        1 -> {
            print("Has seleccionado una pizza vegetariana.\nLa pizza vegetariana puede incluir uno de los siguientes ingredientes:\n1. Pimiento\n2. Tofu.\n¿Qué ingrediente desea añadir?\n")
            val ingrediente = readln().toInt()
            val pizza = pizzaVeg(ingrediente)
            println("Tu pizza vegetariana lleva $pizza, Tomate y Mozzarella.")
        }
        2 -> {
            print("Has seleccionado una pizza no vegetariana.\nLa pizza no vegetariana puede incluir uno de los siguientes ingredientes:\n1. Peperoni\n2. Jamón\n3. Salmón.\n¿Qué ingrediente desea añadir?\n")
            val ingrediente = readln().toInt()
            val pizza = pizzaNoVeg(ingrediente)
            println("Tu pizza no vegetariana lleva $pizza, Tomate y Mozzarella.")
        }
        else -> {
            println("Seleccione un tipo correcto de pizza.")
        }
    }
}

fun pizzaVeg(ingrediente: Int): String {
    return when (ingrediente) {
        1 -> "Pimiento"
        2 -> "Tofu"
        else -> "Error"
    }
}

fun pizzaNoVeg(ingrediente: Int): String {
    return when (ingrediente) {
        1 -> "Peperoni"
        2 -> "Jamón"
        3 -> "Salmón"
        else -> "Error"
    }
}

/* SENTENCIAS ITERATIVAS */


/* Ejercicio 2.2.2
Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces. */

fun ej22_2() {
    print("Introduce una palabra: ")
    val palabra = readln()

    var resultado = ""
    var cont = 0
    while (cont < 10) {
        resultado = "$resultado$palabra."
        cont++
    }

    println(resultado)
}


/* Ejercicio 2.2.4
Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese
número hasta cero separados por comas. */

fun ej22_4() {
    print("Escribe un número: ")
    val numero = readln().toInt()

    var mensaje = ""
    var cont = numero
    while (cont >= 0) {
        mensaje = "$mensaje$cont,"
        cont--
    }

    println(mensaje)
}


/* Ejercicio 2.2.6
Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más
abajo, de altura el número introducido.

*
**
***
****
***** */

fun ej22_6() {
    print("Escribe un número: ")
    val num = readln().toInt()

    var resultado = ""
    for (i in 1..num) {
        resultado = "$resultado\n" + "*".repeat(i)
    }

    println(resultado)
}

/* Ejercicio 2.2.7
Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10. */

fun ej22_7() {
    print("Introduce un número: ")
    val num = readln().toInt()

    var resultado = 0
    var i = 1
    while (i < 11) {
        resultado = i * num
        i++
        println(resultado)
    }
}


/* Ejercicio 2.2.8
Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más
abajo.

1
3 1
5 3 1
7 5 3 1
9 7 5 3 1 */

fun ej22_8() {
    print("Por favor, introduce un número entero: ")
    val numero = readln().toInt()

    var piramide = ""
    for (i in 1..numero step 2) {
        for (j in i downTo 1 step 2) {
            piramide += "$j "
        }
        piramide += "\n"
    }

    println(piramide)
}


/* Ejercicio 2.2.13
Escribir un programa que muestre el eco de tod lo que el usuario introduzca hasta que el usuario escriba
“salir” que terminará. */

fun ej22_13() {
    var lista = ""
    var palabras = readln()

    while (palabras != "salir") {
        lista += palabras
        print("Introduce otra palabra: ")
        palabras = readln()
    }

    println(lista)
}


/* Ejercicio 2.2.15
Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de
todos los números positivos ingresados. */

fun ej22_15() {
    var lista = 0
    print("Introduce un número: ")
    var numero = readln().toInt()

    while (numero != 0) {
        lista += numero
        print("Introduce otro número: ")
        numero = readln().toInt()
    }

    println(lista)
}


/* Ejercicio 2.2.18
Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo
componen. La condición de corte es que se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados
por el usuario fueron números pares. */


/* Ejercicio 2.2.19
Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa. A continuación, el
usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se
debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1 ó 2 se
imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará. */


/* Ejercicio 2.2.25
Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de una,
mostrar la primera) y cuántas palabras había. Precondición: se tomará como separador de palabras al carácter “ “
(espacio), ya sea uno o más. */


/* CAPTURA DE EXCEPCIONES */


/* Ejercicio 2.3.2
Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla todos los números impares desde 1 hasta ese número separados por comas.*/


/* Ejercicio 2.3.3
Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla la cuenta atrás desde ese número hasta cero separados por comas. Deberá solicitar el número hasta introducir uno correcto. */


/* Ejercicio 2.3.4
Escribir un programa que pida al usuario un número entero, si la entrada no es correcta,
mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada. */