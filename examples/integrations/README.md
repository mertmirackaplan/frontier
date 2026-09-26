# Integration examples

This folder is for **server owners and addon authors** who already run a licensed copy of FRONTIER.

## Ideas (high level)

- Listen for expedition start / extract / fail outcomes (see conceptual stubs under [`api/examples/`](../../api/examples/))
- Award cosmetic titles or Discord announcements when a party extracts
- Gate another plugin’s dungeon currency behind FRONTIER completion
- Soft-depend checks: only enable your hook if FRONTIER is present

## Rules

1. Integrations must target a **purchased** FRONTIER install.
2. Do not redistribute the commercial JAR inside your addon zip.
3. Do not scrape or re-publish proprietary configs from the paid demo.
4. Example Java in this repository is **conceptual** — not a guaranteed stable SDK.

## Related

- [`api/examples/README.md`](../../api/examples/README.md)
- [Architecture overview](../../docs/architecture.md)
