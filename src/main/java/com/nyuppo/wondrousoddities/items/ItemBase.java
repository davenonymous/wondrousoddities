package com.nyuppo.wondrousoddities.items;

import com.nyuppo.wondrousoddities.util.IHasModel;
import com.nyuppo.wondrousoddities.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemBase extends Item implements IHasModel{

	private String name;

	public ItemBase(String name) {

		setUnlocalizedName(name);
		setRegistryName(Reference.MOD_ID, name);
		setCreativeTab(CreativeTabs.MATERIALS);

		this.name = name;
	}

	@Override
	public void registerModels() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

}
