package koans

/**
 * Created by IT-NB on 24/06/2017.
 * Subject/Topic : Object Expressions and Declarations
 * This is the beginning of the really serious journey
 */
open class NumberofGame(x: Int){
    public open val y: Int = x
}
val ab : NumberofGame = object: NumberofGame(23), OMGWhatisTHis{
    override val y = 16
}
class WhatFoxSay {
    fun playSound(thing: OMGWhatisTHis) {
        thing.playTheGame()
    }
    private fun bimat() = object {
        val x : Int = 12
    }
    public fun congkhai() = object {
        val x : Int = 10
    }
    fun letHaveFun(){
        val x1 = bimat().x
       // val x2 = congkhai().x
    }
}
interface OMGWhatisTHis{
    fun playTheGame(){
        println("THis is NOt A GAMe")
    }
}
fun NOFunITisNOTfunny(){
    val abcd = object {
        var x: Int = 0
        var y: Int = 1
    }
    println (abcd.x+abcd.y)
}
// Mục đích là để tạo singleton thôi
// Chả có gì hay ho cả
// Really, dude. It is a huge feature
// Whatever!!!
object Pheptinh{
    fun cong(a:Int, b: Int): Int {
        return a + b
    }
}
//object declarations can't be local
object ITisPoTato: OMGWhatisTHis{
    override fun playTheGame() {
        println("I am Potato!")
    }
}
/*
    Companion
 */

fun main(args: Array<String>) {
    val fox1 = WhatFoxSay()
    fox1.playSound(object : OMGWhatisTHis{
        override fun playTheGame() {
            println("This is example of Object Expressions and Declarations Game of Thrones")
        }
    })
    println(ab.y)
    val isFun = NOFunITisNOTfunny()
    // Object Declarations
    println("Thu cong thu xem sao:3 + 2 ="+Pheptinh.cong(3,2))
    ITisPoTato.playTheGame()
}
