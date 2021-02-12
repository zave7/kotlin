package basic.data

// pojo 비어있는 틀 역할을 하는 클래스 pojo

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// 컴파일 시
// ToString 도 자동생성
// HashCode 도 자동생성
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int) {

}

fun main() {
    val ticketA = Ticket("koreanAir", "zave", "2020-01-01", 14)
    val ticketB = TicketNormal("koreanAir", "zave", "2020-01-01", 14)

    println(ticketA)
    println(ticketB)
}
