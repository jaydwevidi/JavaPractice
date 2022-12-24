package kotlinDemo.oops.objectKeyword
fun main(){
    val x1 = Car.Factory.create("Honda City")
    val x8 = Car.Factory.create("Honda bfCity")
    val x2 = Car.Factory.create("Porsche")
    println(x1)
    println(x2)
    println(x8)
}
class Car {
    private var wheels:Int
    private var colour:String
    private var engine: String
    init {
        wheels = 0
        colour = if (wheels == 0)
            "white"
        else
            "Black"
        engine = "NA"
    }
    private constructor(wheels : Int , colour : String , engine: String){
        this.wheels = wheels
        this.colour = colour
        this.engine = engine

    }
    private constructor(){
        Car(4 ,"aj" , "afs")
    }
    object Factory{
        fun create(carName:String): Car {
            val x = when(carName){
                "Honda City" -> Car(4 , "White" , "i-VTech")
                "Porsche" -> Car()
                else ->     Car(4 , "Black" , "Jeep")
            }
            return x
        }
    }

    override fun toString(): String {
        return "[ $wheels , $colour , $engine ]"
    }
}