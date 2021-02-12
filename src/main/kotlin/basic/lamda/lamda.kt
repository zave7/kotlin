package basic.lamda

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = { number -> number*number}
//val square2 = {number : Int -> number*number} 이런식으로도 가능

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("zave", 1))
    val a = "zave1"
    val b = "zave2"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("zave", 24))
    println(calculateGrade(981))




    val lamda = {number : Double ->
        number == 4.234
    }

    // lamda 함수 선언 방식
    println(invokeLamda(lamda))
    // Lamda 리터럴 방식
    println(invokeLamda({ it > 3.2 }))
    println(invokeLamda{ it > 3.2 })
    // 첫번째 파라미터이자 마지막 파라미터 이기 때문에  { } 가능

    //익명 내부함수를 람다를 이용해서 사용하는 방법
    //1. kotlin 인터페이스가 아닌 자바 인터페이스여야 한다.
    //2. 그 인터페이스는 딱 하나의 메소드만 가져야 한다.
}

fun extendString(name : String, age : Int) : String {
    // 파라미터가 하나일 때는 it 이라는 예약어를 통해 사용할 수 있다.
    // this 가 가리키는 것은 확장함수를 call 하는 오브젝트이다.
    val introduceMyself : String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }
    return name.introduceMyself(age)
}

// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

// 람다의 Return
// 람다의 마지막 한줄이 return 값을 의미한다
// 리턴 하는 값은 타입이 하나이기 때문에 생략 가능
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "error"
    }
}

// 람다를 표현하는 2가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.234)
}

