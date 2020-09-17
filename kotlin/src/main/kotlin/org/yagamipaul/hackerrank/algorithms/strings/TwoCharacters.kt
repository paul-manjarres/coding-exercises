package org.yagamipaul.hackerrank.algorithms.strings

/**
 * Two Characters
 * https://www.hackerrank.com/challenges/two-characters
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */

class TwoCharacters {

    private var validationCount = 0

    // Complete the alternate function below.
    fun alternate(s: String): Int {
        return if (s == null || s.isEmpty()) {
            // base cases
            0
        } else {
            // Create a set of combinations of Two characters
            // create collection of strings by removing all but the two chars in each combination
            // filter the strings based on the defined criteria
            // get the string with the maximum length
            // return the length of the string
            createPermutations(s)
                .map { pair -> s.filter { c -> c == pair[0] || c == pair[1] } }
                .filter { s -> validate(s) }
                .maxBy { it -> it.length }
                ?.length ?: 0
        }
    }

    fun validate(s: String): Boolean {
        validationCount++
        if (s == null || s.length < 2 || s[0] == s[1]) return false
        var temp = s[0]
        for (i in 0.until(s.length)) {
            temp = s[i % 2]
            if (s[i] != temp) return false
        }
        return true
    }

    fun createPermutations(s: String): Set<String> {
        if (s == null || s.length < 2) {
            return emptySet()
        }
        val set = mutableSetOf<String>()
        val arr = s.toCharArray().distinct()
        for (i in 0.until(arr.size - 1)) {
            for (j in (i + 1).until(arr.size)) {
                set.add(arr[i] + "" + arr[j])
            }
        }
        return set
    }
}

fun main(args: Array<String>) {
    val l = readLine()!!.trim().toInt()
    val s = readLine()!!
    val result = TwoCharacters().alternate(s)
    println(result)
}
