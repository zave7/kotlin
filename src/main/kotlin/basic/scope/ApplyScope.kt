package basic.scope

// scope 함수 `apply`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 람다 수신자로서의 컨텍스트를 this 키워드로 참조
//      ㄴ `run`을 사용할 경우 내부 scope 는 this 의 성질을 같는다
// 2. 리턴값
//      ㄴ 컨텍스트 객체를 리턴한다

class ApplyScope(val name: String, val age: Int) {
    fun printName() {
        println("Object name : $name")
    }
}

fun main() {

    // 1. 람다 수신자
    // 프로퍼티에 바로 접근이 가능하다
    // 스코프 함수 apply 의 타입이 수신 객체 타입이기 때문이다.
    val applyScope: ApplyScope = ApplyScope("apply", 1).apply { println("age: $age")}

    // 2. 컨텍스트 객체를 반환하기 때문에 체이닝 방식으로 작성 가능
    applyScope.apply(ApplyScope::printName).apply { println("모든 프로퍼티를 출력했어요!") }

}

