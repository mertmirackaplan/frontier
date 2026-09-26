# FAQ

## Is this GitHub repository the open-source FRONTIER plugin?

**No.** FRONTIER is commercial proprietary software. This repository publishes documentation, educational examples, and conceptual integration stubs only.

## Where do I buy / download the JAR?

BuiltByBit *[purchase link placeholder]*. The JAR is not hosted in this public repository.

## Which Paper / Java versions are supported?

Paper **26.2** line and **Java 25** for the 1.0.0 release line.

## Can I soft-reload with PlugMan or `/reload`?

Prefer a **full server restart**. Soft reload is unsupported and may log severe warnings.

## Does FRONTIER require Vault?

No. Vault is an optional soft-depend for currency rewards.

## What happens on death?

By default, death ends the run and unfinished rewards are lost. See your `config.yml` and commercial package notes for exact rules.

## What about server restarts mid-run?

Incomplete sessions are handled safely (abandon incomplete sessions, restore stranded players, clean temporary run worlds). Full seamless mid-run resume after restart is not the design goal — safety and consistency are preferred. Details ship in the commercial `INSTALL.md`.

## Can I publish my custom expedition YAML?

Yes, **your** authored content — provided it does not include secrets, private player data, or redistributed proprietary demo balancing from the paid package. Educational samples in this repo are fictional.

## How do I report a security issue?

Privately — see [SECURITY.md](../SECURITY.md). Do not post public exploit details.
