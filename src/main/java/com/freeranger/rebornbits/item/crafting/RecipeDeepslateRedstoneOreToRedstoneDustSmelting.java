
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateRedstoneOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateRedstoneOreToRedstoneDustSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateRedstoneOreToRedstoneDustSmelting(ElementsRebornBits instance) {
		super(instance, 20);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateRedstoneOre.block, (int) (1)), new ItemStack(Items.REDSTONE, (int) (1)), 0.7F);
	}
}
