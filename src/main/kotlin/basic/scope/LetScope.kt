package basic.scope

// scope 함수 `let`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 컨텍스트 객체를 람다 인자로 가진다
//      ㄴ 암시적인 기본 이름인 it 으로 접근이 가능하다
// 2. 리턴값
//      ㄴ 함수 리터럴의 마지막 expression ( scope 의 마지막 값을 리턴한다 )

class LetScope(val name: String, val age: Int?) {

    override fun toString(): String {
        return "LetScope(name='$name', age=$age)"
    }
}

// top-level function
fun isOdd(let: LetScope) : Boolean {
    if(let.age != null) {
        return let.age % 2 == 1
    }
    return false
}

fun main() {

    // 1. 기본 let
    val let = LetScope("letScope", 7)
    val minusSix = let.let {
        println("let 함수 실행 : $it")
        it.age?.minus(6)
    }
    println(">>> 결과 : $minusSix")

    // 2. 스트림 내 let
    val let2 = mutableListOf(
        LetScope("0001", 1),
        LetScope("0002", 2),
        LetScope("0003", 3))
    let2
        .filter(::isOdd) // 람다 대신 최상위 메서드 레퍼런스
        .map {
            println("age : ${it.age}")
            it.name.toInt() * 3
        }
        .let {
            val test = 1
            println("list + 1 : ${it + test}") // + 연산자의 결과로 read-only collection 이 생성된다.
        }

    // 3. null check
    var nullableLet: LetScope? = null
    nullableLet?.let {
        println("null check")
    }

    // 테스트 중에 발견했음.. 뭔지 더 자세히 알아보자!
    null?.let {
        println("?")
    }
}