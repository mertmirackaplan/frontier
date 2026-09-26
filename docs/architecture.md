# Architecture

FRONTIER is built around a simple expedition lifecycle: a configured expedition becomes a temporary run, players move through a room graph, and the run ends with extraction or failure.

## Core loop

```text
Expedition template
        │
        ▼
   Temporary run
        │
        ├── Rooms
        │    ├── Encounters
        │    ├── Path choices
        │    └── Merchant / Boss / Extraction
        │
        ├── Extract  → secure current rewards → cleanup
        └── Descend  → increase risk/reward → continue
```

## Core concepts

| Concept | Meaning |
|---------|---------|
| **Expedition** | A configured expedition players can start |
| **Run** | One active playthrough of an expedition |
| **Room** | A node in the expedition graph |
| **Encounter** | Gameplay attached to a room, such as combat or treasure |
| **Party** | A group of up to 4 players sharing a run |
| **Extract** | End the run and secure rewards at the current multiplier |
| **Descend** | Continue deeper for a higher multiplier |
| **Merchant** | A mid-run set of useful trades |
| **Modifier** | A rule that changes the risk or rewards of a run |

## Content model

Expedition content is configured as a graph of rooms. Rooms reference encounters and define the choices available to players.

The public examples show the configuration model without exposing the implementation of the commercial engine.

See [expedition-format.md](expedition-format.md) and [examples/](../examples/).
