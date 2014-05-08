package sobiohazardous.mods.minestrappolation.extramobdrops.handler;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EMDPlayerTickHandler
{
	public static boolean	ghastTentacleEffect	= false;
	
	static int				ticks			= 0;
	static Random			rand			= new Random();
	public static int		gTime			= 30 + rand.nextInt(150);
	
	@SubscribeEvent
	public void playerUpdate(PlayerTickEvent evt)
	{
		EntityPlayer player = evt.player;
		
		if (evt.phase == Phase.START)
		{
			if (ghastTentacleEffect)
			{
				ticks++;
				if (ticks == gTime * 20)
				{
					ghastTentacleEffect = false;
					EntityPlayerMP playermp = (EntityPlayerMP) player;
					playermp.mcServer.getConfigurationManager().transferPlayerToDimension(playermp, 0);
				}
			}
			else
			{
				ticks = 0;
			}
		}
	}
}