package algo.sort

fun selectionSort(array: IntArray){
        for (i in 0 until array.size - 1) {
            var minIndex = i
            for (j in i + 1 until array.size) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }
            val temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
        }
}
