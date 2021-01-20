package com.example.kotlinexample

import android.graphics.ColorSpace

fun main(){
    /*val nulleable = "Algo pasa"
    println(describeString(null))
    val example = GenericClass("p1", "p2", "p3", "p4", "p5", "p6")
    println(example.sizeElement())
    example.addElemnt("p7")
    println(example.sizeElement())
    cases(1)
    cases("Hello")
    cases(true)
    cases("bye")
    val cakes = listOf("uno", "dos", "tres")
    for (cake in cakes) println("Los números son $cake")
    for (i in 10 downTo  0) println(i)
    for (j in 1..10) println(j)
    for (x in 1..10 step 2) println(x+1)
    val a1 = setOf("uno", "tres", "dos")
    val a2 = setOf("tres", "dos", "uno")
    println(a1 == a2)
    println(a1 === a2)
    val a = 1
    val b = 2
    println(max(a,b))
    val gato = Gato("runrun", 2)
    val gato2 = Gato()
    val gato3 = Gato("GatoHamster")
    val red = Color.RED
    println(red)
    println(red.rgb)
    println(red.containsRed())
    println(Color.BLUE.containsRed())*/
    var mamifero: String
    mamifero = saludar(Humano("Miguel"))
    println(mamifero)
    mamifero = saludar(Gato1("cuhicuchi"))
    println(mamifero)
}

sealed class Mamifero(val name: String)
class Gato1(val nomGato: String): Mamifero(nomGato)
class Humano(val nomHumano: String): Mamifero(nomHumano)
fun saludar(mamifero: Mamifero): String{
    when(mamifero){
        is Humano -> return "Hola Humano, ${mamifero.name}"
        is Gato1 -> return "Miau miau, ${mamifero.name}"
    }
}

enum class Color(var rgb: Int){
    RED(0xFF000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

class Gato(){
    constructor(name: String, age: Int) : this()
    constructor(breed: String) : this()
    init {
        println("miau")
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun cases(objeto: Any){
    when(objeto){
        1 -> println("One")
        "Hello" -> println("es un saludo")
        is Long -> println("es numérico")
        !is String -> println("no es String")
        else -> println("nosé de que tipo es")
    }
}

fun <Y> funcionExample(vararg element: Y) = GenericClass(1,2,3,4,5,6)

class GenericClass<X>(vararg item: X){
    private val listElement = item.toMutableList()

    fun addElemnt(element: X) = listElement.add(element)

    fun sizeElement() = listElement.size
}

fun describeString(maybeString: String?): String{
    /*return if(maybeString != null && maybeString.isNotEmpty()){
        "El largo del String es ${maybeString.length}"
    } else {
        "Empty or null String"
    }*/
    return maybeString ?: "ya noes null"
}