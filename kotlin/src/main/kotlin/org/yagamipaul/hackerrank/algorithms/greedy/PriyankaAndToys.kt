package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

class PriyankaAndToys {

    // Complete the toys function below.
    fun toys(w: Array<Int>): Int {

        if(w.isEmpty()){
            return 0
        }
        // Traverse the sorted array looking for elements that are
        // less than the calculated size, if is greater, calculate a new
        // size and increment the counter

        val a = w.sortedArray()
        var size = a[0] + 4
        var count = 1

        for( ai in a){
            if(ai > size){
                count++
                size = ai +4
            }
        }

        return count
    }


}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val w = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = PriyankaAndToys().toys(w)
    println(result)
}