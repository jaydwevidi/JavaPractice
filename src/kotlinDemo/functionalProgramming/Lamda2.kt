package kotlinDemo.functionalProgramming

fun main() {

    val fn1 = {a:Int , b:Int -> a*b}
    val fn2: (Int, Int, String) -> Double = {
            x, // Automatic type inference
            y, // Automatic type inference
            z: String ->

        var num = x * y

        if (z.length < 5)
            num = 123

        num.toDouble()
    }

    println(fn2(5,6,"Bruce Banner"))

    val fn3 : (Int) -> Int = { it+it } // Single Parameter
}