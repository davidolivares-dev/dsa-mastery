# DSA Mastery — Project Context

## What This Is

A structured DSA learning repository using pattern-based mastery in Kotlin. Designed for use with Claude Code as a learning companion.

## Directory Structure

- `roadmap/` — Phased learning plan with progress tracking. Read this first.
- `.claude/commands/` — Slash commands for Claude Code learning sessions (e.g., `/deep-dive`, `/solve`).
- `patterns/` — Reference library. One directory per algorithmic pattern, filled in as you learn.
  - Each pattern has `notes.md` (reference sheet) and `problems/` (Kotlin solution files from LeetCode).
- `templates/` — Templates for people forking the repo.
- `log/` — Optional learning journal.

## Conventions

- Pattern directories follow the structure in `patterns/_template/`
- Problem solutions are `.kt` files pasted from LeetCode with a comment header (problem link, pattern, key insight)
- Pattern notes follow the sections defined in `patterns/_template/notes.md`
- All filenames use lowercase-kebab-case

## Language

Kotlin. Solutions target LeetCode's Kotlin environment.

## Workflow

1. Follow the roadmap phases in order
2. For each pattern: run `/deep-dive <pattern-name>` to learn it
3. Solve problems on LeetCode, paste solutions into `patterns/<name>/problems/`
4. Run `/extract-notes <pattern-name>` to distill notes into `patterns/<name>/notes.md`
5. Run `/reflect <pattern-name>` to assess mastery before moving on

## Other Commands

| Command | Purpose |
|---------|---------|
| `/deep-dive <pattern>` | Learn a new pattern from scratch |
| `/solve <problem>` | Guided Socratic problem-solving |
| `/extract-notes <pattern>` | Distill solved problems into pattern notes |
| `/reflect <pattern>` | Assess mastery before moving on |
| `/code-review <file-path>` | Review a Kotlin solution for improvements |
| `/plan-roadmap` | Review progress and plan next sessions |

## Weekly Flow (2-3 hours)

**Session 1:**

- `/deep-dive <pattern>` to learn the pattern
- Solve 1-2 problems on LeetCode

**Session 2:**

- Solve 1-2 more problems
- `/extract-notes <pattern>` to distill your notes
- `/code-review <solution-file>` on your solutions

**Before moving on:**

- `/reflect <pattern>` to assess mastery

## Mastery Rule

Do not move to the next pattern until:

- You recognize the pattern immediately in new problems
- You can explain why it works
- You can write a clean Kotlin template from memory
- You understand the complexity tradeoffs

## Quality Checks

When generating or editing content in this repo:

- Cross-check LeetCode problem difficulties against the actual site — don't guess
- Keep pattern counts consistent across all files (roadmap, README, CLAUDE.md)
- Verify file paths and cross-references actually exist before committing
- When a problem appears in multiple patterns intentionally, add a note explaining why (e.g., "compare BFS vs DFS approach")
