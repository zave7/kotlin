package basic.scope

// scope 함수 `run`

// 1. 객체의 컨텍스트를 참조하는 방식
//      ㄴ 람다 수신자로서의 컨텍스트를 this 키워드로 참조
//      ㄴ `run`을 사용할 경우 내부 scope 는 this 의 성질을 같는다
// 2. 리턴값
//      ㄴ 함수 리터럴의 마지막 expression
// 3. 비확장 함수로도 사용가능하다.
//      ㄴ 표현식이 필요한 곳에서 다수의 구문 블럭을 실행할 수 있도록 해준다

// 람다가 객체 초기화와 리턴 값 연산을 모두 포함하고 있을 때 유용하다

class RunScope(val name: String, val age: Int)

fun main() {

    val run = RunScope("testRun", 3)
    val plusFive = run.run {
        println("객체 컨텍스트 내의 run 실행")
        this.age + 5
        // or age + 5
    }
    println(">>> 컨텍스트 내 실행 결과 : $plusFive")

    // 비확장 함수로 사용
    val run1 = run {
        println("비확장 함수 실행")
        1 + 10
    }
    println(">>> 비확장 함수 실행 결과 : $run1")

}