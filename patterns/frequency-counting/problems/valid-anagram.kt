// https://leetcode.com/problems/valid-anagram/
// Pattern: Frequency Counting
// Key insight: Increment for s, decrement for t in one pass; all counts should be zero

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val frequencyCount = IntArray(26)
        for (i in s.indices) {
            frequencyCount[s[i] - 'a']++
            frequencyCount[t[i] - 'a']--
        }

        return frequencyCount.all { it == 0 }
    }
}
