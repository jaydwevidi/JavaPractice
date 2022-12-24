package kotlinDemo.kotlinSyntax.specialsKotlin

import java.lang.Exception

fun main() {
    println("Nullability")
    var s2:String? = null
    var d = Integer.valueOf("786")

    if (d % 2 == 0 || d % 2 == 1){}
        //s2 = "Barbra Gordon"

    val x3 = s2?.uppercase()
    //val x2 = s2!!.uppercase()
    println("x == ${x3?.uppercase()}")

    x3?.let {
        println(x3.uppercase())
        println(it)
    }

    val ds : String = x3 ?: "NA"

    try {
        println(x3!!.uppercase())
    }catch (e: Exception){
        println("Error ho gai : $e")
    }


}