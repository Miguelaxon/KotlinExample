package com.example.kotlinexample

fun main(){
    /*var apellido: String = " Ahumada"
    var edad: Int = 36
    imprimirNombreCompleto(getNombre("Miguel"), apellido, edad)*/
    /*val perrito = Dog()
    perrito.sayHello()
    val perrito2 = Siveriano()
    perrito2.sayHello()*/
    /*val tiger: Tiger = TigerSiberian("chinese")
    tiger.sayHello2()
    val tiger2: Tiger = TigerSiberian("chilean")
    tiger2.sayHello2()*/
    var estudiante = EstudianteKotlin("Miguel", "36", "Santiago Centro")
    var estudiante2 = EstudianteKotlin("Miguel", "36", "Santiago Centro")
    println("${estudiante==estudiante2}")

}

data class EstudianteKotlin(var name: String, var age: String, var adress: String)

open class Tiger(val origin: String, val color:String){
    open fun sayHello2(){
        println("Un Tigre de $origin dice GRRRHH! y soy de color $color")
    }
}

class TigerSiberian(origin: String) : Tiger(origin, color="naranjo con blanco")

open class Dog{
    open fun sayHello(){
        println("WOW WOW!")
    }
}

class Siveriano : Dog(){
    override fun sayHello() {
        //super.sayHello()
        println("WOOOOW WOOOOOW!!!")
    }
}

fun getNombre(nombre: String): String{
    return nombre
}

fun imprimirNombreCompleto(nombre: String, apellido: String, edad: Int){
    println("$nombre $apellido $edad")
}