package com.nyuppo.wondrousoddities.util.handlers;

import com.nyuppo.wondrousoddities.init.ModItems;
import com.nyuppo.wondrousoddities.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new ItemBase("indigo"));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		ModItems.INDIGO.registerModels();
	}

}
