package com.github.dxvc0des.plugin_manual.block;

import com.github.dxvc0des.plugin_manual.Plugin_manual;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block How_Did_You_Get_This_Block = registerBlock("how_did_you_get_this_block",
            new Block (AbstractBlock.Settings.create().strength(2.5f).requiresTool().dropsNothing()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Plugin_manual.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Plugin_manual.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Plugin_manual.LOGGER.info("Registering Mod Blocks for " + Plugin_manual.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.How_Did_You_Get_This_Block);
        });
    }
}
