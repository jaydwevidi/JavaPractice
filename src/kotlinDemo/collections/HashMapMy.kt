package kotlinDemo.collections

import java.util.*
import kotlin.math.absoluteValue

fun main(){
    val ob = HashMapMy<String>()
    ob.hashTreePrint()
    ob.add("Ross Geller")
    ob.add("Monika Geller")
    ob.add("Joey Tribbiani")
    ob.add("Phoebe Buffay")
    ob.add("Rachel Green")
    ob.add("Chandler Bing")
    ob.add("Chandler Bing")
    ob.add("Ben Gellar")
}

class HashMapMy<T>(private var capacity: Int = 5) {
    var size: Int = 0
        private set

    var arr = Array(capacity) { LinkedList<T>() }
        private set

    private fun findHash(x: T) = x.hashCode().absoluteValue  % capacity

    fun add(data: T) {
        val hash = findHash(data)
        if (arr[hash].contains(data)){
            println("$data already Exists")
            return
        }

        arr[hash].add(data)
        size++

        checkOverload()
    }

    fun contains(value: T) = arr[findHash(value)].contains(value)

    private fun checkOverload() {
        if (size >= capacity * 0.9)
            arrayOverloaded()
        hashTreePrint()
    }

    private fun arrayOverloaded() {
        println("Inside arrayOverloaded()")
        //printHashTree()
        val temp = HashMapMy<T>((capacity * 1.5).toInt())
        for (i in arr) {
            for (j in i) {
                temp.add(j)
                //print("j = $j")
            }
        }

        println("All Older Elements Added")

        arr = temp.arr
        capacity = temp.capacity

        println()
        println()

    }

    fun hashTreePrint() {
        println("size = $size , capacity = $capacity")
        for (element in arr) {
            print(element)
        }
        println()
        println()
    }
}