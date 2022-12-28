package algo.search

/**
 * Time complexity O(log(n)) as we need to traverse the complete array in worst case.
 * Space complexity O(1) no extra memory is used to allocate the array
 */
fun binarySearch(arr: Array<Int>, value: Int): Boolean {

    var start = 0
    var end = arr.size - 1
    var mid: Int

    while (start <= end) {
        mid = start + (end - start) / 2

        when {
            arr[mid] == value -> {
                return true
            }
            arr[mid] < value -> {
                start = mid + 1
            }
            else -> {
                end = mid - 1
            }
        }
    }
    return false

}

/**
 * Time complexity O(log(n)) as we need to traverse the complete array in worst case.
 * Space complexity O(1) no extra memory is used to allocate the array
 */
fun binarySearchRecursive(arr: Array<Int>, start: Int, end: Int, value: Int): Boolean {
    if (start > end)
        return false

    val mid = start + (end - start) / 2

    return when {
        arr[mid] == value -> {
            true
        }
        arr[mid] < value -> {
            binarySearchRecursive(arr, mid + 1, end, value)
        }
        else -> {
            binarySearchRecursive(arr, start, mid - 1, value)
        }
    }
}