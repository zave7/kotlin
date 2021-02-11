package basic.condition

fun main() {
    //println(maxBy(2,3))
    checkNum(1)
}

fun maxBy(a:Int, b:Int):Int{
    if(a>b)
        return a
    else
        return b
}

//Expression
//코틀린에는 삼항 연산자가 없다
fun maxBy2(a : Int, b : Int) = if(a>b) a else b


//switch case
//when
fun checkNum(score : Int) {

    //statement
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("tish is 2 or 3")
        else -> println("I don't know")
        // else 가 없어 도 됌
    }

    // expression 에서는 항상 else가 있어야 한다.
    var b = when(score) {
        1 -> 1
        2 -> 3
        else -> 3
    }

    println("b : ${b}")

    //statement
    when(score) {
        in 90..100 -> println("You are genius")
        in 10..60 -> println("not bad")
        else -> println("okay")
    }
}

//Expression
//값을 만들면 expression 이다.

//코틀린의 모든 함수는 expression이다 (Unit 을 반환하기 때문이다)

//코틀린은 if 문에서도 값을 반환할 수 있다