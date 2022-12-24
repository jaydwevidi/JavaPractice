package kotlinDemo.oops.interfaceInheritance

interface DraggableI {
    val name:String

    //val name1:String = "name"
    // Property initializers are not allowed

    fun drag(dragBy : Int){
        println("Interface : $name dragged by $dragBy")
    }
}