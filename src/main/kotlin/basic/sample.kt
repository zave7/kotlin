package basic

fun main() {
    //helloWorld()
    hi()
}

//1. 함수

// 리턴 타입은 default 가 Unit 이다. (Void) 랑 같다고 생각하면됨
// 리턴이 없을경우 생략가능하다.
fun helloWorld() : Unit {
    println("Hello World")
}

// 변수 선언 ( 변수명이 타입보다 먼저 나옴 )
// 변수명 : 타입
fun add(a : Int, b : Int) : Int {

    return a + b
}

// val vs var
// val 은 변경 불가능
// var 는 변경 가능
fun hi() {
    val a : Int = 10
    println(a)
}
