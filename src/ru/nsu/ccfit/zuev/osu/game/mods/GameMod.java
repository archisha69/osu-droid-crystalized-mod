package ru.nsu.ccfit.zuev.osu.game.mods;

public enum GameMod {
    /*
     * Temporarily unranked mods (until adjusted):
     * sd, pf, sc, re, fl
     */
    MOD_NOFAIL("nf", 1, true),
    MOD_AUTO("auto", 1, true),
    MOD_EASY("es", 1),
    MOD_HARDROCK("hr", 1.06f),
    MOD_HIDDEN("hd", 1.06f),
    MOD_RELAX("rx", 1),
    MOD_AUTOPILOT("ap", 1),
    MOD_DOUBLETIME("dt", 1.12f),
    MOD_NIGHTCORE("nc", 1.12f),
    MOD_HALFTIME("ht", 1),
    MOD_SUDDENDEATH("sd", 1),
    MOD_PERFECT("pf", 1),
    MOD_FLASHLIGHT("fl", 1.12f),
    MOD_PRECISE("pr", 1.06f),
    MOD_SMALLCIRCLE("sc", 1.06f),
    MOD_REALLYEASY("re", 1),
    MOD_SCOREV2("v2", 1),
    MOD_SPEEDUP("su", 1.06f),
    MOD_SCOREHAX("sh", 69420f, true), //custom mod for getting more score
    MOD_ALWAYSX("ax", 1, true),//custom mod for getting always ss
    MOD_PRACTICE("pr", 1, true); //practice mod

    public final String shortName;
    public final float scoreMultiplier;
    public final boolean unranked;

    GameMod(String shortName, float scoreMultiplier) {
        this(shortName, scoreMultiplier, false);
    }

    GameMod(String shortName, float scoreMultiplier, boolean unranked) {
        this.shortName = shortName;
        this.scoreMultiplier = scoreMultiplier;
        this.unranked = unranked;
    }
}
