package com.cleanroommc.groovyscript.compat.vanilla;

import com.cleanroommc.groovyscript.GroovyScript;

public class VanillaModule {

    public static final Crafting crafting = new Crafting();
    public static final Furnace furnace = new Furnace();
    public static final OreDict oreDict = new OreDict();
    public static final Player player = new Player();

    public static void initializeBinding() {
        GroovyScript.getSandbox().registerBinding("Crafting", crafting);
        GroovyScript.getSandbox().registerBinding("Furnace", furnace);
        GroovyScript.getSandbox().registerBinding("OreDict", oreDict);
        GroovyScript.getSandbox().registerBinding("OreDictionary", oreDict);
        GroovyScript.getSandbox().registerBinding("Player", player);
    }
}
