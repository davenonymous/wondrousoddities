package com.nyuppo.wondrousoddities.init;

import com.nyuppo.wondrousoddities.items.ItemBase;
import com.nyuppo.wondrousoddities.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	@GameRegistry.ObjectHolder("indigo")
	public static final ItemBase INDIGO = new ItemBase("indigo");

}
