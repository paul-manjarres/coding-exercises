package org.yagamipaul.hackerrank.algorithms.graph

import java.util.*
import kotlin.collections.ArrayList


/**
 * Roads and Libraries
 * https://www.hackerrank.com/challenges/torque-and-development
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val q = scanner.nextInt()

    for (_i in 0 until q) {
        val n = scanner.nextInt()
        val m = scanner.nextInt()
        val clib = scanner.nextInt()
        val croad = scanner.nextInt()


        val map = hashMapOf<Int, ArrayList<Int>>()

        for (_j in 0 until m) {
            val u = scanner.nextInt() - 1
            val v = scanner.nextInt() - 1
            val list = map.getOrDefault(u, ArrayList())
            list.add(v)
            map[u] = list

        }
        println(solve(n, m, clib, croad, map))

    }

}

fun solve(n: Int, m: Int, clib: Int, croad: Int, map: Map<Int, ArrayList<Int>>): Long {

    val ok = hashMapOf<Int, Boolean>()

    // The max value should be the cost to put a library in each city.
    val max = (clib * n).toLong()
    var cost = 0L


    for (i in map.keys) {
        val nodes = map.getOrDefault(i, ArrayList(0))

        if (!ok.getOrDefault(i, false)) {

            // Check if any neighbour has a library, if it does, build the road
            for (k in nodes) {
                if (ok.getOrDefault(k, false)) {
                    ok[i] = true
                    cost += croad
                    break
                }
            }

            // If not, build a library
            if (!ok.getOrDefault(i, false)) {
                ok[i] = true
                cost += clib

                for (k in nodes) {
                    ok[k] = true
                    cost += croad
                }
            }


        }

    }

    cost += (clib * (n - ok.size))
    return Math.min(max, cost)
}
