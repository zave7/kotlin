package basic.lamda

import basic.scope.ApplyScope
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@ExperimentalContracts
fun main() {

    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }

    1.zave { println("모든 객체에서 사용가능..") } // 커스텀 스코프 함수

    val sum = fun Int.(num: Int): Int = this + num // 함수 타입을 수신 객체 타입으로 선언

    println(1.sum(2))
}

class Receiver {
}

class HTML {
    fun body() {
        println("람다 수신자")
    }
    fun body(int: Int) {
        println("람다 수신자 $int")
    }
}

val intPlus: Int.(Int) -> Int = Int::plus

fun html(init: HTML.() -> Unit): HTML {
    return HTML().apply(init)
}

val htmlTest: HTML.(Int) -> Unit = HTML::body

fun ApplyScope.test() {
    println("확장함수 age : $age")
}

@ExperimentalContracts
public inline fun <T> T.zave(block: T.() -> Unit): T {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    block()
    return this
}