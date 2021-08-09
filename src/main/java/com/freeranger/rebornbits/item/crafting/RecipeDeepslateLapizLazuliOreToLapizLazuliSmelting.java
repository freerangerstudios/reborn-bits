
package com.freeranger.rebornbits.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.freeranger.rebornbits.block.BlockDeepslateLapisLazuliOre;
import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class RecipeDeepslateLapizLazuliOreToLapizLazuliSmelting extends ElementsRebornBits.ModElement {
	public RecipeDeepslateLapizLazuliOreToLapizLazuliSmelting(ElementsRebornBits instance) {
		super(instance, 22);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateLapisLazuliOre.block, (int) (1)), new ItemStack(Items.DYE, (int) (1), 4), 0.2F);
	}
}
