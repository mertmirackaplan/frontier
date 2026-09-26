# FRONTIER

**FRONTIER is a premium replayable expedition system for Minecraft Survival servers.**

| | |
|---|---|
| Version | `1.0.0` |
| Paper | **26.2** |
| Java | **25** |
| Distribution | Commercial (BuiltByBit) |
| This repository | Documentation, examples, and integration resources |

> **Commercial software.** The production FRONTIER plugin is proprietary and sold via BuiltByBit.  
> **This public repository is not the product.** It publishes buyer-facing documentation, educational YAML examples, and conceptual integration stubs only. It does **not** contain the production engine, JAR, or proprietary implementation.

---

## What FRONTIER does

FRONTIER runs **authored expedition templates** (rooms, encounters, and rewards configured in YAML) as temporary run worlds. Players explore branching rooms, fight, loot, vote on paths, and choose to **Extract** (keep loot) or **Descend** (raise the multiplier and the danger).

Typical loop:

1. Start solo or as a party (max **4**).
2. Explore rooms: combat, treasure, event/mystery, merchant, elite, boss, extraction.
3. Vote on paths — tradeoffs show risk vs reward.
4. At key rooms: **Extract** at the current loot multiplier, or **Descend** for higher risk/reward.
5. By default, death ends the run and unfinished rewards are lost.
6. On extract, rewards are delivered and the temporary run world is cleaned up safely.

---

## Screenshots / video

| Media | Link |
|-------|------|
| Trailer / gameplay | *[placeholder — add BuiltByBit / YouTube link]* |
| Expedition HUD | *[placeholder]* |
| Merchant GUI | *[placeholder]* |
| Path vote screen | *[placeholder]* |

---

## Purchase & install

1. Purchase FRONTIER on **BuiltByBit**: *[purchase link placeholder]*
2. Download `FRONTIER-1.0.0.jar` from your BuiltByBit library.
3. Place the JAR in your Paper server’s `plugins/` folder.
4. Start Paper with **Java 25**.
5. On first enable, configs generate under `plugins/FRONTIER/` and the demo expedition can auto-install (when enabled in config).

Full install notes ship with the commercial package (`INSTALL.md`). Prefer a **full server restart** over Bukkit `/reload` or PlugMan soft-reload.

### Quick start (after install)

```
/frontier expedition list
/frontier expedition start <expedition_id>
```

Party example (permission `frontier.party`, max size 4, invitee must be online, only the leader starts):

```
# Player A (leader)
/frontier party invite PlayerB

# Player B (online)
/frontier party accept

# Player A (leader)
/frontier expedition start <expedition_id>
```

---

## Documentation (this repo)

| Doc | Description |
|-----|-------------|
| [Getting started](docs/getting-started.md) | First run after purchase |
| [Architecture](docs/architecture.md) | High-level product overview |
| [Configuration](docs/configuration.md) | Config file roles (buyer-facing) |
| [Expedition format](docs/expedition-format.md) | Educational YAML shape |
| [Commands](docs/commands.md) | Public command list |
| [Permissions](docs/permissions.md) | Permission nodes |
| [FAQ](docs/faq.md) | Common questions |

Educational examples live under [`examples/`](examples/). Conceptual API stubs live under [`api/examples/`](api/examples/).

---

## API / integrations

This repository includes **examples only** — conceptual Java stubs and notes for server owners and addon authors who already own FRONTIER.

- They are **not** a published stable SDK and **not** a copy of the commercial API surface.
- They are insufficient to rebuild the product.
- See [`api/examples/README.md`](api/examples/README.md) and [`examples/integrations/README.md`](examples/integrations/README.md).

---

## Issues & support

- **Bug reports / feature discussion:** use [GitHub Issues](../../issues) with the templates in `.github/ISSUE_TEMPLATE/`.
- **Security:** see [SECURITY.md](SECURITY.md) — report privately; do not disclose exploits publicly.
- **Purchase / license support:** BuiltByBit resource page / seller messaging *[placeholder]*.

Please do **not** open issues asking for production source, JARs, or circumvention of the commercial license.

---

## License & commercial boundary

See [LICENSE](LICENSE).

- FRONTIER (brand, plugin binary, proprietary engine) — **All Rights Reserved**.
- Public docs and examples in this repo — limited permission for learning and integration against a **licensed** copy of FRONTIER.
- Redistribution of the commercial plugin JAR, demo worlds shipped with the product, or proprietary implementation is **not** allowed.

---

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). Contributions here are for documentation, examples, and discussion — not for the proprietary production engine.
