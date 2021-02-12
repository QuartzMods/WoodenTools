package org.harrydev.woodentools.Loaders;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.registry.Registry;
import org.harrydev.woodentools.WoodenTools;

import static org.harrydev.woodentools.WoodenTools.id;
import static org.harrydev.woodentools.WoodenTools.log;

public class ItemLoader {

    public static final Item OAK_SWORD;
    public static final Item SPRUCE_SWORD;
    public static final Item BIRCH_SWORD;
    public static final Item JUNGLE_SWORD;
    public static final Item ACACIA_SWORD;
    public static final Item DARK_OAK_SWORD;
    public static final Item CRIMSON_SWORD;
    public static final Item WARPED_SWORD;

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, id(name), item);
    }

    static {
        OAK_SWORD = register("oak_sword", (new SwordItem(ToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        SPRUCE_SWORD = register("spruce_sword", (new SwordItem(ToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        BIRCH_SWORD = register("birch_sword", (new SwordItem(ToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        JUNGLE_SWORD = register("jungle_sword", (new SwordItem(ToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        ACACIA_SWORD = register("acacia_sword", (new SwordItem(ToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        DARK_OAK_SWORD = register("dark_oak_sword", (new SwordItem(ToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        CRIMSON_SWORD = register("crimson_sword", (new SwordItem(ToolMaterials.WOOD, 4, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
        WARPED_SWORD = register("warped_sword", (new SwordItem(ToolMaterials.WOOD, 4, -2.4F, (new Item.Settings()).group(WoodenTools.WOOD_SWORDS))));
    }

    public static void INIT() {
        log("Loaded Items...");
    }

}
