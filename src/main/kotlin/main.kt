import collection.list.StackImpl
import collection.list.stackOf

fun main(args: Array<String>) {
    val stack = stackOf("A", "B", "C", "D")
    print(stack)
    println("Popped: ${stack.pop()}")
}

fun twoSum(nums: IntArray, target: Int): List<Int?> {

    val diffHashMap = hashMapOf<Int, Int>()
    for ((i, num) in nums.withIndex()) {
        val diff = target - num
        if (diff in diffHashMap) {
            return listOf(diffHashMap[diff], i)
        }
        diffHashMap[num] = i
    }
    return listOf()
}

fun checkAnagram(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false
    val countT = hashMapOf<Char, Int>()
    val countS = hashMapOf<Char, Int>()

    for (i in s.indices) {
        countS[s[i]] = 1 + countS.getOrDefault(s[i], 0)
        countT[t[i]] = 1 + countT.getOrDefault(t[i], 0)
    }
    for ((k, v) in countS) {
        if (countS[k] != countT[k])
            return false
    }
    return true
}

fun containDouble(nums: IntArray): Boolean {
    val setList = mutableSetOf<Int>()
    for (num in nums) {
        if (num in setList) {
            return true
        }
        setList.add(num)
    }
    return false
}


fun anagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val countS = mutableMapOf<Char, Int>()
    val countT = mutableMapOf<Char, Int>()

    for (i in s.indices) {
        countS[s[i]] = 1 + countS.getOrDefault(s[i], 0)
        countT[t[i]] = 1 + countT.getOrDefault(t[i], 0)
    }

    for ((k, v) in countS) {
        if (countS[k] != countT.getOrDefault(k, 0))
            return false

    }
    return true
}

fun anagramWithSort(s: String, t: String): Boolean {
    return s.toSortedSet() == t.toSortedSet()
}