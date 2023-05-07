package io.github.legacymoddingmc.notenoughverbosity;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Notenoughverbosity.MODID, version = Notenoughverbosity.VERSION)
public class Notenoughverbosity
{
    public static final String MODID = "notenoughverbosity";
    public static final String VERSION = "@VERSION@";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
