package koans
import java.util.*
import kotlin.Comparator

/**
 * Created by IT-NB on 24/06/2017.
 * blablabla
 */
fun getList(): List<Int>{
    val arrayList = arrayListOf(1,5,2)
    Collections.sort(arrayList,object: Comparator<Int>{
        override fun compare(o1: Int, o2: Int): Int = o1.compareTo(o2)

    } )
    return arrayList
}

