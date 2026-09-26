# Architecture (high-level overview)

This document describes FRONTIER at a **product** level for operators and integrators. It intentionally omits implementation recipes for the proprietary engine, session recovery internals, world-copy machinery, anti-exploit systems, reward pipelines, and related commercial IP.

## Core loop

```
Expedition template
        │
        ▼
   Temporary run
        │
        ├── Rooms (graph of authored spaces)
        │      ├── Encounters (combat / treasure / event / …)
        │      ├── Path votes (risk vs reward tradeoffs)
        │      └── Merchant / boss / extraction nodes
        │
        ├── Extract  → keep loot at current multiplier → cleanup run
        └── Descend  → deeper / higher multiplier → continue
```

## Concepts

| Concept | Plain-language meaning |
|---------|------------------------|
| **Expedition** | An authored template (YAML + template world) players can start |
| **Run** | One playthrough: temporary world instance for that session |
| **Room** | A node in the expedition graph (combat, treasure, event, merchant, boss, extraction, …) |
| **Encounter** | Content attached to rooms (mobs, loot tables, events, merchant offers) |
| **Party** | Up to 4 players; leader starts; members vote on paths / extract-descend |
| **Extract** | End the run and keep rewards at the current loot multiplier |
| **Descend** | Accept more risk for a higher multiplier and continue deeper |
| **Merchant** | Mid-run trade GUI (heal, buff, cleanse, supplies, scrap trade) |

## Boundaries (what this doc does not provide)

- How temporary worlds are copied, isolated, or deleted internally
- Session persistence / restart recovery algorithms
- Anti-exploit / GUI hardening implementation
- Exact reward calculation or boss AI internals
- Package names or class designs from the commercial codebase

For educational config shape, see [expedition-format.md](expedition-format.md) and [`examples/`](../examples/).
