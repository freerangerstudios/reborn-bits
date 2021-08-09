
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateGoldOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateGoldOreToGoldIngotSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateGoldOreToGoldIngotSmelting(ElementsRebornBits instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateGoldOre.block, (int) (1)), new ItemStack(Items.GOLD_INGOT, (int) (1)), 1F);
	}
}
