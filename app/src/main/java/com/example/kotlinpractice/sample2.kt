package com.example.kotlinpractice

/** 11. Landa
 * 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
 * 1) 메소드의 파라미터로 넘겨줄수 있다. fun maxBy(a : Int)
 * 2) return 값으로 사용할 수가 있다.
 *
 * 람다의 기본 정의
 * val lamdaName : Type = {argumentList-> codeBody}
 *
 * **/

val square : (Int) -> (Int) = {number:Int -> number*number}

val nameAge ={name : String, age : Int ->
    "my name is ${name}, I'm ${age}"
}
fun main(){
    println(square(12))
    println(nameAge("Jung", 26))

    val a = "jung said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("jung", 26))
    println(calculateGrade(971))

    val lamda={ number: Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda { it > 3.22 })


}

/*** 12. 확장함수
 *
 * **/

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!!"
}

fun extendString(name : String, age : Int) : String {

    val introduceMyself : String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }
    return name.introduceMyself(age)
}

/** 13. 람다의 리턴
 * 람다의 마지막 줄이 리턴이다.
 * **/
val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40->"fail"
        in 41..70->"pass"
        in 71..100 -> "pefect"
        else -> "Error"
    }
}

/** 14. 람다를 표현하는 여러가지 방법
 *
 * Kotlin interface가 아닌 자바 인터페이스여야 한다.
 * 그 인터 페이스는 딱 하나의 메소드만 가져야 한다.
 * **/
fun invokeLamda(lamda : (Double)-> Boolean) : Boolean{
    return lamda(5.2343)
}
/** 15. DataClass
 *
 * **/