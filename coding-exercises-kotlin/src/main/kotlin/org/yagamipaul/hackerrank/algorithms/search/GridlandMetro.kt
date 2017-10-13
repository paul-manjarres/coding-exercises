package org.yagamipaul.hackerrank.algorithms.search

import java.util.*


/**
 * Gridland metro
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val k = scanner.nextInt()

    var sum = 0

    val map = hashMapOf<Int, BooleanArray>()

    for (i in 0.until(k)) {
        val r = scanner.nextInt()
        val c1 = scanner.nextInt()
        val c2 = scanner.nextInt()

        val arr = map.getOrDefault(r, BooleanArray(m))

        if(arr != null) {
            for (j in c1..c2) {
                arr[j-1] = true
            }
        }
        map.put(r, arr)
    }

    for(arr in map.values){
        var busy = 0
        arr.forEach {
            if(it) busy++
        }
        sum += m - busy
    }

    sum+= m * (n - map.size)

    println(sum)
}