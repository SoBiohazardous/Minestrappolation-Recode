package sobiohazardous.minestrappolation.extraores.proxy;

import java.util.Map;

import sobiohazardous.minestrappolation.extraores.ExtraOres;
import sobiohazardous.minestrappolation.extraores.client.renderer.RenderGrenade;
import sobiohazardous.minestrappolation.extraores.client.renderer.RenderNukePrimed;
import sobiohazardous.minestrappolation.extraores.entity.EntityGrenade;
import sobiohazardous.minestrappolation.extraores.entity.EntityGrenadeImpact;
import sobiohazardous.minestrappolation.extraores.entity.EntityGrenadeSticky;
import sobiohazardous.minestrappolation.extraores.entity.EntityNukePrimed;
import sobiohazardous.minestrappolation.extraores.entity.EntityInstantExplosion;
import sobiohazardous.minestrappolation.extraores.handler.RenderingHandler;
import sobiohazardous.minestrappolation.extraores.lib.EOItemManager;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy
{
	public static String armorPrefix;
    
    @Override
    public void registerRenderThings()
    {
		RenderingRegistry.registerBlockHandler(new RenderingHandler());
				
		RenderingRegistry.registerEntityRenderingHandler(EntityNukePrimed.class, new RenderNukePrimed());
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade(EOItemManager.grenade));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeImpact.class, new RenderGrenade(EOItemManager.grenadeImpact));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeSticky.class, new RenderGrenade(EOItemManager.grenadeSticky));
    }
    
   public static int addArmor(String armor)
    {   
	   armorPrefix = armor;
	   return RenderingRegistry.addNewArmourRendererPrefix(armor);   
    }
}
