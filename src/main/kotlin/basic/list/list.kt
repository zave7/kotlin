package basic.list

// 리스트는 크게 두가지로 나눠진다.
// 1. List - 수정 불가능
// 2. MutableList - 수정 가능

fun array() {
    val array: Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 = arrayOf(1,"2", 3.4f)
    val list2 = listOf(1,"2", 2.5f)

    //array는 mutable 이다.
    array[0] = 3

    //list는 immutable list 이다
    // list[0] = 2

    //mutable List 이기 때문에 변경 가능
    val arrayList = arrayListOf<Int>()
    arrayList.add(1)
    arrayList.add(2)

    //val에서 새로 할당 불가능
    //arrayList = arrayListOf()
}