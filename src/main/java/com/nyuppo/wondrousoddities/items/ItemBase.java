package com.nyuppo.wondrousoddities.items;

import com.nyuppo.wondrousoddities.Main;
import com.nyuppo.wondrousoddities.init.ModItems;
import com.nyuppo.wondrousoddities.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	private String name;
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		this.name = name;
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

}
