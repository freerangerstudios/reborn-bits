
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import com.freeranger.rebornbits.block.BlockDeepslate;
import com.freeranger.rebornbits.block.BlockCobbledDeepslate;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeCobbledDeepslateToDeepslateSmelting extends ElementsRebornBits.ModElement {
	public RecipeCobbledDeepslateToDeepslateSmelting(ElementsRebornBits instance) {
		super(instance, 8);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCobbledDeepslate.block, (int) (1)), new ItemStack(BlockDeepslate.block, (int) (1)), 0.1F);
	}
}
