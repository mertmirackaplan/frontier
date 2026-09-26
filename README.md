# FRONTIER

**Replayable expeditions for Minecraft Survival.**

FRONTIER adds a new gameplay loop to Survival servers: players enter expeditions, explore branching rooms, fight encounters, collect loot, and decide how far they want to push their run.

| | |
|---|---|
| Version | `1.0.0` |
| Paper | `26.2` |
| Java | `25` |
| Distribution | Commercial |

FRONTIER is available on [BuiltByBit](https://builtbybit.com/). This repository contains documentation, examples, and integration resources for server owners and developers.

## How it works

```text
Enter
  ↓
Explore
  ↓
Choose your path
  ↓
Fight / Loot / Discover
  ↓
Take the risk
  ↓
Extract or Descend
  ↓
Boss
  ↓
Rewards
```

Players can run expeditions solo or with a party of up to 4 players.

Available room types include:

- Combat
- Treasure
- Events
- Mystery
- Merchant
- Elite encounters
- Bosses
- Extraction

### The core mechanic

The deeper you go, the higher the reward multiplier.

At key points, the party can **Extract** and secure the current rewards, or **Descend** for a higher multiplier and greater risk.

## Quick start

After installing FRONTIER:

```text
/frontier expedition list
/frontier expedition start <expedition_id>
```

For parties:

```text
Player A:
/frontier party invite PlayerB

Player B:
/frontier party accept

Player A:
/frontier expedition start <expedition_id>
```

The party limit is 4 players and only the leader can start an expedition.

## Installation

1. Purchase FRONTIER from BuiltByBit.
2. Download `FRONTIER-1.0.0.jar`.
3. Put the JAR into your Paper server's `plugins/` folder.
4. Start the server with Java 25.
5. FRONTIER generates its configuration automatically on first startup.

The included demo expedition can be installed automatically from the plugin configuration.

For detailed setup instructions, see [INSTALL.md](INSTALL.md).

## Documentation

- [Installation](INSTALL.md)
- [Commands](docs/commands.md)
- [Permissions](docs/permissions.md)
- [Configuration](docs/configuration.md)
- [Expedition Format](docs/expedition-format.md)
- [Architecture](docs/architecture.md)
- [FAQ](docs/faq.md)

## Development & integrations

The public repository includes examples for creating expedition content and integrating other plugins with FRONTIER.

See [docs/](docs/) and [examples/](examples/) to get started.

## Support

For bugs and documentation issues, open a GitHub issue.

For purchase and license support, use the BuiltByBit resource page.

For security vulnerabilities, see [SECURITY.md](SECURITY.md).

## License

FRONTIER's production plugin and proprietary implementation are commercial software. Documentation and examples in this repository are provided for reference and integration purposes.

See [LICENSE](LICENSE) for details.
