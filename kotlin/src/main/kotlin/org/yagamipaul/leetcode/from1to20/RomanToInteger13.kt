package org.yagamipaul.leetcode.from1to20

class RomanToInteger13 {

    fun romanToInt(s: String): Int {
        val map = hashMapOf(
                Pair('I', 1),
                Pair('V', 5),
                Pair('X', 10),
                Pair('L', 50),
                Pair('C', 100),
                Pair('D', 500),
                Pair('M', 1000)
        )

        var result = 0
        var skip = false
        for (i in 0 until s.length - 1) {
            // If two values were used, skip this iteration
            if(skip){
                skip = false
                continue
            }

            if ( (s[i] == 'I' && (s[i + 1] == 'V' || s[i + 1] == 'X')) ||
                    (s[i] == 'X' && (s[i + 1] == 'L' || s[i + 1] == 'C')) ||
                    (s[i] == 'C' && (s[i + 1] == 'D' || s[i + 1] == 'M'))
            ) {
                // If this case happen, two chars are processed
                val a = map[s[i + 1]] ?: 0
                val b = map[s[i]] ?: 0
                result += a - b
                skip = true
            }
            // If the is no match, only process this char
            else result+= map[s[i]] ?: 0
        }
        // At the end, if the skip flag is false, then process the last item
        if(!skip) {
            result += map[s[s.length - 1]] ?: 0
        }
        return result
    }
}