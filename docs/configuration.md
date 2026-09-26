# Configuration

FRONTIER generates its configuration files under `plugins/FRONTIER/` on first startup.

## Main files

| File | Purpose |
|------|---------|
| `config.yml` | Global settings such as death behavior, voting, modifiers, demo installation and restart handling |
| `messages.yml` | Player-facing messages |
| `expeditions.yml` | Expedition graphs, room data and template world names |
| `encounters.yml` | Encounters, merchant offers and reward pools |
| Database file | Stats, history and session data managed by the plugin |

For exact keys and defaults, use the generated files from your installed copy.

## Editing safely

1. Back up `plugins/FRONTIER/` before making large changes.
2. Use `/frontier reload` for FRONTIER's YAML reload.
3. Fix validation errors instead of forcing a server reload.
4. Never publish real server credentials or private player data in public configuration examples.

Public examples are intentionally small and fictional. See [examples/](../examples/).
