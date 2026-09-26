# Commands

Aliases: `/frontier`, `/fr`

| Command | Description | Permission |
|--------|-------------|------------|
| `/frontier` / `/frontier menu` | Main GUI | `frontier.use` |
| `/frontier help` | Help | `frontier.use` |
| `/frontier version` | Version | `frontier.use` |
| `/frontier reload` | Reload YAML configs (not Bukkit `/reload`) | `frontier.reload` |
| `/frontier expedition list` | List expeditions | `frontier.use` |
| `/frontier expedition start <id>` | Start (party leader; **players only**) | `frontier.use` |
| `/frontier expedition status` | Active run status | `frontier.use` |
| `/frontier expedition leave` | Abandon (leader/admin) | `frontier.use` |
| `/frontier party invite <player>` | Invite | `frontier.party` |
| `/frontier party accept` | Accept invite | `frontier.party` |
| `/frontier party leave` | Leave party | `frontier.party` |
| `/frontier party disband` | Disband (leader) | `frontier.party` |
| `/frontier stats` | Personal stats | `frontier.use` |
| `/frontier admin world list` | Run worlds + template status | `frontier.admin` |
| `/frontier admin world install-demo [force]` | Install/rebuild demo expedition | `frontier.admin` |
| `/frontier admin world verify` | Playerless copy/load/cleanup check | `frontier.admin` |
| `/frontier admin expedition reload` | Reload expedition configs | `frontier.admin` |
| `/frontier admin session list` | List sessions | `frontier.admin` |
| `/frontier admin session info <uuid>` | Session info | `frontier.admin` |
| `/frontier admin room debug` | Current room debug | `frontier.debug` / `frontier.admin` |
| `/frontier admin cleanup` | Clean orphan temporary run worlds | `frontier.admin` |

Expedition **start** is players-only (console rejects).

## Party example

Permission: **`frontier.party`**. Max size: **4**. Invitee must be online. Only the leader starts.

```
# Player A (leader)
/frontier party invite PlayerB

# Player B (online)
/frontier party accept

# Player A (leader)
/frontier expedition start <expedition_id>
```
