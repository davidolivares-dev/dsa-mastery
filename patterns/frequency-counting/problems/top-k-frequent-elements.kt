// https://leetcode.com/problems/top-k-frequent-elements/
// Pattern: Frequency Counting (bucket sort by frequency)
// Key insight: Build frequency map, then bucket by count — walk buckets backward to get top K

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numFreqMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            numFreqMap[num] = numFreqMap.getOrDefault(num, 0) + 1
        }

        val freqList = Array(nums.size + 1) { mutableListOf<Int>() }
        for ((key, value) in numFreqMap) {
            freqList[value].add(key)
        }

        val result = mutableListOf<Int>()
        for (i in freqList.lastIndex downTo 0) {
            for (num in freqList[i]) {
                result.add(num)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }

        return result.toIntArray()
    }
}
