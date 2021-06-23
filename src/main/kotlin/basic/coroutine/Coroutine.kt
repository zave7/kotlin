package basic.coroutine

import kotlinx.coroutines.*

class Coroutine {
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        println("코루틴")
    }
    Thread {
        println("스레드 테스트")
    }.start()
    Thread.sleep(3000) // 프로그램 종료 방지
    runBlocking {
        // 주어진 블록이 완료될때 까지 현재 스레드를 멈추는 새로운 코루틴을 생성하여 실행하는 코루틴 빌더
        delay(2000)
    }
}
