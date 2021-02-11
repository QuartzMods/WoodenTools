package org.harrydev.woodentools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.harrydev.woodentools.Loaders.ItemLoader;

public class WoodenTools implements ModInitializer {
    private static final Logger LOGGER = LogManager.getLogger(WoodenTools.class);
    public static String MODID = "woodentools";

    public static final ItemGroup WOOD_SWORDS = FabricItemGroupBuilder.build(
            id("wooden_swords"),
            () -> new ItemStack(Items.WOODEN_SWORD));

    @Override
    public void onInitialize() {
        log("Initialized Mod....");
        ItemLoader.INIT();
    }

    public static Identifier id(String name) {
        return new Identifier(MODID, name);
    }

    public static void log(String msg){
        LOGGER.info(msg);
    }
}
