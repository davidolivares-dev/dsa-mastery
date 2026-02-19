# Phase 4: Advanced

Dynamic programming, heaps, and specialized data structures. These patterns require solid fundamentals — don't rush here until Phases 1-3 are comfortable.

**Prerequisites:** Strong with recursion, BFS/DFS, and all Phase 1-2 patterns.

---

## Dynamic Programming (1D)

**Core idea:** Break a problem into overlapping subproblems. Define a recurrence relation, then solve bottom-up (tabulation) or top-down (memoization). Start by finding the state — what information do you need to make a decision at each step?

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Climbing Stairs (LC 70) | Easy | The simplest DP — Fibonacci structure |
| 2 | House Robber (LC 198) | Medium | Classic "take or skip" decision |
| 3 | Coin Change (LC 322) | Medium | Unbounded knapsack variant |
| 4 | Longest Increasing Subsequence (LC 300) | Medium | DP with binary search optimization |
| 5 | Word Break (LC 139) | Medium | DP over string positions |

**Mastery signals:**
- [ ] Can identify the state and recurrence relation for a new problem
- [ ] Can implement both top-down (memoization) and bottom-up (tabulation)
- [ ] Can optimize space from O(n) array to O(1) when only previous states are needed
- [ ] Can explain why greedy doesn't work when DP is needed

---

## Dynamic Programming (2D)

**Core idea:** When the state depends on two dimensions (two strings, grid position, two indices). Same principles as 1D DP but with a 2D table.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Unique Paths (LC 62) | Medium | Grid DP — simplest 2D case |
| 2 | Longest Common Subsequence (LC 1143) | Medium | Two-string DP — the template problem |
| 3 | Edit Distance (LC 72) | Medium | Two-string DP with three operations |
| 4 | 0/1 Knapsack (not on LC — use GeeksforGeeks) | Medium | The classic DP problem |
| 5 | Longest Palindromic Subsequence (LC 516) | Medium | Interval DP on a single string |

**Mastery signals:**
- [ ] Can set up a 2D DP table with correct base cases
- [ ] Can trace through the table filling process on paper
- [ ] Can optimize 2D DP space from O(n*m) to O(n) when possible
- [ ] Can recognize when a problem has two-dimensional state

---

## Heap / Priority Queue

**Core idea:** Efficiently access the minimum or maximum element. Use when you need repeated access to the smallest/largest element from a dynamic collection.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Kth Largest Element in a Stream (LC 703) | Easy | Min-heap of size K |
| 2 | Last Stone Weight (LC 1046) | Easy | Max-heap simulation |
| 3 | K Closest Points to Origin (LC 973) | Medium | Top-K pattern with heap |
| 4 | Merge K Sorted Lists (LC 23) | Hard | Heap for efficient K-way merge |
| 5 | Find Median from Data Stream (LC 295) | Hard | Two-heap technique |

**Mastery signals:**
- [ ] Can choose between min-heap and max-heap for a given problem
- [ ] Can implement top-K pattern using a heap of size K
- [ ] Can use Kotlin's PriorityQueue with custom comparators
- [ ] Can explain heap operations are O(log n) and why

---

## Trie

**Core idea:** A tree where each node represents a character. Efficient for prefix matching, autocomplete, and word search. O(L) lookup where L is word length.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Implement Trie (LC 208) | Medium | Build the data structure from scratch |
| 2 | Design Add and Search Words (LC 211) | Medium | Trie with wildcard DFS |
| 3 | Word Search II (LC 212) | Hard | Trie + backtracking on a grid |

**Mastery signals:**
- [ ] Can implement a Trie with insert, search, and startsWith from memory
- [ ] Can explain when Trie is better than HashSet for string problems
- [ ] Can combine Trie with other patterns (DFS, backtracking)

---

## Union-Find

**Core idea:** Track connected components with near-O(1) operations. Two operations: find (which group does X belong to?) and union (merge two groups). Use path compression and union by rank for efficiency.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Number of Provinces (LC 547) | Medium | Basic union-find for connected components |
| 2 | Redundant Connection (LC 684) | Medium | Detect cycle using union-find |
| 3 | Accounts Merge (LC 721) | Medium | Union-find with string mapping |
| 4 | Number of Connected Components (LC 323) | Medium | Compare with DFS approach |

**Mastery signals:**
- [ ] Can implement union-find with path compression and union by rank
- [ ] Can explain why union-find is nearly O(1) amortized
- [ ] Can choose between union-find and DFS for connected-component problems

---

## Topological Sort

**Core idea:** Order nodes in a directed acyclic graph (DAG) such that every edge goes from earlier to later. Used for dependency resolution. BFS-based (Kahn's algorithm) or DFS-based.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Course Schedule (LC 207) | Medium | Detect if topological order exists (cycle detection) |
| 2 | Course Schedule II (LC 210) | Medium | Return the actual topological order |
| 3 | Alien Dictionary (LC 269) | Hard | Build graph from constraints, then topo sort |

**Mastery signals:**
- [ ] Can implement Kahn's algorithm (BFS with in-degree tracking) from memory
- [ ] Can detect cycles using topological sort (if not all nodes processed, cycle exists)
- [ ] Can identify dependency-ordering problems as topological sort
