
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import com.freeranger.rebornbits.block.BlockDeepslateBricks;
import com.freeranger.rebornbits.block.BlockCrackedDeepslateBricks;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateBricksToCrackedDeepslateBricksSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateBricksToCrackedDeepslateBricksSmelting(ElementsRebornBits instance) {
		super(instance, 7);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateBricks.block, (int) (1)), new ItemStack(BlockCrackedDeepslateBricks.block, (int) (1)),
				0.1F);
	}
}
