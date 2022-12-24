package kotlinDemo.kotlinSyntax.extra

open class GetterAndSetter {
    private val val1 = 342

    /*
    private val val2 = 341
        private get // redundant
        private set // val cannot have a setter
     */
    var val3 = 3421
        private set

    var simple = 324
        get() = field + 1 // redundant
        set(value) {
            if (value % 2 == 5)
                field = value + 3
            else
                field = value + 4
        }

    var val6 = 6
        private set(value) {
            field = if (value % 2 == 5)
                value + 3
            else
                value + 4
        }


}