package org.yagamipaul.hackerrank.algorithms.gametheory

import java.util.*

class ChessboardGame {

    // Complete the chessboardGame function below.
    fun chessboardGame(x: Int, y: Int): String {
        return if (f(x - 1, y - 1) == 1) "First" else "Second"
    }

    fun f(x: Int, y: Int): Int {

        // Base cases
        if (x == 0 && (y == 0 || y == 1)) {
            return 0
        }
        if (x == 1 && y == 0) {
            return 0
        }

        if (x == 0 && (y == 2 || y == 3)) {
            return 1
        }

        if (y == 0 && (x == 2 || x == 3)) {
            return 1
        }

        if (x >= 1 && y >= 1) {
            var b1 = f(0, y) == 1
            var b2 = f(x, 0) == 1
            return if (b1 || b2) return 1 else 0
        }

        if (x == 0 && y> 3) {
            return f(0, y - 4)
        }
        if (y == 0 && x> 3) {
            return f(x - 4, 0)
        }

        return 0
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()
    for (tItr in 1..t) {
        val xy = scan.nextLine().split(" ")
        val x = xy[0].trim().toInt()
        val y = xy[1].trim().toInt()
        val result = ChessboardGame().chessboardGame(x, y)
        println(result)
    }
}
