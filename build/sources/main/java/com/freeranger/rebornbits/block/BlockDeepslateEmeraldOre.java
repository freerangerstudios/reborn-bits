
package com.freeranger.rebornbits.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

import com.freeranger.rebornbits.ElementsRebornBits;

@ElementsRebornBits.ModElement.Tag
public class BlockDeepslateEmeraldOre extends ElementsRebornBits.ModElement {
	@GameRegistry.ObjectHolder("rebornbits:deepslateemeraldore")
	public static final Block block = null;
	public BlockDeepslateEmeraldOre(ElementsRebornBits instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("deepslateemeraldore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("rebornbits:deepslateemeraldore", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("deepslateemeraldore");
			setSoundType(SoundType.STONE);
			setHardness(4.5F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			int dropAmount = 1;
			if(fortune > 0){
				int i = RANDOM.nextInt(fortune + 2) - 1;

            	if (i < 0)
            	{
                	i = 0;
            	} 
            	dropAmount = i+1;
			}
			drops.add(new ItemStack(Items.EMERALD, dropAmount, 0));
		}

		@Override
		public int getExpDrop(IBlockState state, IBlockAccess reader, BlockPos pos, int fortune){
			return MathHelper.getInt(RANDOM, 3, 7);
		}
	}
}
