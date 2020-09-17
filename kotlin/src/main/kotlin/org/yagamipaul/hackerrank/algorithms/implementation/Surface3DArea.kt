package org.yagamipaul.hackerrank.algorithms.implementation

import java.util.*

class Surface3DArea {

    // Complete the surfaceArea function below.
    fun surfaceArea(A: Array<Array<Int>>): Int {

        var totalArea = 0
        for (i in 0.until(A.size)) {
            for (j in 0.until(A[i].size)) {

                val neighbors = mutableListOf<Int>()

                // left
                if (i - 1 >= 0) {
                    neighbors.add(A[i - 1][j])
                } else {
                    neighbors.add(0)
                }

                // right
                if (i + 1 < A.size) {
                    neighbors.add(A[i + 1][j])
                } else {
                    neighbors.add(0)
                }
                // up
                if (j - 1 >= 0) {
                    neighbors.add(A[i][j - 1])
                } else {
                    neighbors.add(0)
                }
                // down
                if (j + 1 < A[i].size) {
                    neighbors.add(A[i][j + 1])
                } else {
                    neighbors.add(0)
                }

                totalArea += neighbors
                    .map { if (A[i][j] - it > 0) A[i][j] - it else 0 }
                    .sum() + 2
            }
        }

        return totalArea
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val HW = scan.nextLine().split(" ")
    val H = HW[0].trim().toInt()
    val W = HW[1].trim().toInt()
    val A = Array<Array<Int>>(H, { Array<Int>(W, { 0 }) })

    for (i in 0 until H) {
        A[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = Surface3DArea().surfaceArea(A)

    println(result)
}
