package kotlinDemo.collections

fun main(){
    val myMap = mutableMapOf<String , String>()

    myMap.put("Alfred" , "Pennyworth")
    myMap.put("Damian","Wayne")
    myMap["Barbra"] = "Gordon"
    myMap["Eubard"] = "Thawne"
    myMap["Poison"] = "Ivy"
    myMap["Damian"] = "Bruce Wayne"
    myMap["Lex"] = "Luthor"

    println(myMap)

    for (i in myMap)
        print("${i.key} ${i.value} , ")

    println()
    myMap.remove("Barbra")

    myMap.replace("Eubard" ,  "Reverse")
    myMap.replace("Poison" , "Ivy" , "New Value Green")

    var successs = myMap.replace("lix" , "Luthor" , "Kent")

    for ((key1 , value1) in myMap)
        print("$key1 $value1 , ")

    println(successs)


    //myMap.replaceAll { t, u -> t+1 }
}