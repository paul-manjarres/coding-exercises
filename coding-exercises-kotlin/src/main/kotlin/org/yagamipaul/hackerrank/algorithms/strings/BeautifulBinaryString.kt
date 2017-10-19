package org.yagamipaul.hackerrank.algorithms.strings

import java.util.*


/**
 * Beautiful Binary String
 * https://www.hackerrank.com/challenges/beautiful-binary-string
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    scanner.nextLine()

    var str = scanner.nextLine()
    var count = 0
    var index = str.indexOf("010")

    while (index != -1){
        str = str.replaceFirst("010", "011")
        count ++
        index = str.indexOf("010")
    }

    println(count)
    scanner.close()
}