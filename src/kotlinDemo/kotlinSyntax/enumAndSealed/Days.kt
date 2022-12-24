package kotlinDemo.kotlinSyntax.enumAndSealed
fun main(){
    var x = Days.saturday

    for(i in Days.values())
        print("${i.name} : ${i.num} , ")

    println()
    println("Values = ${Days.values().toList()}")
    Days.saturday.printDay()
}
enum class Colours{
    Red , Green , Blue
}
enum class Days(val num : Int , val time:Int) {
    sunday(0 , 12),
    Monday(1 , 12),
    tuesday(2 , 12),
    wednesday(3 , 12),
    thursday(4 , 12),
    friday(5 , 12),
    saturday(6 , 12);

    fun printDay(){
        val day = this
        println("day is $day")
    }
}