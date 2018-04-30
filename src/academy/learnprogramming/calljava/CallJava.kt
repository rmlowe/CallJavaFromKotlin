package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car


fun main(args: Array<String>) {

    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings)

    car.wantsIntArray(intArrayOf(1, 2, 3))

    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod( { println("I'm in a thread!") })

    //(car.anObject as java.lang.Object).notify()

    //var model: String = car.model
    //println(model.javaClass)
    //model = null
    //println(model)

    //val color: Int = car.color

}