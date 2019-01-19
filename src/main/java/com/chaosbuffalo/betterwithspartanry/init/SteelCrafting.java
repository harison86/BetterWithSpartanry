package com.chaosbuffalo.betterwithspartanry.init;

import betterwithmods.common.items.ItemMaterial;
import com.chaosbuffalo.betterwithspartanry.BetterWithSpartanry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static betterwithmods.module.gameplay.AnvilRecipes.addSteelShapedRecipe;

/**
 * Created by Jacob on 7/22/2018.
 */
public class SteelCrafting {

    public static void register_recipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT));
        }
    }

    public static void register_bow_recipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT),
                    'S', "string",
                    'W', "logWood"
                    );
        }
    }

    public static void register_crossbow_recipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT),
                    'S', "string",
                    'W', "logWood",
                    'B', Items.BOW
            );
        }
    }

	public static void register_boomerang_recipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'P', "plankWood"
					);
        }
    }

    public static void init(){
        register_recipe("katana", "   X", "  X ", " X  ", "H   ");
        register_recipe("greatsword", " X  ", "XXX ", "XXX ", "XHX ");
        register_recipe("longsword", " X  ", " X  ", " X  ", "XHX ");
        register_recipe("saber", " X  ", " X  ", " X  ", "XH  ");
        register_recipe("rapier", "   X", "  X ", "XX  ", "HX  ");
        register_recipe("spear", "X   ", "X   ", "H   ");
        register_recipe("dagger","X   ", "H   " );
        register_recipe("pike", " X  ", " X  ", " H  ", " H  ");
        register_recipe("lance","   X", "  H ", "XH  ", "HX  ");
        register_recipe("halberd", "  XX", " XH ", " H  ", "X   ");
        register_recipe("warhammer", " XXX", " XXX", "  H ", "  H ");
        register_recipe("throwing_axe", "HX  ", " X  ");
        register_recipe("hammer", "XXXX", "XXXX", " HH ", " HH ");
        register_recipe("throwing_knife", "HX");
        register_recipe("javelin", "HXX");
        register_recipe("battleaxe", " XXX", " XHX", "  H ", "  H ");
        register_recipe("mace", "  XX", "  HX", " H  ", "H   ");
        register_bow_recipe("longbow", "HWXX", "W  S", "X  S", "XSS ");
        register_crossbow_recipe("crossbow", "BSXX", "SWWS", "XWHS", "XSSH");
        register_boomerang_recipe("boomerang", "XPPP", "P   ", "P   ", "P   ");






    }

}
