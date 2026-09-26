package com.frontier.api.examples;

/**
 * EXAMPLE ONLY — conceptual event listener for integration design.
 * <p>
 * Demonstrates reacting to expedition start, successful extract, and failure.
 * Event class names below are fictional documentation types, not production Bukkit
 * events from the commercial plugin.
 */
public class FrontierEventListenerExample {

    /**
     * EXAMPLE: party started an expedition run.
     */
    public void onExpeditionStart(ExpeditionStartExampleEvent event) {
        // e.g. announce to staff chat, begin external analytics timer
        log("start", event.expeditionId(), event.partySize());
    }

    /**
     * EXAMPLE: party extracted successfully — react without re-implementing rewards.
     */
    public void onExpeditionExtract(ExpeditionExtractExampleEvent event) {
        // e.g. grant a cosmetic title in another plugin; do NOT re-roll FRONTIER loot
        log("extract", event.expeditionId(), event.lootMultiplier());
    }

    /**
     * EXAMPLE: run ended without extract (death / abandon / fail).
     */
    public void onExpeditionFail(ExpeditionFailExampleEvent event) {
        log("fail", event.expeditionId(), event.reason());
    }

    private static void log(String kind, Object a, Object b) {
        // Intentionally empty — example placeholder
    }

    /** Fictional event types for documentation. */
    public record ExpeditionStartExampleEvent(String expeditionId, int partySize) {
    }

    public record ExpeditionExtractExampleEvent(String expeditionId, double lootMultiplier) {
    }

    public record ExpeditionFailExampleEvent(String expeditionId, String reason) {
    }
}
