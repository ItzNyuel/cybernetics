package nyuel.cybernetics.world.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import nyuel.cybernetics.CyberneticsMod;
import nyuel.cybernetics.world.tab.CyberneticsTab;

public class CyberneticsItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CyberneticsMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CyberneticsTab.TAB_CYBERNETICS)));
    public static final RegistryObject<Item> BLUESTEEL_INGOT = ITEMS.register("bluesteel_ingot",
            () -> new Item(new Item.Properties().tab(CyberneticsTab.TAB_CYBERNETICS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
