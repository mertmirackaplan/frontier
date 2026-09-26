# Expedition format (educational)

> **Educational only.** The YAML below illustrates a plausible public-facing shape for teaching rooms and links. Field names and nesting may differ slightly from your installed commercial defaults. Always treat your generated `plugins/FRONTIER/*.yml` as authoritative.

## Mental model

An expedition is a **directed graph of rooms**:

- One or more **entrance** rooms
- Mid rooms: combat, treasure, event, merchant, elite, …
- **Boss** and **extraction** rooms
- Edges describe path choices (often shown with risk/reward labels to voters)

## Room kinds (conceptual)

| Kind | Role |
|------|------|
| `entrance` | Spawn / intro |
| `combat` | Fight encounter |
| `treasure` | Loot-focused |
| `event` | Narrative / mystery outcome |
| `merchant` | Mid-run trades |
| `elite` | Harder combat |
| `boss` | Capstone fight |
| `extraction` | Extract / descend decision point |

## Minimal fictional sketch

See the full fictional sample:

[`examples/expeditions/example_expedition.yml`](../examples/expeditions/example_expedition.yml)

Encounters referenced by rooms:

[`examples/encounters/example_encounters.yml`](../examples/encounters/example_encounters.yml)

## What not to publish

- Production balancing tables from the paid demo
- Real player UUIDs, IPs, or economy credentials
- Proprietary engine internals disguised as “config docs”
