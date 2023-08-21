package com.example.kotlinpractice

import java.util.Locale

fun main() {
    helloWorld()
    ignoreNulls("Jung")
}

/** 1. 함수
 * 함수 형태 : fun 함수명() : 자료형 {}
 * 만약 함수의 리턴이 없다면 자료형 == Unit
 *
 * Redundent : 색이 회색, 생략 가능 => Unit 생략 가능
 * but return 하는 경우 자료형 생략은 불가능
 *
 * 파라미터 사용하는 경우 형태 : fun 함수명( 변수명 : 자료형, 변수명 : 자료형) : 자료형(리턴 자료형) {}
 * 변수명을 먼저 : 자료형 이 뒤로 오는 구조
 * **/

fun helloWorld(): Unit {
    println("Hello Wolrd!!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

/** val vs var
 * val = value
 * var = 변수,  val = 상수
 * JAVA랑 다르게 자료형을 안적어도 된다.
 */

fun hi() {
    val a: Int = 10
    var b: Int = 9

    // a = 100  변경이 불가.
    b = 100 // 변경이 가능하다.

    val c = 100
    var d = 100
    var name = "Jung"
    var name1: String = "Seung"
}

/** 3. String Template
 * 형태 : ${변수명}
 * 문자 중간에 변수명으로 불러옴
 * $표시를 사용하고 싶을때는 \$
 * ${0==0}, ${0==1} true, false 표시
 *
 * 예시
 * val name = "Jung"
 * val lastName = "See"
 * println("my name is ${name + lastName} I'm 26")
 * println("is this true? ${0==0}")
 * println("this is 2\$a")
 * **/


/** 4. 주석
 * 한 줄 주석은 / : 단축키 Ctrl + /
 * 여러 줄 주석은 /**/
 * **/

/** 5. 조건식
 * 자바와 같이 사용
 * 코틀린은 간단하게 줄여서 사용 가능
 * fun maxBy2(a: Int, b: Int) : Int=if(a>b) a else b
 *
 * when() : 자바에서는 switch문과 같다
 * 형태 :
 * when(변수) {
 *      변수 -> println()
 *      else -> println()
 * }
 *
 * when은 변수 값을 정할 때도 사용
 *  변수 명 : 자료형 = when(변수){
 *      1 -> 1
 *      2 -> 2
 *      else -> 3
 *  }
 * **/
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int): Int = if (a > b) a else b

fun cheakNum(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("i don't know")
    }

    var b: Int = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okey")
    }
}


/** 6. Expression vs Statement
 * Expression : 문장을 진행 시켜 값을 반환, if문
 * Statement : 문장을 진행시켜 선택시킴,when(일부분)
 *
 * 모든 코들린의 함수들은 Expression, 리턴값이 없더라도 Unit를 반환 하여 Expression
 *
 */

/** 7. Array and List
 *  Array 크기가 지정함
 *  선언 : val array = arrrayOf(내용들), arrayOf() 함수를 사용하여 초기화

 *
 *  List
 *  1. List 수정이 불가능
 *  선언 : val list = listOf(내용들), listOf() 함수를 사용하여 초기화
 *
 *  2. MutableList 수정이 가능
 * 선언 : val arrayList = arrayList<자료형>()
 * 변수명.add(), 변수명.remove() 등등 가능
 * **/

fun array(){
    val array=arrayOf(1,2,3) // array 초기화
    val list = listOf(1,2,3) // list 초기화

    val array2= arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    // list[0]=2 변경이 불가능
    var result : Int = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

/** 8. 반복문 for, while
 * for 형태 : for( 변수 in 범위){}
 * for ( i : Int in 1..10 step 2){} : 2
 * for ( i in 10 downTo 1){}  : 10 부터 1까지
 * for ( i in 1 until 100){}  : 1부터 99까지
 *
 * while 문 형태 : while(조건){} 자바랑 같음
 * **/

fun forAndWhile(){
    val students : ArrayList<String> = arrayListOf("jung", "james", "jenny", "jennifer")
    for (name:String in students){
        println("${name}")
    }

    for ( (index:Int, name:String) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for( i in 1..100){
        sum += i
    }
    println(sum)

    var index: Int = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}

/** 9. Nullable NonNull
 * NPE : NULL pointer Exception
 *
 * 변수가 null 일때 자료형에 ? 붙임
 *
 * ?: 변수가 null 일때 default 값을 주기 위해 사용
 *
 * !! 이거 null이 아니다
 *
 * let{} : null이면 람다식 내부로 욺긴다.???
 * **/

fun nullcheck(){
    var name : String = "Jung"

    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase : String? = nullName?.toUpperCase()

    val lastNAme :String? = null//"Seung"

    // ?:
    val fullName = name + " " + (lastNAme?: "No lastName")
    println(fullName)

}

//!!
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "jung@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}

