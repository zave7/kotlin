package basic.scope

// scope 함수 `let`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 컨텍스트 객체를 람다 인자로 가진다
//      ㄴ 암시적인 기본 이름인 it 으로 접근이 가능하다
// 2. 리턴값
//      ㄴ 람다식의 결과를 리턴

class LetScope(val name: String, val age: Int)

fun main() {

    val let = LetScope("letScope", 7)
    val minusSix = let.let {
        println()
        it.age - 6
    }
    println(minusSix)

    val let2 = mutableListOf("0001", "0002", "0003")
    let2
        .map { it.toInt() * 3 }
        .filter { it > 4 }
        .let(::println) // 람다 대신 메서드 참조
}