package net.patpuck.packable.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.patpuck.packable.Packable;
import net.patpuck.packable.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Packable.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(Items.DIAMOND);

                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.COAL_BRIQUETTE);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);

                        entries.add(ModBlocks.SOUND_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        Packable.LOGGER.info("Registering Item Groups for " + Packable.MOD_ID);
    }
}
