// Problem: https://leetcode.com/problems/longest-consecutive-sequence/
// Pattern: Frequency Counting (HashSet)
// Key Insight: Use a HashSet for O(1) lookups; only start counting from sequence beginnings (num - 1 not in set)

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        val numsSet = nums.toHashSet()
        var maxLength = 1

        for (num in nums) {
            if ((num - 1) !in numsSet) {
                var currNum = num
                var currLength = 1
                while ((currNum + 1) in numsSet) {
                    currNum++
                    currLength++
                }
                maxLength = maxOf(maxLength, currLength)
            }
        }

        return maxLength
    }
}
