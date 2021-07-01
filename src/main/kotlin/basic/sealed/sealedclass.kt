package basic.sealed

import java.lang.NullPointerException

// Sealed Class 특징
// 1. 클래스 앞에 sealed keyword 를 붙여 정의한다.
// 2. Sealed class 는 추상 클래스로 객체 생성이 불가하다.
// 3. Sealed class 의 생성자는 private 이다. public 으로 설정할 수 없다.
// 4. Sealed class 와 그 하위 클래스는 동일한 파일에 정의되어야 한다. 서로 다른 파일에서 정의할 수 없다.
// 5. 하위 클래스는 class, data class, enum, object class 로 정의할 수 있다.

// 상속 이나 중첩 클래스로 선언 가능하다.
// - Generic 타입도 선언할 수 있다.

sealed class SealedTest<out T : Any> {
    data class DataClass(val name: String)
    enum class EnumClass{NAME}
    class CommonClass(val name: String)
}
class ExtendsClass<out T : Any>(val name: T) : SealedTest<T>()

fun main() {

    // sealed class 를 상속받는 동일 클래스타입을 여러개 생성할 수 있다. ( enum 과 다르게 )
    val data1 = SealedTest.DataClass("1")
    val data2 = SealedTest.DataClass("2")
    println(data1 == data2) // 같은 객체가 아니다

    // Enum 도 가능하다
    val enum1 = SealedTest.EnumClass.NAME
    val enum2 = SealedTest.EnumClass.NAME
    println(enum1 == enum2) // 같은 enum 객체

    val common = ExtendsClass("common")

}