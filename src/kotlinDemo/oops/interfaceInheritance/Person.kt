package kotlinDemo.oops.interfaceInheritance

open class Person(override val name: String) : DraggableI {
    val age = 10
    override fun drag(dragBy: Int) {
        super.drag(dragBy)
        println("Person : $name dragged by $dragBy")
    }

    open fun fly(){
        println("Person : $name is flying")
    }
}