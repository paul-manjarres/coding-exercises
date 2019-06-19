package org.yagamipaul.leetcode.from1to20

import kotlin.math.abs

class ReverseInteger7 {
    fun reverse0(x: Int): Int {
        if(x>0){
            return x.toString().reversed().toInt()
        }else{
            return x.toString().drop(1).reversed().toInt()*-1
        }
    }

    fun reverse(x: Int): Int {

        if(x == Int.MAX_VALUE || x == Int.MIN_VALUE) return 0

        val lim = Int.MAX_VALUE / 10
        var div = Math.abs(x) /10
        var mod = Math.abs(x) % 10
        var res = 0
        while(div > 0){
            if(res > lim) return 0
            res = (res+mod)*10
            mod = div % 10
            div /= 10
        }
        res+=mod
        if(res < 0) return 0
        return if (x>0) res else res*-1

    }
}