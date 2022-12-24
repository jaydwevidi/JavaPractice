package kotlinDemo.functionalProgramming

// Functions are treated as first class citizens in Kotlin ,
// as in,
// functions can be stored as variables and also passed around as arguments and can also be returned
fun main(){
    val multi :(Int , Int) -> Double = ::multiply
    val power :(Int , Int) -> Double = ::pow

    val ans = calc(5 , 7 , multi)
    val ans2 = calc(6 , 7 ) {
            a , b -> (a*b+1).toDouble()
    }
    /*
    for better readability
    if the last parameter is a function in a function
    then the function can be passed like this in curly braces

    */

    println(ans)
}

fun multiply(a: Int , b : Int) : Double =  a*b.toDouble()


fun pow(a:Int , b:Int) : Double {
    return Math.pow(a.toDouble(), b.toDouble())
}

fun calc(a : Int , b : Int , job : (Int , Int) -> Double) : Int{
    return job(a ,b ).toInt()
}
