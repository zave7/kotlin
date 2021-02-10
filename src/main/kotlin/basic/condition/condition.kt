package basic.condition

fun main() {
    println(maxBy(2,3))
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
    when(score) {
        0 -> println("this is 0")
    }
}