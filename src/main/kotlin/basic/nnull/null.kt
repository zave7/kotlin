package basic.nnull

fun main() {
    //nullCheck()
    ignoreNulls("test")
}

fun nullCheck() {
    // NPE NullPointerException
    // 널을 컴파일 시점에 잡아주기 위해 코틀린에서 방법을 강구했다.

    var name : String = "zave" // null 이면 안되는 타입

    var nullName : String? = "null" // ? 을 붙여주면 Nullable 타입이된다.

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()
    // 기본적으로 Nullable인 변수에 접근하게되면 ?키워드를 붙여 줌으로써
    // null일 경우에는 null을 반환하도록 할 수 있게 컴파일 시점에 강제한다.
    // 따라거 추론되는 타입도 nullable이 된다.

    // ?: Elvis 연산자 null일 경우 기본값 지정
    val lastName : String? = "zave"
    val fullName = name +  " " + (lastName?:"No LastName")
    println(fullName)


}

//!! null 이 아닌것을 보증한다는 키워드
fun ignoreNulls(str : String?) {
    val mNotNull : String = str!! // 사용하는것을 지양해야한다.
    val upper = mNotNull.toUpperCase()


    val email : String? = "test"
    // email 이 Null 이 아니면 let 함수를 실행해라
    // let은 자신의 리시버 객체를 람다식 내부로 옮겨서 실행하는 구문이다
    email?.let{
        // email 을 사용해도 되고 it 키워드를 사용해도 된다.
        println("my email is ${email}")
        println("my email is ${it}")
    }
}