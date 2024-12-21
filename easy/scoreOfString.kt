package leetcode.easy

//https://leetcode.com/problems/score-of-a-string/
fun scoreOfString(s: String): Int {
    var fold = 0
    var prev: Int = s[0].code

    for (i in 1 until s.length) {
        var temp = prev - s[i].code
        if (temp < 0) temp*=-1 // without using abs

        fold += temp
        prev = s[i].code
    }

    return fold
}