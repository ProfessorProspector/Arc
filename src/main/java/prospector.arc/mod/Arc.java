package prospector.arc.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import prospector.arc.proxy.ArcCommon;
import prospector.arc.registry.ArcItems;

import java.util.Random;

@Mod(name = Arc.MOD_NAME, modid = Arc.MOD_ID, version = Arc.MOD_VERSION)
public class Arc {

	public static final String MOD_NAME = "Arc";
	public static final String MOD_ID = "arc";
	public static final String MOD_VERSION = "@version@";
	public static final String MC_VERSION = "@mcversion@";
	public static final boolean ENABLE_PROPPAGE = true;
	public static final Random rand = new Random();
	public static final CreativeTabs TAB = new CreativeTabs(Arc.MOD_ID) {
		@Override
		public ItemStack getTabIconItem() {
			if (ArcItems.getItems().isEmpty()) {
				return ItemStack.EMPTY;
			}
			return new ItemStack(ArcItems.getItems().get(rand.nextInt(ArcItems.getItems().size())));
		}
	};
	@SidedProxy(clientSide = "prospector.arc.proxy.ArcClient", serverSide = "prospector.arc.proxy.ArcCommon")
	public static ArcCommon proxy;

	@Mod.Instance
	public static Arc instance;

	public Arc() {
		FluidRegistry.enableUniversalBucket();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//USE PROXY
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//USE PROXY
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//USE PROXY
		proxy.postInit(event);
	}
}
