package kotlinDemo.functionalProgramming

fun main(){
    val list = listOf<Int>(11 ,12 ,14 ,15,15,26,4,5,435,234)

    val sqList1 = list.map { num : Int -> num * num}
    val sqList2 = list.map (::square) // same

    println("sq list = $sqList1")

    val userList = mutableListOf<User>()
    userList.apply {
        add(User(1 , "Hal Jordan"))
        add(User(2 , "Barry Henry Allen"))
        add(User(3 , "Jay Garrick"))
        add(User(4 , "John Jones"))
        add(User(5 , "Diana Prince"))
        add(User(6 , "Arthur Curry"))
    }

    println(userList)

    val userPaidList = userList.map {
        var new : PaidUser = if (it.name.length < 12)
            PaidUser(it.id , it.name , SubscriptionPlan.Family)
        else
            PaidUser(it.id , it.name , SubscriptionPlan.Student)

        new // ^map
    }
    println()
    userPaidList.forEach { println("forEach : $it") }
    println()
    userPaidList.forEach { it.id = it.id*it.id }
    println("id Updated")
    userPaidList.forEach { println("forEach : ${it.id} , ${it.name}") }
}
fun square(num : Int) = num*num

data class User(
    var id:Int ,
    val name : String
)

data class PaidUser(
    var id:Int,
    var name: String,
    val plan: SubscriptionPlan

)

enum class SubscriptionPlan{
    Student ,
    Single ,
    Family
}