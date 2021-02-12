package basic.companion

// companion object :  자바의 static 과 유사한 object 이다
// private property 나 method를 읽어올 수 있도록 하는 역할을 한다.

class Book private constructor(val id : Int, val name : String) {

    // 이름붙이기도 가능
    companion object BookFactory : IdProvider{

        // 각각 모두 static method, static property 이다
        override fun getId(): Int {
            return 444
        }
        val myBook = "name"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main() {
    val book = Book.create()

    val bookId = Book.getId()
    println("${book.id} ${book.name}")
}