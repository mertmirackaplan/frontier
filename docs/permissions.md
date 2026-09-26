# Permissions

| Permission | Default | Description |
|------------|---------|-------------|
| `frontier.use` | `true` | Basic commands / menu / expeditions / stats |
| `frontier.party` | `true` | Party invite / accept / leave / disband |
| `frontier.reload` | `op` | `/frontier reload` |
| `frontier.admin` | `op` | Admin tools (demo install, verify, sessions, cleanup, …) |
| `frontier.debug` | `op` | Debug features (for example `admin room debug`) |

## LuckPerms-style examples

```
lp user <name> permission set frontier.admin true
lp group default permission set frontier.use true
lp group default permission set frontier.party true
```

Ops receive admin / reload / debug by default via Bukkit defaults.

Tab completion does not expose admin session identifiers or admin-only suggestions to players without `frontier.admin`.
