package basic.`object`

//class 키워드 대신에 object 키워드를 사용한다.

//object 클래스가 다른 클래스와 다른점은
//singleton 패턴이다 딱 한번 만들어진다.
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower : Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val holsePower : Int)

fun main() {
    val car = CarFactory.makeCar(1234)
    val car2 = CarFactory.makeCar(5678)
    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}