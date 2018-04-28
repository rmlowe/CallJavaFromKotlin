package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car


fun main(args: Array<String>) {

    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    //var model: String = car.model
    //println(model.javaClass)
    //model = null
    //println(model)

    val color: Int = car.color

}