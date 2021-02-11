package basic.iter


fun main() {

    forAndWhile()
}
// for, while

fun forAndWhile() {
    val student = arrayListOf("zave", "yejin")
    for ( name in student) {
        println("${name}")
    }

    var sum : Int = 0
    for ( i in 1..10 step 2) { // step 숫자만큼 건너뜀, downTo 몇 부터 몇까지 다운, until 몇 부터 몇 미만 까지(몇-1) 까지
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10) {
        println("current index : ${index}")
        index++
    }

    // 인덱스와 함께
    for ((index, name) in student.withIndex()) {
        println("${index+1} 번째 학생 : ${name}")
    }
}