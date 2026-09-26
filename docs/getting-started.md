# Getting started

This guide assumes you purchased FRONTIER and received the commercial package from BuiltByBit.

## Requirements

- Paper **26.2** (or API-compatible fork on the same line)
- **Java 25** for the Minecraft server process
- Optional: Vault + an economy plugin (currency rewards only)

## Install (summary)

1. Stop the server if it is running.
2. Copy `FRONTIER-1.0.0.jar` into `<server>/plugins/`.
3. Start Paper with Java 25.
4. On first enable, configs appear under `plugins/FRONTIER/`.
5. If demo auto-install is enabled in config, the demo expedition template installs on first enable.

Prefer a **full server restart**. Do not rely on Bukkit `/reload` or PlugMan soft-reload with FRONTIER.

## First expedition

```
/frontier expedition list
/frontier expedition start <expedition_id>
```

Party (permission `frontier.party`, max **4**, invitee online, leader starts):

```
/frontier party invite PlayerB
/frontier party accept
/frontier expedition start <expedition_id>
```

## Next steps

- [Commands](commands.md)
- [Permissions](permissions.md)
- [Configuration](configuration.md)
- [Expedition format](expedition-format.md) (educational examples)
- [FAQ](faq.md)

Commercial package extras (`INSTALL.md`, `KNOWN_LIMITATIONS.md`, checksums) ship with the paid download — they are not duplicated as binaries in this public repository.
