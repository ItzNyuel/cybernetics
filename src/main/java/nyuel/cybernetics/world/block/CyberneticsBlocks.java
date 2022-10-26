package nyuel.cybernetics.world.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import nyuel.cybernetics.CyberneticsMod;
import nyuel.cybernetics.world.item.CyberneticsItems;
import nyuel.cybernetics.world.tab.CyberneticsTab;

import java.util.function.Supplier;

public class CyberneticsBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CyberneticsMod.MOD_ID);

    public static final RegistryObject<Block> HARDENED_STONE = registerBlock("hardened_stone",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(2.0F, 6.5F)));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.METAL).harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(2.5F, 7.0F)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        CyberneticsItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CyberneticsTab.TAB_CYBERNETICS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
