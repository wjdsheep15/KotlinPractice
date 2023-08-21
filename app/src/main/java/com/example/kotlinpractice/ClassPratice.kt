package com.example.kotlinpractice

/** 10. class
 * JAVA랑 같은 방식
 * 생성자 사용시 클래스 명에 constructor(변수명 : 자료형)을 사용
 * init{} 주 생성자의 일부
 * 보조 생성자 constructor(변수명 : 자료형, 변수명 : 자료형){
 *  내용
 * }
 *
 * init 내용이 주 생성자라서 먼저 나온다.
 *
 * 다른 클래스 상속하기 위해서는 모 클래스 앞에 open 적어준다. 코틀린 class의 default가 private
 * 상속 할때 override , 그 모 함수에 open 적어준다.
 *
 * **/

open class Human constructor( val name : String = "Anonymous"){
// java
    /*class Person{
    public Person(String name){
    }

    public Person(String name, int age){
    this(name);
    }
     */

    constructor(name:String, age:Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }
    init{
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so yummyyy")
    }

    open fun singASong(){
        println("lalalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("라라랄")
        println("my name is : ${name}")
    }
}

fun main(){
//    val human = Human("Minsu")
//
//    val stranger= Human()
//    human.eatingCake()

//    val mom = Human("Kuri", 50)
//    println("This is human's name is ${strange.name}")
    val korean = Korean()
    korean.singASong()
}