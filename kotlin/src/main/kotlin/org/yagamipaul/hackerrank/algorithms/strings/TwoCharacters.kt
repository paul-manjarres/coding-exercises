package org.yagamipaul.hackerrank.algorithms.strings


/**
 * Two Characters
 * https://www.hackerrank.com/challenges/two-characters
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */

class TwoCharacters {

    private var validationCount = 0;

    private val data = mutableMapOf<String, Int>()

    // Complete the alternate function below.
    fun alternate(s: String): Int {
        val result = alternateRecursive(s);
        //println("Validation Count: ${this.validationCount}")
        return result;
    }

    fun alternateRecursive(s: String): Int {
        return if (s == null || s.isEmpty()) {
            return 0;
        }else if(data.containsKey(s)) {
            data.getValue(s);
        }else if (validate(s)) {
            // validate if the current string meet the requirements
            // If yes, return the current string's length
            data[s] = s.length;
            s.length;
        } else {
            // if not, get all distinct letters in the string
            // for each char, create a string with the char removed
            // return the max value from the recursive call to this function using each new string

            val value = s.toCharArray()
                    .distinct()
                    .map { c -> s.filter { c2 -> c2 != c } }
                    .sortedByDescending { it -> it.length }
                    .map { str -> alternateRecursive(str) }
                    .max()!!
            data[s] = value;
            value
        }

    }

    fun validate(s: String): Boolean {
        //validationCount++;
        if (s == null || s.length < 2 || s[0] == s[1]) {
            return false
        }
        var temp = s[0];
        for (i in 0.until(s.length)) {
            temp = s[i % 2];
            if (s[i] != temp) {
                return false;
            }
        }
        return true;
    }
}

fun main(args: Array<String>) {
    val l = readLine()!!.trim().toInt()
    val s = readLine()!!
    val result = TwoCharacters().alternate(s)
    println(result)

}
