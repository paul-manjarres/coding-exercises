package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

class PermutingTwoArrays {

    // Complete the twoArrays function below.
    fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
        var a = A.sortedArray()
        var b = B.sortedArray().reversedArray()

        for(i in 0.until(a.size)){
            if(a[i] + b[i] < k){
                return "NO"
            }
        }
        return "YES"
    }

}




fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()

        val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = PermutingTwoArrays().twoArrays(k, A, B)

        println(result)
    }
}
