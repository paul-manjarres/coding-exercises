package org.yagamipaul.hackerrank.algorithms.graph

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet


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

            val list2 = map.getOrDefault(v, ArrayList())
            list2.add(u)
            map[v] = list2

        }
        println(solve(n, m, clib, croad, map))

    }

}

/**
 * Depth first search, returns the visited nodes
 */
fun dfs(map: Map<Int, ArrayList<Int>>, origin: Int): Set<Int>{
    val visited = HashSet<Int>()
    val stack = ArrayDeque<Int>()
    stack.push(origin)
    visited.add(origin)

    while(stack.isNotEmpty()){
        val node = stack.pop()
        for (i in map.getOrDefault(node, emptyList<Int>())){
            if(!visited.contains(i)){
                visited.add(i)
                stack.push(i)
            }
        }
    }
    return visited
}


fun solve(n: Int, m: Int, clib: Int, croad: Int, map: Map<Int, ArrayList<Int>>): Long {

    if(clib < croad){
        return n.toLong() * clib
    }

    var components = 0L
    var visited = HashSet<Int>()

    var totalCost = 0L

    while(visited.size < n){
        for(i in 0 until n) {
            if (!visited.contains(i)) {

                var currentVisited = dfs(map, i)
                visited.addAll(currentVisited)
                components++
                totalCost += (currentVisited.size -1 )*croad + clib
            }
        }
    }

    return totalCost
}
