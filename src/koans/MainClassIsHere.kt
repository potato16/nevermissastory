package koans

import java.util.concurrent.BlockingDeque
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 * Created by IT-NB on 24/06/2017.
 * blabla
 */
fun main(args: Array<String>) {
    /** Get list of ObjectExp.kt file
     *
     */
    /*println( getList())*/
    /**Play game in WhatFoxSay.kt
     *
     */
    /*val fox1 = WhatFoxSay()
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
    */

    //println(arrayListOf(1,5,2).sortedDescending())
    val point = Point(10,20)
    println(-point)
}
data class Point(val x:Int, val y: Int)
operator fun Point.unaryMinus() = Point(-x,-y)

