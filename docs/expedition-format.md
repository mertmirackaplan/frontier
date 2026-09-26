# Expedition format

An expedition is a graph of rooms connected by player choices.

## Room types

| Type | Purpose |
|------|---------|
| `START` | Expedition entrance |
| `COMBAT` | Combat encounter |
| `TREASURE` | Loot-focused room |
| `EVENT` | Event or mystery content |
| `MERCHANT` | Mid-run trades |
| `ELITE` | Harder combat |
| `BOSS` | Final encounter |
| `EXIT` | Extraction |

## Example

See [examples/expeditions/example_expedition.yml](../examples/expeditions/example_expedition.yml) for a small fictional example.

Encounter definitions are shown in [examples/encounters/example_encounters.yml](../examples/encounters/example_encounters.yml).

The examples explain the configuration model. Your installed FRONTIER configuration is the source of truth for the exact fields supported by your release.
