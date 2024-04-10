package com.example.kotlinprac

fun main(){
    println(add(1,99999))
    var i = "taegyeong"
    var a= "said \"hello\"."
    println("$i")
    println(calling(a))

}

fun add(a:Int,b:Int):Int{
    return a+b
}

fun calling(a:String) : String {
    val v= "taegyeong "
    return v+a
}