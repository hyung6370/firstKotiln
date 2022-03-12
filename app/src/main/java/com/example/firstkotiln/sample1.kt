package com.example.firstkotiln

fun main() {

    forAndWhile()
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {  // switch 역할 대체
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

fun helloWorld() {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a + b
}

fun hi() {
    val a : Int = 10    //변하지 않는 상수
    var b : Int = 9     //변할 수 있는 변수

    b = 100

    val c = 100     //int 생략
    var d = 100

    var e : String


}

fun array() {
    val array = arrayOf(1, 2, 3)    //array 초기화
    val list = listOf(1, 2, 3)      //list 초기화

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)     //어떤 타입으로도 구성가능

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)   //arrayList에 10 추기
    arrayList.add(20)

}

fun forAndWhile() {

    val students = arrayListOf("ASH", "ISLAND", "TOIL", "SKINNY")

    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생: ${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    for (i in 10 downTo 1) {
        sum += i
    }

    for (i in 1 until 100) {
        sum += i
    }

    var index = 0
    while(index < 10) {
        println("current Index : ${index}")
        index++
    }

}