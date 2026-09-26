# FRONTIER

**Replayable expeditions for Minecraft Survival.**

FRONTIER adds a new gameplay loop to Survival servers: players enter expeditions, explore branching rooms, fight encounters, collect loot, and decide how far they want to push their run.

|              |            |
| ------------ | ---------- |
| Version      | `1.0.0`    |
| Paper        | `26.2`     |
| Java         | `25`       |
| Distribution | Commercial |

> FRONTIER is a commercial plugin available on BuiltByBit.
> This repository contains documentation, examples, and integration resources for server owners and developers.

## How it works

A typical expedition looks like this:

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

* Combat
* Treasure
* Events
* Mystery
* Merchant
* Elite encounters
* Bosses
* Extraction

### The core mechanic

The deeper you go, the higher the reward multiplier.

At any point, the party can choose to **Extract** and secure the current rewards, or **Descend** and push the run further.

Go deeper for better rewards — but a failed run can cost you everything you collected.

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

For detailed setup instructions, see [`INSTALL.md`](INSTALL.md).

## Documentation

* [Installation](INSTALL.md)
* [Commands](docs/commands.md)
* [Permissions](docs/permissions.md)
* [Configuration](docs/configuration.md)
* [Expedition Format](docs/expedition-format.md)
* [Architecture](docs/architecture.md)
* [FAQ](docs/faq.md)

## Development & integrations

This repository contains examples for working with FRONTIER from other plugins and for creating custom expedition content.

See [`docs/`](docs/) and [`examples/`](examples/) for the available resources.

The production FRONTIER engine is distributed separately through BuiltByBit.

## Support

For bugs and documentation issues, open a GitHub issue.

For purchase and license support, use the BuiltByBit resource page.

For security vulnerabilities, see [`SECURITY.md`](SECURITY.md).

## License

FRONTIER is commercial software.

The production plugin and its proprietary implementation are not open source. The documentation and examples in this repository are provided for reference and integration purposes.

See [`LICENSE`](LICENSE) for details.
