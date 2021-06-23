package basic.scope

// scope 함수 `also`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 컨텍스트 객체를 람다 인자로 가진다
//      ㄴ 암시적인 기본 이름인 it 으로 접근이 가능하다
// 2. 리턴값
//      ㄴ 컨텍스트 객체를 리턴한다

data class AlsoScope(val name: String, val age: Int)

fun main() {

    // 1. 람다 객체를 인자로 받아 it 으로 접근 혹은 다른 이름 지정
    val alsoScope = AlsoScope("also", 55)
        .also { println("AlsoScope 를 생성하였습니다 : $it") }
        .also { also -> println("한번 더 출력 : $also") }
}