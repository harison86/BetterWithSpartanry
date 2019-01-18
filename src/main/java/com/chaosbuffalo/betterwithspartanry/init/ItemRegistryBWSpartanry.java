package com.chaosbuffalo.betterwithspartanry.init;

import betterwithmods.common.BWMItems;
import com.chaosbuffalo.betterwithspartanry.BWMMatConverter;
import com.chaosbuffalo.betterwithspartanry.BetterWithSpartanry;
import com.chaosbuffalo.betterwithspartanry.utils;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import com.oblivioussp.spartanweaponry.init.ModelRenderRegistry;
import com.oblivioussp.spartanweaponry.item.*;
import com.oblivioussp.spartanweaponry.api.DamageHelper;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber
public class ItemRegistryBWSpartanry {
    public static final Set<BWMMatConverter> MATERIALS_TO_REGISTER = new HashSet<>();

    public static final String SOULFORGE_STEEL = "soulforgedSteel";
    static {
        MATERIALS_TO_REGISTER.add(new BWMMatConverter(SOULFORGE_STEEL,
                utils.spartanMatFromToolMat(SOULFORGE_STEEL, BWMItems.SOULFORGED_STEEL,
                        2565927, 7500402)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {


        Set<Item> item_set = new HashSet<>();
        for (BWMMatConverter mat : MATERIALS_TO_REGISTER){
            Item katana = SpartanWeaponryAPI.createKatana(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.KATANA,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
                    );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(katana, "katana_" + mat.material.getUnlocName());
            item_set.add(katana);
            Item greatsword = SpartanWeaponryAPI.createGreatsword(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.GREATSWORD,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(greatsword, "greatsword_" + mat.material.getUnlocName());
            item_set.add(greatsword);
            Item longsword = SpartanWeaponryAPI.createLongsword(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LONGSWORD,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(longsword, "longsword_" + mat.material.getUnlocName());
            item_set.add(longsword);
            Item saber = SpartanWeaponryAPI.createSaber(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SABER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(saber, "saber_" + mat.material.getUnlocName());
            item_set.add(saber);
            Item rapier = SpartanWeaponryAPI.createRapier(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.RAPIER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(rapier, "rapier_" + mat.material.getUnlocName());
            item_set.add(rapier);
            Item dagger = SpartanWeaponryAPI.createDagger(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.DAGGER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(dagger,"dagger_" + mat.material.getUnlocName());
            item_set.add(dagger);
            Item spear = SpartanWeaponryAPI.createSpear(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SPEAR,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(spear,"spear_" + mat.material.getUnlocName());
            item_set.add(spear);
            Item pike = SpartanWeaponryAPI.createPike(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.PIKE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(pike, "pike_" + mat.material.getUnlocName());
            item_set.add(pike);
            Item lance = SpartanWeaponryAPI.createLance(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LANCE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(lance, "lance_" + mat.material.getUnlocName());
            item_set.add(lance);
            Item halberd = SpartanWeaponryAPI.createHalberd(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HALBERD,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(halberd, "halberd_" + mat.material.getUnlocName());
            item_set.add(halberd);
            Item warhammer = SpartanWeaponryAPI.createWarhammer(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.WARHAMMER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(warhammer, "warhammer_" + mat.material.getUnlocName());
            item_set.add(warhammer);
            Item hammer = SpartanWeaponryAPI.createHammer(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HAMMER,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(hammer,"hammer_" + mat.material.getUnlocName());
            item_set.add(hammer);
            Item throwing_axe = SpartanWeaponryAPI.createThrowingAxe(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_AXE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(throwing_axe,
                    "throwing_axe_" + mat.material.getUnlocName());
            item_set.add(throwing_axe);
            Item throwing_knife = SpartanWeaponryAPI.createThrowingKnife(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_KNIFE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(throwing_knife,
                    "throwing_knife_" + mat.material.getUnlocName());
            item_set.add(throwing_knife);
            Item longbow = SpartanWeaponryAPI.createLongbow(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    CreativeTabsSW.TAB_SW,
                    null
            );

            ModelRenderRegistryBWSpartanry.addItemToRegistry(longbow, "longbow_" + mat.material.getUnlocName());
            item_set.add(longbow);
            Item crossbow = SpartanWeaponryAPI.createCrossbow(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    CreativeTabsSW.TAB_SW,
                    null
            );

            ModelRenderRegistryBWSpartanry.addItemToRegistry(crossbow,"crossbow_" + mat.material.getUnlocName());
            item_set.add(crossbow);
            Item javelin = SpartanWeaponryAPI.createJavelin(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.JAVELIN,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(javelin,"javelin_" + mat.material.getUnlocName());
            item_set.add(javelin);
            Item battleaxe = SpartanWeaponryAPI.createBattleaxe(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.BATTLEAXE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(battleaxe, "battleaxe_" + mat.material.getUnlocName());
            item_set.add(battleaxe);
            Item mace = SpartanWeaponryAPI.createMace(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.MACE,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(mace, "mace_" + mat.material.getUnlocName());
            item_set.add(mace);
            Item boomerang = SpartanWeaponryAPI.createBoomerang(
                    mat.material,
                    BetterWithSpartanry.MODID,
                    DamageHelper.getDamage(DamageHelper.WeaponType.BOOMERANG,
                            mat.material.getMaterial().getAttackDamage()),
                    CreativeTabsSW.TAB_SW
            );
            ModelRenderRegistryBWSpartanry.addItemToRegistry(boomerang,
                    "boomerang_" + mat.material.getUnlocName());
            item_set.add(boomerang);

        }
        for (Item it : item_set){
            it.setCreativeTab(CreativeTabsSW.TAB_SW);
            ev.getRegistry().register(it);
        }
    }
}
