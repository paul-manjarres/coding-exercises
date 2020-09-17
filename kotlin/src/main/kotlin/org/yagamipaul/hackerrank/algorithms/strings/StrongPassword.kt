package org.yagamipaul.hackerrank.algorithms.strings

import java.util.*

class StrongPassword {

    val numbers = "0123456789"
    val lower_case = "abcdefghijklmnopqrstuvwxyz"
    val upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val special_characters = "!@#$%^&*()-+"

    // Complete the minimumNumber function below.
    fun minimumNumber(n: Int, password: String): Int {
        // Return the minimum number of characters to make the password strong

        var type = BooleanArray(4)

        for (c in password) {
            if (!type[0] && numbers.contains(c)) {
                type[0] = true
            }
            if (!type[1] && lower_case.contains(c)) {
                type[1] = true
            }
            if (!type[2] && upper_case.contains(c)) {
                type[2] = true
            }
            if (!type[3] && special_characters.contains(c)) {
                type[3] = true
            }
        }

        var count = 0

        for (b in type) {
            if (!b) {
                count++
            }
        }

        if (n + count <6) {
            count += 6 - (n + count)
        }

        return count
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val password = scan.nextLine()
    val answer = StrongPassword().minimumNumber(n, password)
    println(answer)
}
