package kotlinDemo.functionalProgramming

fun main(){

    var id = 99

    val ob1 = PaidUser(32,"Barry Allen" , SubscriptionPlan.Family)
    val ob2: PaidUser? = PaidUser(23,"John Jones" , SubscriptionPlan.Single)
    val ob3: PaidUser? = null

    val new = ob1.apply {
        id = 43
        name = "Jay Garrick"
        println(this)
        this.id = 44
        println(this)
        println(ob1)
    }

    ob2?.apply {
        id = 54
        name = "Ray Palmer"
    }

    ob3?.apply {
        id = 43
        name = "Jay Garrick"
        println(this)
        this.id = 44
        println(this)
        println(ob1)
    }

}