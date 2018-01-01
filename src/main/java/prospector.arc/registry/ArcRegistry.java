package prospector.arc.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import prospector.arc.mod.Arc;
import prospector.shootingstar.ShootingStar;
import prospector.shootingstar.base.blockentity.StarBlockEntity;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = Arc.MOD_ID)
public class ArcRegistry {
	private static ArrayList<Item> items = new ArrayList<>();
	private static ArrayList<Block> blocks = new ArrayList<>();
	private static ArrayList<Class<? extends StarBlockEntity>> blockEntities = new ArrayList<>();

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ShootingStar.registerModels(Arc.MOD_ID);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for (Item item : ArcItems.ITEMS) {
			event.getRegistry().register(item);
		}
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		for (Block block : ArcBlocks.BLOCKS) {
			event.getRegistry().register(block);
		}
	}

	public static void registerBlockEntities() {
		for (String entityName : ArcBlocks.BLOCK_ENTITIES.keySet()) {
			GameRegistry.registerTileEntity(ArcBlocks.BLOCK_ENTITIES.get(entityName), entityName);
		}
	}

	public static void registerRecipes() {

	}

	public static void postInitRecipes() {

	}
}

