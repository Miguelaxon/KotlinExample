package com.example.kotlinexample
/*
//Tarea 1
fun main(){
    print("Hola Mundo ")
    println("mundial")
    var number : Int = 10
    val number2 : Int = 9
    number = 8
    var texto = "Miguel"
    var template : String
    var texto2 : String = "texto"
    template = "Mi nombre es: "
    println("$template $texto y contiene ${texto.length} carácteres")
    println("$number $number2")
}*/

/*//Tarea 2
fun main(){
    var entero : Int = 36
    var caracter : Char = 'm'
    var flotante : Float = 70.5F
    var nombre : String = "Miguel"
    println("Mi nombre es $nombre, tengo $entero años, mi sexo es $caracter " +
            "y mi peso es $flotante kilos")
}*/

//Tarea 3
fun main(){
    var num1 : Int = 10
    val num2 : Int = 33
    val num3 : Int = 66
    var sumatoria : Int
    var total : Int
    sumatoria = num1 + num2 + num3
    println("La suma de $num1, $num2, $num3 es $sumatoria")
    num1 = 55
    sumatoria = num1 + num2 + num3
    println("La suma de $num1, $num2, $num3 es $sumatoria")
    total = sumatoria / 3
    println("El promedio de $num1, $num2 y $num3 es $total")
}