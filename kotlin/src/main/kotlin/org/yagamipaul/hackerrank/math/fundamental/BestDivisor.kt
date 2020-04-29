package org.yagamipaul.hackerrank.math.fundamental

class BestDivisor {

    fun solution(n: Int): Int {

        var max = 1;
        var currNumberSum = 1;
        for (i in 2.until(n+1)) {
            if (n % i == 0) {
                val calculatedSum = calculateDigitsSum(i);
                //println("Num: $i Sum: $calculatedSum")
                if(calculatedSum > max ){
                    max = calculatedSum;
                    currNumberSum = i;
                } else if(calculatedSum == max && i < currNumberSum){
                    currNumberSum = i;
                }
            }
        }
        return currNumberSum;
    }

    fun calculateDigitsSum(n: Int): Int {
        return n.toString().map { c -> Character.getNumericValue(c) }
                .sum()
    }


}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val result = BestDivisor().solution(n)
    println(result)

}