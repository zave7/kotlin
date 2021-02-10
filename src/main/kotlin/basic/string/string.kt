package basic

fun main() {
    // String template
    val name = "zave"
    println("$name")
    // 변수 명에 다른 문자열을 붙이면 변수로 인식하지 못한다. 그럴때는 중괄호로 감싸준다.
    println("test${name}test")
    // $를 출력하고 싶으면 이스케이프 시키면 된다.
    println("test\$asd")
}