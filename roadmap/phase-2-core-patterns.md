# Phase 2: Core Patterns

The bread-and-butter patterns that appear in the majority of medium-difficulty problems. These build directly on the pointer and hashmap skills from Phase 1.

**Prerequisites:** Comfortable with Phase 1 patterns (two pointers, hashmaps).

---

## Sliding Window (Fixed Size)

**Core idea:** Maintain a window of fixed size K, sliding it across the array. Add the new element entering the window and remove the one leaving — O(n) instead of O(n*k).

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Maximum Average Subarray I (LC 643) | Easy | Pure fixed-window sum |
| 2 | Find All Anagrams in a String (LC 438) | Medium | Fixed window with frequency matching |
| 3 | Permutation in String (LC 567) | Medium | Fixed window + hashmap comparison |
| 4 | Maximum Sum of Distinct Subarrays With Length K (LC 2461) | Medium | Fixed window with uniqueness constraint |

**Mastery signals:**
- [ ] Can explain why sliding window is O(n) not O(n*k)
- [ ] Can maintain a running sum/count as the window slides
- [ ] Can identify fixed-size window problems from the problem statement

---

## Sliding Window (Variable Size)

**Core idea:** Expand the window by advancing the right pointer, shrink it by advancing the left pointer when a condition is violated. Find the optimal window size.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Best Time to Buy and Sell Stock (LC 121) | Easy | Simplified variable window (track min so far) |
| 2 | Longest Substring Without Repeating Characters (LC 3) | Medium | Classic variable window with HashSet |
| 3 | Minimum Size Subarray Sum (LC 209) | Medium | Shrink window when sum exceeds target |
| 4 | Longest Repeating Character Replacement (LC 424) | Medium | Variable window with frequency + condition |
| 5 | Minimum Window Substring (LC 76) | Hard | Variable window with character frequency matching |

**Mastery signals:**
- [ ] Can write the expand/shrink loop structure from memory
- [ ] Can identify the window condition (when to shrink vs expand)
- [ ] Can explain when to use fixed vs variable sliding window
- [ ] Can track window state with a hashmap or counter

---

## Binary Search

**Core idea:** Eliminate half the search space each step. Works on sorted data or any monotonic condition. O(log n).

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Binary Search (LC 704) | Easy | Standard implementation — get the template right |
| 2 | First Bad Version (LC 278) | Easy | Binary search on a boolean condition |
| 3 | Search Insert Position (LC 35) | Easy | Finding insertion point (left boundary) |
| 4 | Search in Rotated Sorted Array (LC 33) | Medium | Binary search with modified invariant |
| 5 | Koko Eating Bananas (LC 875) | Medium | Binary search on the answer |

**Mastery signals:**
- [ ] Can write binary search without off-by-one errors (lo, hi, mid boundary conditions)
- [ ] Can explain the difference between `lo < hi`, `lo <= hi`, and `lo + 1 < hi`
- [ ] Can apply binary search on the answer (search over possible results)
- [ ] Can handle rotated or partially sorted arrays

---

## Monotonic Stack

**Core idea:** Maintain a stack where elements are always in increasing (or decreasing) order. Used to find the next greater/smaller element efficiently.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Valid Parentheses (LC 20) | Easy | Stack fundamentals (not monotonic, but builds stack comfort) |
| 2 | Daily Temperatures (LC 739) | Medium | Classic next-greater-element with monotonic decreasing stack |
| 3 | Next Greater Element I (LC 496) | Easy | Monotonic stack + hashmap for mapping |
| 4 | Largest Rectangle in Histogram (LC 84) | Hard | Monotonic increasing stack — the canonical hard problem |

**Mastery signals:**
- [ ] Can explain when to use increasing vs decreasing monotonic stack
- [ ] Can trace through the stack operations on paper for a given input
- [ ] Can identify "next greater/smaller element" problems
- [ ] Can explain why monotonic stack is O(n) despite the inner while loop
