package nyuel.cybernetics.world.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import nyuel.cybernetics.world.item.CyberneticsItems;

public class CyberneticsTab {
    public static final ItemGroup TAB_CYBERNETICS = new ItemGroup("cyberneticsTab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CyberneticsItems.COLA.get());
        }
    };
}
