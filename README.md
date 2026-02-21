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

## Learning with Claude Code

This repo is built around [Claude Code](https://claude.com/claude-code) — Anthropic's CLI for Claude. Open the repo in Claude Code and use slash commands to guide each learning session. Claude reads your notes and solutions automatically, so context carries across commands.

### Commands

| Command | What it does |
| ------- | ------------ |
| `/deep-dive <pattern>` | Teaches the pattern from scratch: core intuition, recognition signals, a Kotlin template, complexity analysis, common mistakes, and representative problems |
| `/solve <problem name>` | Socratic problem-solving — Claude asks questions to guide your thinking without giving the answer away |
| `/extract-notes <pattern>` | Reads your solved problems and writes a distilled reference sheet to `patterns/<pattern>/notes.md` |
| `/review <file-path>` | Reviews a Kotlin solution for correctness, idiomatic style, logic simplification, and optimal complexity |
| `/reflect <pattern>` | Five-question mastery assessment — gives you a proficiency rating and identifies specific gaps before you move on |
| `/plan-roadmap` | Reviews your current progress across all patterns and recommends what to focus on next |

### Example: Learning a Pattern End to End

**Session 1 — Learn the pattern**

```
/deep-dive two-pointers-opposite-direction
```

Claude teaches the pattern. Then go to LeetCode and solve 1–2 problems (e.g., LC 167, LC 15). Paste your `.kt` files into `patterns/two-pointers-opposite-direction/problems/`.

**Session 2 — Practice and consolidate**

```
/solve 3Sum
```

Claude guides you through a harder problem with questions, not answers. When stuck, ask for a hint. After solving it, paste the solution into the problems folder.

```
/extract-notes two-pointers-opposite-direction
```

Claude reads everything you've solved and writes a clean reference sheet to `patterns/two-pointers-opposite-direction/notes.md`.

```
/review patterns/two-pointers-opposite-direction/problems/three-sum.kt
```

Claude reviews your solution for bugs, idiomatic Kotlin, and complexity — and shows you an improved version.

**Before moving on — mastery check**

```
/reflect two-pointers-opposite-direction
```

Claude asks five questions (conceptual, recognition, code tracing, edge cases, comparison). You get a proficiency rating and a clear list of gaps. Only move to the next pattern if you hit **Strong** or **Mastered**.

---

## Using This as a Template

This repo is designed to be forked. See [templates/README.md](templates/README.md) for instructions on personalizing it for your own learning journey.
