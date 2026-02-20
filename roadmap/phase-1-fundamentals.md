# Phase 1: Fundamentals

Build comfort with array/string manipulation, hashmaps, and basic pointer techniques. These are the building blocks for every pattern that follows.

**Prerequisites:** Basic Kotlin syntax, familiarity with arrays and strings.

---

## Frequency Counting / Hashmaps

**Core idea:** Use a hashmap to count occurrences or track seen elements, converting O(n^2) lookups into O(1).

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Two Sum (LC 1) | Easy | Classic hashmap lookup — complement search |
| 2 | Valid Anagram (LC 242) | Easy | Frequency counting with character arrays |
| 3 | Group Anagrams (LC 49) | Medium | Hashmap with sorted-string keys |
| 4 | Top K Frequent Elements (LC 347) | Medium | Frequency map + selection |
| 5 | Longest Consecutive Sequence (LC 128) | Medium | HashSet for O(1) lookups to avoid sorting |

**Mastery signals:**
- [ ] Can identify when a problem needs O(1) lookup or counting
- [ ] Can choose between HashMap, HashSet, and array-based frequency counting
- [ ] Can explain why hashmap turns O(n^2) brute force into O(n)
- [ ] Can implement frequency counting in Kotlin without looking anything up

---

## Two Pointers (Same Direction)

**Core idea:** Use a slow and fast pointer moving in the same direction to process elements in-place or find a condition in a single pass.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Remove Duplicates from Sorted Array (LC 26) | Easy | Classic slow/fast pointer for in-place modification |
| 2 | Move Zeroes (LC 283) | Easy | Partition with same-direction pointers |
| 3 | Remove Element (LC 27) | Easy | In-place removal with write pointer |
| 4 | Linked List Cycle (LC 141) | Easy | Floyd's slow/fast on a linked list |
| 5 | Find the Duplicate Number (LC 287) | Medium | Floyd's cycle detection on array indices |

**Mastery signals:**
- [ ] Can explain the slow/fast pointer invariant (what each pointer represents)
- [ ] Can write in-place array modification without extra space
- [ ] Can apply Floyd's cycle detection and explain why it works
- [ ] Can identify same-direction vs opposite-direction pointer problems

---

## Two Pointers (Opposite Direction)

**Core idea:** Use two pointers starting from opposite ends, moving inward based on a condition. Works on sorted arrays or symmetric structures.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Valid Palindrome (LC 125) | Easy | Opposite-end scan with character filtering |
| 2 | Two Sum II - Sorted Array (LC 167) | Easy | Classic opposite-direction search in sorted array |
| 3 | 3Sum (LC 15) | Medium | Fix one element, two-pointer the rest |
| 4 | Container With Most Water (LC 11) | Medium | Greedy shrink from both ends |
| 5 | Trapping Rain Water (LC 42) | Hard | Two-pointer with running max from each side |

**Mastery signals:**
- [ ] Can explain why opposite-direction pointers work on sorted arrays
- [ ] Can implement the "shrink from both sides" logic correctly
- [ ] Can extend two-pointer to 3Sum by fixing one element
- [ ] Can handle edge cases: empty arrays, single elements, all-same elements
