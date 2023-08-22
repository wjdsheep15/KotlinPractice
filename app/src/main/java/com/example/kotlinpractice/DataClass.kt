package com.example.kotlinpractice

/** 15. data class
 *
 * **/
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy() 이게 만들어진다.

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir", "jung", "2023-8-23", 14)
    val ticketB = TicketNormal("koreanAir", "jung", "2023-8-23", 14)

    println(ticketA)
    println(ticketB)
}
