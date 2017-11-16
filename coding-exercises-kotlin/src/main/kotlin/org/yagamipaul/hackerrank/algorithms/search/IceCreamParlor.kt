package org.yagamipaul.hackerrank.algorithms.search

import java.util.*


/**
 * Ice cream parlor
 * https://www.hackerrank.com/challenges/icecream-parlor/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val t = scanner.nextInt()
    for(_i in 0 until t){

        val m = scanner.nextInt()
        val n = scanner.nextInt()
        val c = IntArray(n)

        val map = HashMap<Int, ArrayDeque<Int>>()
        for(i in 0 until n){
            c[i] = scanner.nextInt()
            if(!map.containsKey(c[i])){
                map[c[i]]=ArrayDeque()
            }
            map[c[i]]?.add(i+1)
        }

        for( i in 0 until n-1){
            val a = c[i]
            if(map.containsKey(m-a)){

                val first = map[a]!!.pop()
                val second = map[m-a]!!.pop()
                if(first < second){
                    println("$first $second")
                }

                break
            }
        }

    }

}