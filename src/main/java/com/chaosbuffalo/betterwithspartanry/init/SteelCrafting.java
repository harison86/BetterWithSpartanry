package com.chaosbuffalo.betterwithspartanry.init;

import betterwithmods.common.items.ItemMaterial;
import com.chaosbuffalo.betterwithspartanry.BetterWithSpartanry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static betterwithmods.module.gameplay.AnvilRecipes.addSteelShapedRecipe;

/**
 * Created by Jacob on 7/22/2018.
 */
public class SteelCrafting {

    public static void init(){
        Item katana = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                "katana_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (katana != null){
            addSteelShapedRecipe("steel_sword",
                    new ItemStack(katana), "   X", "  X ", " X  ", "H   ", 'X',
                    "ingotSoulforgedSteel", 'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT));
        }

    }
}
