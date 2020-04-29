package org.yagamipaul.hackerrank.math.fundamental

import java.util.*
import kotlin.math.pow

class Restaurant {

    /*
 * Complete the restaurant function below.
 */
    fun restaurant(l: Int, b: Int): Int {
        val mcdVal = mcd(l, b);
        return (l*b) /  (mcdVal * mcdVal)
    }

    tailrec fun mcd(a:Int, b:Int): Int{
        if(b==0) return a;
        if(a==0) return b;
        return mcd(b, a % b);
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val lb = scan.nextLine().split(" ")
        val l = lb[0].trim().toInt()
        val b = lb[1].trim().toInt()
        val result = Restaurant().restaurant(l, b)
        println(result)
    }
}


