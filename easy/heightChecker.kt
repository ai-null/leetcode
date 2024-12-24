fun bubbleSort(arr: IntArray) {
    for (i in 0 until arr.size) {
        for (j in 0 until arr.size-1) {
            if (arr[j] > arr[j+1]) {
                arr[j] = arr[j+1].also {
                    arr[j+1] = arr[j]
                }
            }
        }
    }
}

fun heightChecker(heights: IntArray): Int {
    var fold = 0
    val a  = IntArray(heights.size) { heights[it] }
    bubbleSort(a)

    for (i in heights.indices) {
        if (heights[i] != a[i]) fold++
    }

    return fold
}