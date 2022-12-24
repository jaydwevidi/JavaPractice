package kotlinDemo.functionalProgramming

fun main(){
    val list = listOf<Int>(11 ,12 ,14 ,15,15,26,4,5,435,234)


    val even1 = list.filter { num : Int -> num % 2 == 1 }
    val even2 = list.filter { it % 2 == 1 }
    val even3 = list.filter ( ::isOdd )
    val even4 = list.filter (){ it % 2 == 1}
    val even5 = list.filter (fun(num : Int) = num % 2 == 1)
    // All 5 lines have the same functionality


    println("Filtered List = $even3")




}
fun isOdd(num : Int):Boolean = num % 2 == 1
