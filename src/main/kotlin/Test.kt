class Test {

}

fun main() {

    // 클로저 테스트
    // 내부적으로는 inner 클래스를 이용해 처리한다.
    // Ref.IntRef 사용
    // Primitive type 은 각각 전부 Ref 클래스 내에 작성되어있고
    // Reference type 은 ObjectRef 클래스를 활용하는 것 같다.
    val test2 : () -> Unit = run {
        val tests = run {
            var x = 0
            val test : () -> Unit = {
                if(x>3) {
                    println("5보다 큼")
                    x += 100
                }
                println(++x)
            }
            test
        }
        tests
    }
    test2()
    test2()
    test2()
    test2()
    test2()
    test2()

}