# Changelog

Release-level notes for the **commercial** FRONTIER product. This public repository tracks documentation/examples separately; product binaries ship via BuiltByBit.

## 1.0.0 — Public release (2026-09-26)

First public release of FRONTIER — a premium replayable expedition system for Minecraft Survival servers.

### Highlights

- Demo expedition with optional auto-install on first enable
- Branching rooms: combat, treasure, event, mystery, merchant, elite, boss, extraction
- Party support (max 4) with path votes and extract/descend votes
- Risk/reward loop: depth, loot multiplier, extract vs descend
- Mid-run merchant trades (heal, temporary buff, cleanse, supplies, scrap trade)
- Restart-safe session handling for incomplete runs (abandon incomplete sessions; restore stranded players; clean temporary run worlds)
- Config validation with actionable console errors for broken expedition graphs
- GUI abuse hardening for common inventory interaction abuse patterns
- Optional Vault economy soft-depend for currency rewards
- Target platform: Paper **26.2**, Java **25**

### Operator notes

- Prefer a full server restart over Bukkit `/reload` or PlugMan-style soft reload
- See the commercial package `INSTALL.md` and `KNOWN_LIMITATIONS.md` for buyer-facing install and limits
