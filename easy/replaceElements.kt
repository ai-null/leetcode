// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
fun replaceElements(arr: IntArray): IntArray {
    if (arr.size == 1) {
        arr[0] = -1
        return arr
    }
    
    if (arr.size == 2) {
        arr[0] = arr[1]
        arr[1] = -1
        return arr
    }

    val result = IntArray(arr.size) { 0 }
    var actualPrev = -1
    
    for (index in arr.indices.reversed()) {
        if (index == arr.size-1) {
            result[index] = -1
            actualPrev = arr[index]
        } else {
            result[index] = maxOf(result[index+1], actualPrev)
            actualPrev = arr[index]
        }
    }

    return result
}