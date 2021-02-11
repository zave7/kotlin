package basic.classs

// 코틀린과 자바의 다른점
// 파일이름이랑 클래스이름이랑 일치하지 않아도됨
// 한 파일에 여러 클래스를 정의할 수 있다

open class Human (val name : String = "test"){

    // # 생성자 선언이 자바와 다르다 ( 클래스 이름 옆에 써준다 )
    // -> Human constructor() {}
    // -> constructor() : 기본 생성자
    // -> constructor 문구는 생략이 가능하다..!!

    //val name = name 프로퍼티를 클래스 내에 선언하지 않고 생성자에서 바로 선언해 주는것도 가능하다
    //constructor(val name : String)

    //또 한 생성자 내에서 default 값도 지정해 줄 수 있다.
    // class Human (val name : String = "test) {}
    // 이렇게 기본 값을 지정해 주게되면 기본생성자로 동작하게 된다.

    // 인스턴스 생성시 실행할 문장 init 안에 정의
    // 주 생성자의 일부이다
    init {
        println("New human has been born!!")
    }

    // 부 생성자도 여러개 만들 수 있다
    // 부 생성자는 항상 주 생성자의 위임을 받아야 한다.
    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    fun eatingCake() {
        println("This is so eeeee")
    }

    open fun singASong() {
        println("lalala")
    }
}

// 클래스 상속
// 코틀린의 클래스는 기본적으로 final 클래스이다
// open 이라는 키워드를 통해 상속받을 수 있도록 할 수 있다
// 다중 상속은 불가능하다.
class Korean : Human() {

    // 메서드도 기본적으로 final 이기 때문에 open 해줘야 한다.
    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is : ${name}") // 파라미터가 없는 생성자를 썼기 때문에 name 프로퍼티가 사용가능
    }
}

fun main() {
//    # 생성자
//    var human = Human("zave")
//    val stranger = Human()
//    human.eatingCake()

//    val mom = Human("sss", 53)

//    println("This human's name is ${stranger.name}")

//    # 상속
    val korean = Korean()
    korean.singASong()
}