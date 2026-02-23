// https://leetcode.com/problems/two-sum/
// Pattern: Frequency Counting (complement lookup)
// Key insight: Store seen values→indices; check for complement before inserting

class Solution {
      fun twoSum(nums: IntArray, target: Int): IntArray {
          val valueToIndexMap = HashMap<Int, Int>()
          for (i in nums.indices) {
              val complement = target - nums[i]
              if (complement in valueToIndexMap) {
                  return intArrayOf(valueToIndexMap.getValue(complement), i)
              }
              valueToIndexMap[nums[i]] = i
          }

          throw IllegalArgumentException("No two sum solution")
      }
  }
