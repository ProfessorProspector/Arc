package prospector.arc.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import prospector.arc.mod.Arc;
import prospector.arc.network.ArcPacketManager;
import prospector.arc.registry.ArcRegistry;

public class ArcCommon {

	public void preInit(FMLPreInitializationEvent event) {
		ArcRegistry.registerBlockEntities();
		ArcRegistry.registerRecipes();
		ArcPacketManager.registerMessages(Arc.MOD_ID);
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {
		ArcRegistry.postInitRecipes();
	}

	public World getClientWorld() {
		return null;
	}

	public EntityPlayer getClientPlayer() {
		return null;
	}
}
