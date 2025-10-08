package com.shyamstudio.celestCombatPro.api;

import com.shyamstudio.celestCombatPro.CelestCombatPro;

public final class CelestCombatAPI {
    
    private static CombatAPI combatAPI;
    
    private CelestCombatAPI() {
    }
    
    public static void initialize(CombatAPI api) {
        if (combatAPI != null) {
            throw new IllegalStateException("CelestCombatAPI is already initialized!");
        }
        combatAPI = api;
    }
    
    public static CombatAPI getCombatAPI() {
        if (combatAPI == null) {
            throw new IllegalStateException("CelestCombatAPI is not initialized yet! Make sure CelestCombat is enabled.");
        }
        return combatAPI;
    }
    
    public static boolean isInitialized() {
        return combatAPI != null;
    }
    
    public static void shutdown() {
        combatAPI = null;
    }
    
    public static String getVersion() {
        return CelestCombatPro.getInstance().getPluginMeta().getVersion();
    }
}
