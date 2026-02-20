# Phase 3: Trees & Graphs

Recursive thinking and graph traversal. This phase requires a shift in how you think about problems — from iterating over flat structures to navigating connected ones.

**Prerequisites:** Comfortable with Phase 1-2 patterns. Basic recursion understanding helps.

---

## Recursion & Backtracking

**Core idea:** Build solutions incrementally, exploring all possibilities. When a path fails, undo the last choice (backtrack) and try the next option. Think of it as a decision tree.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Subsets (LC 78) | Medium | Pure recursive enumeration — the template problem |
| 2 | Permutations (LC 46) | Medium | Backtracking with "used" tracking |
| 3 | Combination Sum (LC 39) | Medium | Backtracking with a target constraint |
| 4 | Letter Combinations of a Phone Number (LC 17) | Medium | Backtracking with a mapping |
| 5 | N-Queens (LC 51) | Hard | Constraint-heavy backtracking |

**Mastery signals:**
- [ ] Can write the backtracking template (choose, explore, unchoose) from memory
- [ ] Can trace a recursion tree on paper and predict the output
- [ ] Can identify when a problem requires generating all combinations/permutations/subsets
- [ ] Can add pruning conditions to avoid unnecessary branches

---

## BFS

**Core idea:** Explore nodes level by level using a queue. Finds the shortest path in unweighted graphs. Think "ripple effect" — process everything at distance 1, then distance 2, etc.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Binary Tree Level Order Traversal (LC 102) | Medium | Standard BFS on a tree |
| 2 | Number of Islands (LC 200) | Medium | BFS on a grid (2D graph) |
| 3 | Rotting Oranges (LC 994) | Medium | Multi-source BFS with time tracking |
| 4 | Word Ladder (LC 127) | Hard | BFS for shortest transformation sequence |

**Mastery signals:**
- [ ] Can write BFS with a queue and visited set from memory
- [ ] Can adapt BFS to grids (4-directional neighbors)
- [ ] Can explain why BFS finds shortest path in unweighted graphs
- [ ] Can implement multi-source BFS (multiple starting points)

---

## DFS

**Core idea:** Explore as deep as possible before backtracking. Uses recursion (call stack) or an explicit stack. Used for path finding, connected components, and tree traversal.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Maximum Depth of Binary Tree (LC 104) | Easy | Simplest recursive DFS |
| 2 | Path Sum (LC 112) | Easy | DFS with target tracking |
| 3 | Number of Islands (LC 200) | Medium | DFS alternative to BFS — compare both |
| 4 | Clone Graph (LC 133) | Medium | DFS with visited hashmap |
| 5 | Pacific Atlantic Water Flow (LC 417) | Medium | DFS from boundary, reverse thinking |

**Mastery signals:**
- [ ] Can choose between BFS and DFS for a given problem and explain why
- [ ] Can implement DFS both recursively and iteratively
- [ ] Can track path state during DFS traversal
- [ ] Can apply DFS to grids, trees, and adjacency-list graphs

---

## Binary Tree Patterns

**Core idea:** Most binary tree problems follow a few templates: traverse and collect, compare two subtrees, or build/modify the tree. The key is identifying which template applies.

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Invert Binary Tree (LC 226) | Easy | Simple recursive transformation |
| 2 | Same Tree (LC 100) | Easy | Two-tree comparison pattern |
| 3 | Validate Binary Search Tree (LC 98) | Medium | Range-passing recursive validation |
| 4 | Lowest Common Ancestor of a BST (LC 235) | Medium | BST property exploitation |
| 5 | Binary Tree Maximum Path Sum (LC 124) | Hard | Post-order with global state |

**Mastery signals:**
- [ ] Can identify pre-order, in-order, and post-order traversal use cases
- [ ] Can write recursive tree solutions using return values (bottom-up) vs parameters (top-down)
- [ ] Can validate BST properties with range constraints
- [ ] Can handle tree edge cases: null nodes, single node, skewed trees

---

## Graph Traversal

**Core idea:** Represent relationships as adjacency lists. Apply BFS/DFS with cycle detection and visited tracking. Many problems reduce to "traverse a graph and check a property."

**Problems:**
| # | Problem | Difficulty | Why |
|---|---------|-----------|-----|
| 1 | Find if Path Exists in Graph (LC 1971) | Easy | Basic adjacency list + BFS/DFS |
| 2 | Course Schedule (LC 207) | Medium | Cycle detection in directed graph |
| 3 | Number of Connected Components (LC 323) | Medium | Connected components with DFS |
| 4 | Graph Valid Tree (LC 261) | Medium | Tree = connected + no cycles |

**Mastery signals:**
- [ ] Can build an adjacency list from an edge list
- [ ] Can detect cycles in directed and undirected graphs
- [ ] Can count connected components
- [ ] Can explain the difference between graph traversal on directed vs undirected graphs
