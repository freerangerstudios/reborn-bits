
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateIronOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateIronOreToIronIngotSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateIronOreToIronIngotSmelting(ElementsRebornBits instance) {
		super(instance, 13);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateIronOre.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (1)), 0.7F);
	}
}
