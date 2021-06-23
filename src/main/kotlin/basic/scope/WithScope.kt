package basic.scope

// scope 함수 `with`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 람다 수신자로서의 컨텍스트를 this 키워드로 참조
//      ㄴ `run`을 사용할 경우 내부 scope 는 this 의 성질을 같는다
// 2. 리턴값
//      ㄴ 함수 리터럴의 마지막 expression
// 3. 비확장 함수이다

data class WithScope(val name: String, val age: Int)

fun main() {

    val with: WithScope = WithScope("with", 25)

    val result = with(with) {
        println("also Scope $name")
        1
    }
    println("${result == 1}")

}
