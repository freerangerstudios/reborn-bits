
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateCoalOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateCoalOreToCoalSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateCoalOreToCoalSmelting(ElementsRebornBits instance) {
		super(instance, 10);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateCoalOre.block, (int) (1)), new ItemStack(Items.COAL, (int) (1), 0), 0.1F);
	}
}
