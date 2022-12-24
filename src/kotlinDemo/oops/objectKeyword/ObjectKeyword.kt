package kotlinDemo.oops.objectKeyword

import kotlinDemo.oops.interfaceInheritance.Person

fun main() {
    var x1 = object {
        private val x = 53
        var y = 53
            private set
        private fun sum() = x + y

        fun incrementY(incrementBy : Int = 1) {
            y += incrementBy
        }

        fun printSum(){
            println(sum())
        }
    }

    val x2 = object : Person("Clark Kent"){

        fun eat(food : String = "Dal Chawal") = println("$name is eating $food")

        override fun fly() {
            super.fly()
            println()
        }

        override fun drag(dragBy: Int) {
            println()
            super.drag(dragBy)
        }
    }

    x2.eat()
    x2.drag(54)


    println("\n\nobject x1")
    x1.printSum()
    x1.incrementY(2)
    x1.printSum()
}