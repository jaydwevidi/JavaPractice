package kotlinDemo.kotlinSyntax.dataClass
fun main(){
    val x1 = Person1(1 , "Joey Tribbiani")
    val x2 = Person1(2 , "Ross Geller")
    val x3 = Person1(2 , "Ross Geller")

    val y1 = Person2(1 , "Joey Tribbiani")
    val y2 = Person2(2 , "Ross Geller")
    val y3 = Person2(2 , "Ross Geller")

    val z1 = Person3(1 , "Joey Tribbiani")
    val z2 = Person3(2 , "Ross Geller")
    val z3 = Person3(2 , "Ross Geller")

    println(x3 == x2) // data class
    println(y3 == y2) // normal class
    println(z2 == z3) // normal class with overridden equals

    println()

    println(x1) //Person1(id=1, name=Joey Tribbiani)
    println(y1) //kotlinDemo.kotlinSyntax.dataClass.Person2@7ba4f24f
    println(z1) //kotlinDemo.kotlinSyntax.dataClass.Person2@7ba4f24f




}
data class Person1(
    val id : Int,
    val name : String
)
class Person2(
    val id : Int,
    val name : String
)

class Person3(
    val id : Int,
    val name : String
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person3) return false

        other as Person3

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        return result
    }
}
