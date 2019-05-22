package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

/**
 * Greedy Florist
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val k = scanner.nextInt()

    val c = IntArray(n)
    for (i in 0.until(n)) {
        c[i] = scanner.nextInt()
    }

    Arrays.sort(c)

    if(k>=n){
        print(c.sum())
    }else{
        var sum = c.sum().toLong()
        var additional = 0L

//        println("n-k: ${n-k}")
        for(i in 1..(n-k)){
            additional+= (i*c[0])
        }
//        println("Additional: $additional")
        sum+=additional

        print(sum)

    }

}

