package basic.scope

// scope 함수 `run`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 람다 수신자로서의 컨텍스트를 this 키워드로 참조
// 2. 리턴값
//      ㄴ 람다식의 결과를 리턴

class RunScope(val name: String, val age: Int)

fun main() {

    val run = RunScope("testRun", 3)
    val plusFive = run.run {
        this.age + 5
    }
    println(plusFive)
}