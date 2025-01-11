package com.github.dxvc0des.plugin_manual.item;
import com.github.dxvc0des.plugin_manual.Plugin_manual;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Broccoli = registerItem("broccoli", new Item(new Item.Settings()));
    public static final Item HowDidYouGetThis = registerItem("how_did_you_get_this", new Item(new Item.Settings()));
    public static final Item Throw_Up = registerItem("throw_up", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Plugin_manual.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Plugin_manual.LOGGER.info("Registering Mod Items for " + Plugin_manual.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(Broccoli);
           fabricItemGroupEntries.add(HowDidYouGetThis);
           fabricItemGroupEntries.add(Throw_Up);
        });
    }
}
