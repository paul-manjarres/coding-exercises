package org.yagamipaul.hackerrank.algorithms.search

import java.util.*

class ConnectedCellsInAGrid {

    // Complete the connectedCell function below.
    fun connectedCell(matrix: Array<Array<Int>>): Int {


        return 2
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val m = scan.nextLine().trim().toInt()

    val matrix = Array<Array<Int>>(n, { Array<Int>(m, { 0 }) })

    for (i in 0 until n) {
        matrix[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = ConnectedCellsInAGrid().connectedCell(matrix)

    println(result)
}
