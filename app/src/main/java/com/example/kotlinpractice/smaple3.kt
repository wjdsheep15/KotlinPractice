package com.example.kotlinpractice

/** 17. object
 * Singleton Pattern
 * 실행이 될때 한번 된다.
 *
 * **/

object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horesPower: Int) : Car {
        val car = Car(horesPower)
        cars.add(car)
        return car
    }
}

data class Car(val horesPower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}