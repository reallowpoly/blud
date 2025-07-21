package com.lonewalkerstudios.blud.items;

import com.lonewalkerstudios.blud.Blud;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

public static final Item BLUD_LOG = registerItem(new Item (new Item.Settings()));
    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Blud.MOD_ID, "blud_wood"),item);
    }

    public static void registerModItems() {
        Blud.LOGGER.info("Killllll myselffffff" + Blud.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLUD_LOG);
        });
    }
}
