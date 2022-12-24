package kotlinDemo.kotlinSyntax.extra

fun main(){

    val array = arrayOfNulls<Int>(10)
    array[5] = 43
    array[1] = 53

    for (i in 1..3)
        print("$i ")
    println()


    for (i in 6 downTo 0 step 2)
        print("$i ")
    println()


    for (i in array.indices)
        print("$i: ${array[i]} , ")

    println()
    println()

    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}