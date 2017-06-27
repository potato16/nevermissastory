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
   // val point = Point(10,20)
   // println(-point)
   // forLoopPractice()
   // 1()
    playWithListofPoints()

}
data class Point(val x:Int, val y: Int)
operator fun Point.unaryMinus() = Point(-x,-y)


/**
For loop
 */
fun forLoopPractice(){
    for (x in 1..10) print(x.toString()+ " ")

}
/**
 * Invoke
 */
operator fun Int.invoke(){println("What do you want")}

/**
        List
        */
fun playWithListofPoints(){
    var listPoints =  ArrayList<Point>()
    listPoints.add(Point(34,22))
    listPoints.add(Point(34,2))
    listPoints.add(Point(54,23))
    var listX = ArrayList<Int>()
    for((x,_) in listPoints){
        listX.add(x)
    }
    print(listX.last())
    //better way
    //val listY = listPoints.filter { point->point.y }
    val chk: Boolean = listPoints.all{it.x ==12}
    val chk2: Boolean = listPoints.any{it.x ==12}
    val chk3: Int = listPoints.count{it.x ==12}
    val chk4: Point? = listPoints.find{it.x ==12}
    println(chk.toString()+chk2.toString()+chk3.toString()+chk4.toString())
    val sortedList: List<Point> =listPoints.sortedBy{it.x}
    val sum : Int = listPoints.sumBy { it.x }
    val haha: Map<Int,List<Point>> = listPoints.groupBy { it.x }
}