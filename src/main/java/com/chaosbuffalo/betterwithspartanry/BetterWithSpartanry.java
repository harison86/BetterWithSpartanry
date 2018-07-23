package com.chaosbuffalo.betterwithspartanry;

import betterwithmods.BWMod;
import betterwithmods.common.BWMItems;
import com.chaosbuffalo.betterwithspartanry.init.SteelCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Logger;

@Mod(modid = BetterWithSpartanry.MODID, name = BetterWithSpartanry.NAME, version = BetterWithSpartanry.VERSION,
        dependencies="required-after:betterwithmods;required-after:spartanweaponry@[beta 1.1.2]")
public class BetterWithSpartanry
{
    public static final String MODID = "betterwithspartanry";
    public static final String NAME = "Better With Spartanry";
    public static final String VERSION = "0.01";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        SteelCrafting.init();
    }
}
