# FAQ

## Where can I get FRONTIER?

FRONTIER is available on [BuiltByBit](https://builtbybit.com/). The commercial download includes the production JAR and full setup files.

## Which Paper / Java versions are supported?

For the 1.0.0 release line:

- Paper 26.2
- Java 25

## Does FRONTIER require Vault?

No. Vault is optional and is only used for currency-based rewards.

## Can I use `/reload`?

Use a full server restart for normal plugin updates and configuration changes. FRONTIER has its own YAML reload command, `/frontier reload`.

## What happens when a player dies?

By default, death ends the expedition and unfinished rewards are lost.

## What happens if the server restarts during a run?

Incomplete runs are cleaned up safely. Stranded players are restored and temporary run worlds are removed. FRONTIER does not currently resume an interrupted run from the exact room.

## Can I create my own expeditions?

Yes. FRONTIER is built around configurable expedition content. See [Expedition Format](expedition-format.md) for the public configuration concepts and examples.

## Where do I report bugs?

Use [GitHub Issues](../issues) for normal bugs and documentation problems. Security-sensitive issues should be reported privately through [SECURITY.md](../SECURITY.md).
