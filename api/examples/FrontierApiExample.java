package com.frontier.api.examples;

/**
 * EXAMPLE ONLY — conceptual pseudo-API for learning / integration design.
 * <p>
 * This is NOT the production FRONTIER API. Method names and types are invented
 * for documentation. Do not expect these classes to exist in the commercial JAR.
 * Insufficient to rebuild the proprietary expedition engine.
 */
public final class FrontierApiExample {

    private FrontierApiExample() {
    }

    /**
     * EXAMPLE: check whether a player is currently inside an expedition run.
     *
     * @param playerId opaque player identifier from your own plugin context
     * @return true if the player appears to be in an active FRONTIER run
     */
    public static boolean isPlayerInExpedition(Object playerId) {
        // Pseudocode — wire to whatever read-only hook your licensed install exposes.
        throw new UnsupportedOperationException("Example stub — not production API");
    }

    /**
     * EXAMPLE: read coarse run state for display or soft integrations.
     *
     * @param playerId opaque player identifier
     * @return a simple snapshot (expedition id, depth, multiplier) or null
     */
    public static ExpeditionStateExample getExpeditionState(Object playerId) {
        throw new UnsupportedOperationException("Example stub — not production API");
    }

    /**
     * EXAMPLE: register a reward provider hook for soft integrations.
     * Commercial FRONTIER may or may not expose an equivalent extension point.
     */
    public static void registerRewardProvider(RewardProviderExample provider) {
        throw new UnsupportedOperationException("Example stub — not production API");
    }

    /** Coarse, public-safe state snapshot — EXAMPLE DTO. */
    public record ExpeditionStateExample(
            String expeditionId,
            int depth,
            double lootMultiplier,
            boolean extracting
    ) {
    }

    /** EXAMPLE reward provider — educational interface only. */
    public interface RewardProviderExample {
        void onExtract(Object partyId, String expeditionId, double multiplier);
    }
}
