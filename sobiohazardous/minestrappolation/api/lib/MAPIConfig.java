package sobiohazardous.minestrappolation.api.lib;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MAPIConfig 
{	
	public static boolean showDur = true;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		showDur = config.get("Misc", "Show Durability", true).getBoolean(true);
				
		config.save();
	}
}
