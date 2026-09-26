# Conceptual API examples

> **EXAMPLES ONLY.**  
> These stubs illustrate *ideas* for checking expedition membership, reading coarse state, listening to lifecycle events, plugging a reward provider, and reacting to completion.  
> They are **not** the production FRONTIER API surface, **not** compiled against the commercial JAR, and **not** sufficient to rebuild the product.

Package used here: `com.frontier.api.examples` (educational pseudo-API).

| File | Intent |
|------|--------|
| `FrontierApiExample.java` | Query helpers + reward provider hook sketch |
| `FrontierEventListenerExample.java` | Event listener sketch for start / extract / fail |

## How to use

1. Own a licensed FRONTIER install.
2. Treat these files as design notes while you discover whatever public hooks your installed version actually exposes (if any).
3. Do not assume class/method names match the commercial binary.

## Commercial boundary

Copying proprietary engine classes into this folder (or reverse-engineering them for publication) violates the [LICENSE](../../LICENSE). Keep examples educational and coarse-grained.
