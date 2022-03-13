package com.example.firstkotiln

fun main() {
    var input = readLine()!!.split(" ")
    var a = input[0].toInt()
    var b = input[1].toInt()
    var c = input[2].toInt()


    println(a+b+c)
    println(a-b+c)
    println(a*b*c)
    println(a%b*c)

    println(a * a)
    println(b * b)
}