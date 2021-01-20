package com.example.kotlinexample
//punto 1
fun main(){
    //punto 2
    var nombreDelAlumno: String = "Miguel Ahumada"
    println("Mi nombre es $nombreDelAlumno")
    //punto 3
    var num1: Int = 10
    var num2: Int = 20
    var num3: Int = 30
    //punto 4
    println("La suma de los números $num1, $num2, $num3 es: ${num1 + num2 + num3}")
    //punto 5
    var texto: String
    var caracter: Char
    //punto 6
    texto = "Ark Reigen"
    caracter = 'A'
    //punto 7
    println("La cantidad de caracteres de $texto es: ${texto.length}")
    caracter = 'B'
    //punto 8
    var floatExplicito = 10.9f
    //punto 9
    floatExplicito = 71.8f
    //punto 10
    println("El valor máximo del tipo BYTE es ${Byte.MAX_VALUE}")
    println("El valor máximo del tipo SHORT es ${Short.MAX_VALUE}")
    //punto 11
    println("El valor mínimo del tipo INT es ${Int.MIN_VALUE}")
    println("El valor mínimo del tipo LONG es ${Long.MIN_VALUE}")
    //punto 12
    var booleanTrue: Boolean = true
    println("El valor de la variable Boolean 'booleanTrue' es $booleanTrue")
    //punto 15
    imprimiendoParametros("Hola", "Hola nuevamente")
    println("El IVA de 15000 es ${obtieneIVA(15000)}")
}

//punto 13
fun imprimiendoParametros(param1: String, param2: String){
    println("El largo de '$param1' es ${param1.length} y el largo de '$param2' es ${param2.length}" +
            " y juntos suman un largo total de ${param1.length + param2.length}")
}

//punto 14
fun obtieneIVA(valor: Int): Float {return (valor * 0.19f)}