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

        val map = HashMap<Int, Int>()
        for(i in 0 until n){
            c[i] = scanner.nextInt()
            if(!map.containsKey(c[i])){
                map[c[i]] = i+1
            }
        }

        //c.sort()


        for( i in 0 until n-1){

            val a = c[i]
            //val index = c.binarySearch(m-a,i+1, n-1)

            if(map.containsKey(m-a)){
                println("${map[a]} ${map[m-a]}")
                break
            }

        }



    }


}