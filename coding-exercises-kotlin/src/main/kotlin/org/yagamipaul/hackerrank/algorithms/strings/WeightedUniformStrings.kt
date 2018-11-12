package org.yagamipaul.hackerrank.algorithms.strings

import java.util.*
import kotlin.collections.HashSet

class WeightedUniformStrings {

    // Complete the weightedUniformStrings function below.
    fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
        val set = HashSet<Int>()
        var subStringSize = 1
        var lastChar = ' '

        // compute the list of possible uniform string weights
        for (i in 0 until s.length){
            if(s[i] == lastChar){
                subStringSize++
            }else{
                subStringSize = 1
                lastChar = s[i]
            }
            var value = (s[i] -'a'+1)*subStringSize
            set.add(value)
        }

        // Respond to the queries based on the pre computed value
        var responses = Array(queries.size, {""})
        for((i,q) in queries.withIndex()){
            responses[i] = if(set.contains(q)) "Yes" else "No"
        }
        return responses
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val queriesCount = scan.nextLine().trim().toInt()

    val queries = Array<Int>(queriesCount, { 0 })
    for (i in 0 until queriesCount) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = WeightedUniformStrings().weightedUniformStrings(s, queries)

    println(result.joinToString("\n"))
}
