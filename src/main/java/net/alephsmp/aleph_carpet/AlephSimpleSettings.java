package net.alephsmp.aleph_carpet;

import carpet.settings.Rule;
import static carpet.settings.RuleCategory.FEATURE;
import static carpet.settings.RuleCategory.SURVIVAL;

public class AlephSimpleSettings {
    public static final String AlephSettingsCategory = "aleph-addon";
    public static final String EndSettingsCategory = "aleph-end-features";
    @Rule(
            desc = "Enables old donkey / llmama dupe bug.",
            category = {SURVIVAL,FEATURE, AlephSettingsCategory}
    )
    public static boolean llamaDupeFeature = false;

    @Rule(
            desc = "Toggle for end gateway cooldown",
            category = {AlephSettingsCategory, FEATURE, EndSettingsCategory}
    )
    public static boolean endGatewayCooldown = true;

    @Rule(
            desc = "Toggle for the main end island structure generation, turns off portal, egg, obsidian pillars, gateways and crystals",
            category = {AlephSettingsCategory, FEATURE, EndSettingsCategory}
    )
    public static boolean endMainIslandStructureGen = true;

    @Rule(
            desc = "Toggle for end obsidian platform generation excluding players",
            category = {AlephSettingsCategory, FEATURE, EndSettingsCategory}
    )
    public static boolean noObsidianPlatform = false;

    @Rule(
            desc = "Toggle for projectiles are ticked the whole time",
            category = {AlephSettingsCategory, FEATURE}
    )
    public static boolean keepProjectilesTicked = false;
}
