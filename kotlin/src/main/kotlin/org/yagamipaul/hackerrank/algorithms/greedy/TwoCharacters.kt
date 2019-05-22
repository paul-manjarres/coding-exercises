package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*


/**
 * Two Characters
 * https://www.hackerrank.com/challenges/two-characters
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    scanner.nextLine()
    var str = scanner.nextLine()

    var follow = true

    while(follow){
        for(i in 0 until str.length-1){
            if(str[i]==str[i+1]){
                str = str.replace(""+str[i], "")
                break
            }
            if(i== str.length -2){
                follow = false
            }
        }
    }

//    println(str)

    var max =0
    var max2=0
    var first = ' '
    var second = ' '

    var map = mutableMapOf<Char, Int>()
    for(c in str){
        var count = map.getOrDefault(c, 0)
        map[c] = ++count
        if(count > max){
            max = count
            first = c
        }
        if((count > max2) and (c != first)){
            max2 = count
            second = c
        }
    }

//    println("First: $first  Second: $second")

    var result = ""
    for(c in str){
        if((c == first) or (c == second)){
            result+=c
        }
    }

    println(result.length)
    scanner.close()
}