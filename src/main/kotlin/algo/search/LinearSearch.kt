package algo.search


/**
 * Time complexity O(n) as we need to traverse the complete array in worst case.
 * Space complexity O(1) no extra memory is used to allocate the array
 */
fun linearSearchUnsorted(arr: Array<Int>, value: Int): Boolean {
    for (i in arr) {
        if (i == value) {
            return true
        }
    }
    return false
}

/**
 * Time complexity O(n) as we need to traverse the complete array in worst case.
 * Space complexity O(1) no extra memory is used to allocate the array
 */
fun linearSearchSorted(arr: Array<Int>, value: Int): Boolean {
    val size = arr.size
    for (i in arr) {
        if (i == value) {
            return true
        } else if (i > value || arr[size - 1] < value) {
            return false
        }
    }
    return false
}