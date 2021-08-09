
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateDiamondOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateDiamondOreToDiamondSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateDiamondOreToDiamondSmelting(ElementsRebornBits instance) {
		super(instance, 16);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateDiamondOre.block, (int) (1)), new ItemStack(Items.DIAMOND, (int) (1)), 1F);
	}
}
