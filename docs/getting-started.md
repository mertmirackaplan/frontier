# Getting started

This guide assumes you have purchased FRONTIER.

## Requirements

- Paper 26.2
- Java 25
- Optional: Vault + an economy plugin for currency rewards

## Install

1. Stop the server.
2. Copy `FRONTIER-1.0.0.jar` into `plugins/`.
3. Start Paper with Java 25.
4. FRONTIER generates its configuration under `plugins/FRONTIER/`.
5. If demo installation is enabled, the included Sunken Mines demo is installed automatically.

Use a full server restart rather than Bukkit `/reload` or PlugMan.

## Start an expedition

Solo:

```text
/frontier expedition list
/frontier expedition start <expedition_id>
```

Party:

```text
/frontier party invite PlayerB
/frontier party accept
/frontier expedition start <expedition_id>
```

The party limit is 4 players, the invitee must be online, and only the leader can start the expedition.

## Next steps

- [Commands](commands.md)
- [Permissions](permissions.md)
- [Configuration](configuration.md)
- [Expedition format](expedition-format.md)
- [FAQ](faq.md)
