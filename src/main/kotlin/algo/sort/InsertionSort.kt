package algo.sort

fun insertionSort(arr:MutableList<Int>){
    val size=arr.size-1

    for (i in 1..size){
        val temp = arr[i] //1
        var j = i //1
        while (j>0 && arr[j-1]>temp){ // 1>0 && 2>1
            arr[j]=arr[j-1] //arr[1]=2
            j-- // j = 0
        }
        arr[j]=temp //arr[1]=1
    }

}


fun insertionSort2(arr:MutableList<Int>){
    val size=arr.size-1

    for (i in 1..size){
       for(j in i downTo  1){
           if (arr[j]<arr[j-1]){
               val temp = arr[j]
               arr[j] = arr[j-1]
               arr[j-1] = temp
           }else{
               break
           }
       }
    }
}