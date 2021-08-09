
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateEmeraldOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateEmeraldOreToEmeraldSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateEmeraldOreToEmeraldSmelting(ElementsRebornBits instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateEmeraldOre.block, (int) (1)), new ItemStack(Items.EMERALD, (int) (1)), 1F);
	}
}
