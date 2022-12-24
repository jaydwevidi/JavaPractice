package kotlinDemo.oops.interfaceInheritance
open class SuperClass1(val sides: Int)  {

    open fun area():Double{
        return 0.0
    }
}
class Child1(sides: Int): SuperClass1(sides) {
    override fun area(): Double = 43.4
}

class child2(sides: Int): SuperClass1(sides) {
}