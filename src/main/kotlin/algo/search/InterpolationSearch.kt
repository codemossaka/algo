package algo.search

/**
 * Time complexity O(log(log(n))) as we need to traverse the complete array in worst case.
 * Space complexity O(1) no extra memory is used to allocate the array
 */
fun interpolationSearch(data: Array<Int>, value: Int): Boolean {
    var start = 0
    var end = data.size - 1
    while (start <= end && value >= data[start] && value <= data[end]) {
        val index = start + ((value - data[start]) * (end - start)) / (data[end] - data[start])
        println(index)
        if (data[index] == value) {
            return true
        }
        if (data[index] < value) {
            start = index + 1
        } else {
            end = index - 1
        }
    }
    return false
}
