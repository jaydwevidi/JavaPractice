package kotlinDemo.collections

fun main(){
    var myList = mutableListOf<Int>()
    myList.addAll(listOf(43,134,1,34,3,41,34,12,34,2))

    println(myList)
    myList.removeAt(3)
    println(myList)

    for (i in myList)
        print("$i , ")

    for (i in 0 until myList.size)
        print("${myList[i]} , ")


}