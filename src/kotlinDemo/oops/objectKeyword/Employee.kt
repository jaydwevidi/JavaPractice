package kotlinDemo.oops.objectKeyword
fun main(){
    var ob3 = Employee.Name
    var ob4 = Employee.Name

    ob3.displayName()
    ob4.displayName()

    ob3.s = "new name"

    ob3.displayName()
    ob4.displayName()

    println(ob3 == ob4)
}
class Employee {
    object Name{
        init {
            println("init")
        }
        var s = "haha"
        fun displayName(){
            println("name is = $s");
        }
    }
}