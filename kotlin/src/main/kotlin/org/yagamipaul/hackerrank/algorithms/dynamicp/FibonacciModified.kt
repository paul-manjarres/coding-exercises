package org.yagamipaul.hackerrank.algorithms.dynamicp

import java.math.BigInteger
import java.util.*

class FibonacciModified {

    // Complete the fibonacciModified function below.
    fun fibonacciModified(t1: Int, t2: Int, n: Int): BigInteger {

        var tnm2 = BigInteger.valueOf(t1.toLong())
        var tnm1 = BigInteger.valueOf(t2.toLong())
        var tn = BigInteger.ZERO

        for (i in 2.until(n)) {
            tn = tnm2.add(tnm1.pow(2))
            tnm2 = tnm1
            tnm1 = tn
        }
        return tn
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t1T2n = scan.nextLine().split(" ")

    val t1 = t1T2n[0].trim().toInt()

    val t2 = t1T2n[1].trim().toInt()

    val n = t1T2n[2].trim().toInt()

    val result = FibonacciModified().fibonacciModified(t1, t2, n)

    println(result)
}
