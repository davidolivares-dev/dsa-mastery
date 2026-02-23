// https://leetcode.com/problems/group-anagrams/
// Pattern: Frequency Counting (grouping by canonical key)
// Key insight: Anagrams share the same sorted character sequence — use as map key

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groupsMap = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = String(str.toCharArray().apply { sort() })
            groupsMap.getOrPut(key, ::mutableListOf).add(str)
        }
        return groupsMap.values.toList()
    }
}
