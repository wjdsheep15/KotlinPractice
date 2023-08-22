package com.example.kotlinpractice


/** 16. Companion object
 *
 * **/

class Book private constructor(val id : Int, val name : String){
    companion object bookFactory : IdProvider {

        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"

        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    val bookId = Book.bookFactory.getId()
    println("${book.id} ${book.name}")
}