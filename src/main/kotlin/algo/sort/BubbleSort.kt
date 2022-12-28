package algo.sort

/**
 * Time complexity O(n^2) as we need to traverse the complete array in worst case.
 * Space complexity O(1) as we need only one temp variable
 */
fun bubbleSort(list: MutableList<Int>) {
    var n = list.size
    while (n > 1) {
        var newn = 0
        for (i in 1 until n) {
            if (list[i - 1] > list[i]) {
                val temp = list[i]
                list[i] = list[i - 1]
                list[i - 1] = temp
                newn = i
            }
        }
        n = newn
    }
}

/**
 * Time complexity O(n^2) as we need to traverse the complete array in worst case.
 * Space complexity O(1) as we need only one temp variable
 */
fun bubbleSortOtherWay(list: MutableList<Int>) {
    var size = list.size - 1
    for (i in 0 until size) {
        for (j in 0 until (size - i)) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
}


/**
 * Time complexity O(n^2) as we need to traverse the complete array in worst case.
 * Space complexity O(1) as we need only one temp variable
 */
fun bubbleSortImproved(arr: MutableList<Int>) {
    val size = arr.size
    var i: Int
    var j: Int
    var temp: Int
    var swapped = 1
    i = 0
    while (i < size - 1 && swapped == 1) {
        swapped = 0
        j = 0
        while (j < size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                /* Swapping */
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = 1
            }
            j++
        }
        i++
    }
}



