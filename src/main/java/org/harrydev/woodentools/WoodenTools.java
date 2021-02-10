package org.harrydev.woodentools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class WoodenTools implements ModInitializer {

    public static String MODID = "woodentools";

    public static final ItemGroup WOOD_SWORDS = FabricItemGroupBuilder.build(
            id("wooden_swords"),
            () -> new ItemStack(Items.WOODEN_SWORD));

    public static final Item BIRCH_SWORD = new Item(new FabricItemSettings().group(WOOD_SWORDS));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, id("birch_sword"), BIRCH_SWORD);
    }

    public static Identifier id(String name) {
        return new Identifier(MODID, name);
    }
}
