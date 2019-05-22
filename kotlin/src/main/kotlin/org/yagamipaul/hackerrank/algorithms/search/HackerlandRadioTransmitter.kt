package org.yagamipaul.hackerrank.algorithms.search

import java.util.*
import kotlin.collections.ArrayList


/**
 * Hackerland Radio Transmitters
 * https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val k = scanner.nextInt()

    val set = HashSet<Int>()
    val a = ArrayList<Int>()
    for (i in 0 until n) {
        val element = scanner.nextInt()
        if (!set.contains(element)) {
            set.add(element)
            a.add(element)
        }
    }

    var count = 0


    val it = a.iterator()

    while (it.hasNext()) {

        val e = it.next()

        if (set.contains(e + k)) {
            count++
            moveTo(it, e+k)

        }


    }


}

fun moveTo(it: Iterator<Int>, to: Int) {
    var n = it.next()
    while(n!=to){
        n = it.next()
    }
}