package org.yagamipaul.hackerrank.algorithms.search

import java.util.*

class ConnectedCellsInAGrid {

    // Complete the connectedCell function below.
    fun connectedCell(matrix: Array<Array<Int>>): Int {

        // Weighted Quick Union with Path Compression
        val n = matrix.size * matrix[0].size
        val quickUnion = QuickUnion(n)

        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                val value = matrix[i][j]
                val position = i * matrix[i].size + j
                if (value == 1) {

                    // left
                    if (j - 1 >= 0 && matrix[i][j - 1] == 1) {
                        val positionB = i * matrix[i].size + (j - 1)
                        quickUnion.union(position, positionB)
                    }

                    if (j - 1 >= 0 && i - 1 >= 0 && matrix[i - 1][j - 1] == 1) {
                        val positionB = (i - 1) * matrix[i].size + (j - 1)
                        quickUnion.union(position, positionB)
                    }

                    // top
                    if (i - 1 >= 0 && matrix[i - 1][j] == 1) {
                        val positionB = (i - 1) * matrix[i].size + j
                        quickUnion.union(position, positionB)
                    }
                    if (i - 1 >= 0 && j + 1 < matrix[i].size && matrix[i - 1][j + 1] == 1) {
                        val positionB = (i - 1) * matrix[i].size + (j + 1)
                        quickUnion.union(position, positionB)
                    }

                    // right
                    if (j + 1 < matrix[i].size && matrix[i][j + 1] == 1) {
                        val positionB = i * matrix[i].size + (j + 1)
                        quickUnion.union(position, positionB)
                    }
                    if (j + 1 < matrix[i].size && i + 1 < matrix.size && matrix[i + 1][j + 1] == 1) {
                        val positionB = (i + 1) * matrix[i].size + (j + 1)
                        quickUnion.union(position, positionB)
                    }

                    // bottom
                    if (i + 1 < matrix.size && matrix[i + 1][j] == 1) {
                        val positionB = (i + 1) * matrix[i].size + j
                        quickUnion.union(position, positionB)
                    }
                    if (i + 1 < matrix.size && j - 1 >= 0 && matrix[i + 1][j - 1] == 1) {
                        val positionB = (i + 1) * matrix[i].size + j - 1
                        quickUnion.union(position, positionB)
                    }
                }
            }
        }
        return quickUnion.sizes.max()!!
    }
}

private class QuickUnion {
    var sizes: IntArray
    var parents: IntArray
    var count = 0

    constructor(n: Int) {
        count = n
        sizes = IntArray(n)
        parents = IntArray(n)
        for (i in 0 until n) {
            sizes[i] = 1
            parents[i] = i
        }
    }

    fun find(p: Int): Int {
        var p = p
        var root = p
        while (root != parents[root]) root = parents[root]
        while (p != root) {
            val newp: Int = parents[p]
            parents[p] = root
            p = newp
        }
        return root
    }

    fun connected(p: Int, q: Int): Boolean {
        return find(p) === find(q)
    }

    fun union(p: Int, q: Int) {
        val rootP: Int = find(p)
        val rootQ: Int = find(q)
        if (rootP == rootQ) return

        if (sizes[rootP] < sizes[rootQ]) {
            parents[rootP] = rootQ
            sizes[rootQ] += sizes.get(rootP)
        } else {
            parents[rootQ] = rootP
            sizes[rootP] += sizes.get(rootQ)
        }
        count--
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
