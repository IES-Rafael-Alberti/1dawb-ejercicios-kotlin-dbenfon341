package ejercicios.U1

/* Ejercicio 1.2.4
Escribe un programa que le pida al usuario
una temperatura en grados Celsius, la convierta a
grados Fahrenheit e imprima por pantalla la temperatura convertida. */

fun ej1_4() {
    print("Introduce la temperatura Celsius para pasarla a Fahrenheit: ")
    val temperatura = readln()
    val temperaturaFahrenheit = ((temperatura.toInt() * 9/5)+32)
    println("La temperatura en Fahrenheit es: $temperaturaFahrenheit")
}


/* Ejercicio 1.2.6
Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que
se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%). */

fun ej1_6() {
    print("Indique el importe final del artículo: ")
    val precioarticulo = readln()
    val iva = (precioarticulo.toInt() / 1.10)
    val totalIva = (precioarticulo.toInt() - iva.toInt())
    println("Su artículo sin IVA cuesta: $iva, Ha pagado un total de IVA de: $totalIva")
}


/* Ejercicio 1.2.12
Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de
masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa
corporal es donde es el índice de masa corporal calculado redondeado con dos decimales. */

fun ej1_12() {
    print("Introduce tu peso (en KG): ")
    val peso = readln()
    print("Introduce su altura: (en metros)")
    val altura = readln()
    val masaCorporal = (peso.toInt() / (altura.toInt() * 2))
    print("Su masa corporal es $masaCorporal")
}


/* Ejercicio 1.2.15
Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año.
Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu
cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de
ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de
ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales. */

fun ej1_15() {
    print("Introduce tus ahorros: ")
    val capital = readln()
    var intereses = 0.04
    val primerano = (capital.toInt() * (1 + intereses) )
    val segundoano = (primerano.toFloat() * (1 + intereses))
    val tercerano = (segundoano.toFloat() * (1 + intereses))
    println("Ahorros después del primer año: $primerano")
    println("Ahorros después del segundo año: $segundoano")
    println("Ahorros después del tercer año: $tercerano")
}


/* Ejercicio 1.2.18
Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre
por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra
con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos
en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera. */

fun ej1_18() {
    print("Introduce tu nombre con apellidos: ")
    val nombre = readln()

    println("Nombre en minúsculas: ${nombre.toLowerCase()}")
    println("Nombre en mayúsculas: ${nombre.toUpperCase()}")
    println("Nombre con las primeras letras en mayúscula: ${nombre.split(" ").joinToString(" ") { it.capitalize() }}")
}


/* Ejercicio 1.2.20
Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension
donde el prefijo es el código del país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir
un programa que pregunte por un número de teléfono con este formato y muestre por pantalla el número de teléfono
sin el prefijo y la extensión. */

fun ej1_20() {
    print("Introduce un número de teléfono con el prefijo y la extensión de dos dígitos (por ejemplo: +3491372471056): ")
    var num = readln()

    num = num.substring(3, num.length - 2)

    println("El número de teléfono sin prefijo y extensión es: $num")
}

/* Ejercicio 1.2.21
Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla
la frase invertida. */

fun ej1_21() {
    print("Introduce una frase: ")
    val frase = readln()

    val fraseInvertida = frase.reversed()

    println(fraseInvertida)
}


/* Ejercicio 1.2.22
Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por
pantalla la misma frase pero con la vocal introducida en mayúscula.*/

fun ej1_22() {
    print("Introduce una frase: ")
    val texto = readln()

    print("Ahora, introduce una vocal: ")
    val vocal = readln()

    val vocalMayuscula = vocal.toUpperCase()

    println("El texto que has escrito es $texto y la vocal en mayúsculas es: $vocalMayuscula.")
}


/* Ejercicio 1.2.24
Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y muestre por pantalla
el número de euros y el número de céntimos del precio introducido.*/

fun ej1_24() {
    print("¿Cuánto cuesta el producto?: ")
    val dinero = readln().toDouble()

    val euros = dinero.toInt()
    val centimos = ((dinero - euros) * 100).toInt()

    println("$euros euros y $centimos céntimos.")
}


/* Ejercicio 1.2.25
Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla,
el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se
introduzcan con un solo carácter. */

fun ej1_25() {
    print("Introduce tu fecha de nacimiento con el formato dd/mm/aaaa: ")
    val fecha = readln()
    val fechaDividida = fecha.split("/")

    val dia = fechaDividida[0]
    val mes = fechaDividida[1]
    val ano = fechaDividida[2]

    println("Su fecha de nacimiento es: $dia / $mes / $ano")
}


/* Ejercicio 1.2.26
Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas, y
muestre por pantalla cada uno de los productos en una línea distinta. */

fun ej1_26() {
    print("Dime los productos que hay en la cesta de la compra (separados con comas): ")
    val productos = readLine()!!.split(",")

    for (producto in productos) {
        println(producto.trim())
    }
}


/* Ejercicio 1.2.27
Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades y muestre por pantalla
una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales, el número de
unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales. */

fun ej1_27() {
    print("Introduce el nombre del producto: ")
    val producto = readLine()!!

    print("Introduce su precio: ")
    val precio = readLine()!!.toFloat()

    print("Introduce las unidades: ")
    val unidades = readLine()!!.toInt()

    val total = precio * unidades

    print("Nombre del producto: $producto, Precio unitario: %09.2f, Número de unidades: %03d, Coste total: %011.2f".format(precio, unidades, total))
}