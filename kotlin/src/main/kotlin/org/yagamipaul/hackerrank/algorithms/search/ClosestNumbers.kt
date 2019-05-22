package org.yagamipaul.hackerrank.algorithms.search

import java.util.*
import kotlin.collections.ArrayList

/**
 * Closest number
 * https://www.hackerrank.com/challenges/closest-numbers
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)

    for (i in 0.until(n)) {
        a[i] = scanner.nextInt()
    }

    Arrays.sort(a)

    var min = Int.MAX_VALUE
    val pairs = ArrayList<Pair<Int,Int>>()

    for(i in 0.until(a.size-1)){
        min = Math.min(min, Math.abs(a[i]-a[i+1]))
    }

    for(i in 0.until(a.size-1)){
        val curr = Math.abs(a[i]-a[i+1])
        if(curr == min){
            pairs.add(Pair(a[i], a[i+1]))
        }
    }

    pairs.forEach{
        p-> print("${p.first} ${p.second} ")
    }

}


