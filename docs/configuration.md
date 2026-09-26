# Configuration (buyer-facing)

On first enable, FRONTIER generates files under `plugins/FRONTIER/`. Prefer letting the plugin write defaults, then edit carefully.

## Typical files

| File | Purpose |
|------|---------|
| `config.yml` | Global behaviour: death rules, party voting, modifiers, demo auto-install, restart-related flags |
| `messages.yml` | Player-facing MiniMessage strings |
| `expeditions.yml` | Expedition graphs, spawns, template world names |
| `encounters.yml` | Encounters, merchant offers, reward pools |
| Local database file | Stats / history / session scaffolding (managed by the plugin) |

Exact keys and defaults ship with the commercial package. Educational, **fictional** samples in this repository teach *shape* only — they are not a dump of production balancing.

## Safe editing tips

1. Back up `plugins/FRONTIER/` before large edits.
2. Use `/frontier reload` (permission `frontier.reload`) to reload YAML after changes — this is **not** Bukkit `/reload`.
3. Broken expedition graphs should fail validation with actionable console errors; fix the graph rather than forcing a soft server reload.
4. Never commit real server configs that contain private UUIDs, economy credentials, or webhook tokens to public repos.

## Educational examples

- [`examples/expeditions/example_expedition.yml`](../examples/expeditions/example_expedition.yml)
- [`examples/encounters/example_encounters.yml`](../examples/encounters/example_encounters.yml)

These examples use fictional IDs and generic content. They are for learning format — not for cloning commercial demo balancing.
