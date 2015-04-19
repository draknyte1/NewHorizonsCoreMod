package com.dreammaster.item;

import com.dreammaster.lib.Refstrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MoldFormCylinder {

    public static void mainRegistry() {
        inizializedItem();
        registerItem();
    }

    public static Item MoldFormCylinder;

    public static void inizializedItem(){
        MoldFormCylinder = new Item().setUnlocalizedName("MoldFormCylinder")
                .setCreativeTab(CreativeTabs.tabMisc)
                .setTextureName(Refstrings.MODID + ":itemMoldFormCylinder");

    }

    public static void registerItem(){
        GameRegistry.registerItem(MoldFormCylinder, MoldFormCylinder.getUnlocalizedName());

    }

}