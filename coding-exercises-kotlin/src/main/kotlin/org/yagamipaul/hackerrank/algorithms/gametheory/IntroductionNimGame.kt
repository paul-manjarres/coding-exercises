package org.yagamipaul.hackerrank.algorithms.gametheory

import java.util.*

class IntroductionNimGame {


    // Complete the nimGame function below.
    fun nimGame(pile: Array<Int>): String {
        var sum = pile[0]
        for(i in 1.until(pile.size)){
            sum = sum.xor(pile[i])
        }
        return if(sum == 0) "Second" else "First"
    }



}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val n = scan.nextLine().trim().toInt()
        val pile = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        val result = IntroductionNimGame().nimGame(pile)
        println(result)
    }
}