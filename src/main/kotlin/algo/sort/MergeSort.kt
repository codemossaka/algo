package algo.sort

fun mergeSort(array: IntArray): IntArray {
    if (array.size <= 1) return array
    val middle = array.size / 2
    val left = mergeSort(array.copyOfRange(0, middle))
    val right = mergeSort(array.copyOfRange(middle, array.size))
    return merge(left, right)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val result = IntArray(left.size + right.size)
    var leftIndex = 0
    var rightIndex = 0
    for (i in result.indices) {
        if (leftIndex >= left.size) {
            result[i] = right[rightIndex++]
        } else if (rightIndex >= right.size) {
            result[i] = left[leftIndex++]
        } else if (left[leftIndex] < right[rightIndex]) {
            result[i] = left[leftIndex++]
        } else {
            result[i] = right[rightIndex++]
        }
    }
    return result
}