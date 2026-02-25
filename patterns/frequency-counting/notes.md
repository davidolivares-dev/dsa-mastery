# Frequency Counting

## Core Intuition

Use a HashMap or HashSet to trade space for time — count occurrences, track seen values, or enable O(1) lookups to replace brute-force nested iteration.

## Recognition Signals

- "Find duplicates," "count occurrences," or "frequency of elements"
- Need to check if a complement/partner value exists (e.g., two sum, consecutive neighbors)
- Grouping elements by a shared property (anagrams, equivalence classes)
- "Top K frequent" or ranking by occurrence count
- O(n) time constraint that rules out sorting
- Comparing two collections for sameness (anagram, permutation)

## Algorithm Steps

**Variant A — Frequency Map (count occurrences):**
1. Build a `HashMap<element, count>` in one pass
2. Query the map for results (max count, top K, groups, etc.)

**Variant B — Complement Lookup (find pairs/relationships):**
1. Iterate the array once
2. For each element, check if its complement/neighbor exists in the map/set
3. If yes, record the result; if no, insert the current element

**Variant C — Canonical Key Grouping:**
1. For each element, compute a canonical key (sorted string, frequency signature, etc.)
2. Group elements by key using `HashMap<key, list>`

## Kotlin Template

```kotlin
// Variant A: Frequency map
val freq = mutableMapOf<Int, Int>()
for (item in items) {
    freq[item] = freq.getOrDefault(item, 0) + 1
}

// Variant B: Complement lookup (e.g., Two Sum)
val seen = HashMap<Int, Int>() // value → index
for ((i, num) in nums.withIndex()) {
    val complement = target - num
    if (complement in seen) return intArrayOf(seen.getValue(complement), i)
    seen[num] = i
}

// Variant C: Canonical key grouping (e.g., Group Anagrams)
val groups = mutableMapOf<String, MutableList<String>>()
for (item in items) {
    val key = computeCanonicalKey(item)
    groups.getOrPut(key, ::mutableListOf).add(item)
}

// HashSet for existence checks (e.g., Longest Consecutive Sequence)
val numSet = nums.toHashSet()
for (num in nums) {
    if ((num - 1) !in numSet) { // sequence start
        var curr = num
        var length = 1
        while ((curr + 1) in numSet) { curr++; length++ }
        maxLength = maxOf(maxLength, length)
    }
}
```

## Time/Space Complexity

- **Time:** O(n) for single-pass counting and lookup. O(n·k) if key computation is O(k) (e.g., sorting strings of length k).
- **Space:** O(n) for the HashMap/HashSet. Can be O(1) extra space when using a fixed-size array (e.g., `IntArray(26)` for lowercase letters).

## Common Mistakes

- Forgetting to handle empty input before initializing results (e.g., `maxLength = 1` with empty array)
- Off-by-one with bucket sort: bucket array needs size `n + 1` since an element can appear `n` times
- Using `IntArray(26)` but forgetting to offset with `- 'a'`
- Building the lookup structure *during* iteration when you need the full set upfront (Longest Consecutive Sequence needs the set built first)
- Not considering duplicates — HashSet deduplicates automatically, which can be a feature or a bug

## Variations

- **Fixed-size array vs HashMap:** Use `IntArray(26)` when input is constrained to lowercase letters — faster and less memory overhead
- **Bucket sort by frequency:** When you need "top K frequent," build freq map → bucket by count → walk backwards. Avoids O(n log n) heap sort.
- **HashSet as degenerate case:** When you only need existence (not count), a HashSet suffices (Longest Consecutive Sequence)
- **Increment/decrement trick:** For comparing two sequences, increment for one and decrement for the other in a single array (Valid Anagram)

## Decision Flowchart

- When you see "count," "frequency," "most common," "duplicate" → frequency map
- When you see "find pair/complement" or "does X exist" → complement lookup with HashMap/HashSet
- When you see "group by equivalence" → canonical key grouping
- Choose this over **sorting** when: O(n) is required or you need index information
- Choose this over **two pointers** when: array is unsorted and sorting would lose information
- Don't use this when: input is already sorted (two pointers is simpler), or when the problem needs ordering/positional relationships

## Connected Patterns

- **Two Pointers:** Alternative for sorted arrays (e.g., sorted Two Sum)
- **Bucket Sort:** Natural extension when ranking by frequency (Top K Frequent)
- **Sliding Window:** Often combined — use a frequency map inside the window to track character counts
- **Union-Find:** Alternative for Longest Consecutive Sequence, but overkill here

## Personal Notes

- Two Sum is the gateway problem: the "check complement before inserting" pattern recurs everywhere
- Longest Consecutive Sequence is sneaky — looks like it needs sorting but the HashSet + "only start from sequence beginnings" insight keeps it O(n). Key realization: build the set first, *then* iterate
- `getOrPut(key, ::mutableListOf)` is the idiomatic Kotlin way to build group maps — cleaner than manual containsKey checks
- The `in` / `!in` operators on maps and sets read much more naturally than `.contains()` in Kotlin
- Bucket sort for Top K avoids a heap entirely — the bucket array size is bounded by input size
