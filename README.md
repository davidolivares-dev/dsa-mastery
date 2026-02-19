# DSA Mastery

A structured, pattern-based approach to mastering Data Structures and Algorithms in Kotlin. Designed for use with [Claude](https://claude.ai) by Anthropic.

## Philosophy

Pattern mastery over problem volume. Deep understanding over speed. Consistency over intensity.

The approach: study one algorithmic pattern at a time, solve representative problems, extract reusable mental models, and move on only after mastery signals are met.

## Repository Structure

```
roadmap/     Learning plan — 5 phases, 18 patterns, with progress tracking
.claude/     Slash commands for Claude Code learning sessions
patterns/    Reference library — your notes and solutions, filled in as you learn
templates/   Fork instructions and log templates
log/         Optional learning journal
```

## Quick Start

1. Read the [roadmap](roadmap/README.md) to see the full learning plan
2. Start with [Phase 1: Fundamentals](roadmap/phase-1-fundamentals.md)
3. Open the repo in [Claude Code](https://claude.com/claude-code) and use slash commands (e.g., `/deep-dive`, `/solve`) to guide your learning
4. Solve problems on LeetCode, paste your Kotlin solutions into `patterns/<pattern>/problems/`
5. Fill in your pattern notes in `patterns/<pattern>/notes.md`
6. Check off completed patterns in the [roadmap](roadmap/README.md)

## Roadmap Overview

| Phase | Focus | Patterns |
| ----- | ----- | -------- |
| [1. Fundamentals](roadmap/phase-1-fundamentals.md) | Arrays, strings, hashmaps | Frequency counting, two pointers (same + opposite direction) |
| [2. Core Patterns](roadmap/phase-2-core-patterns.md) | Most common interview patterns | Sliding window (fixed + variable), binary search, monotonic stack |
| [3. Trees & Graphs](roadmap/phase-3-trees-and-graphs.md) | Recursive thinking, traversal | Backtracking, BFS, DFS, binary trees, graphs |
| [4. Advanced](roadmap/phase-4-advanced.md) | DP, specialized structures | Dynamic programming, heaps, trie, union-find |
| [5. Synthesis](roadmap/phase-5-synthesis.md) | Interview readiness | Mixed practice, timed sessions |

## Using This as a Template

This repo is designed to be forked. See [templates/README.md](templates/README.md) for instructions on personalizing it for your own learning journey.
