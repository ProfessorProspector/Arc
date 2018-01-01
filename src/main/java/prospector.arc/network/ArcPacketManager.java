package prospector.arc.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class ArcPacketManager {
	public static int id = 0;
	public static SimpleNetworkWrapper networkWrapper = null;

	public ArcPacketManager() {
	}

	public static int nextId() {
		return id++;
	}

	public static void registerMessages(String channelName) {
		networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
		registerMessages();
	}

	public static void registerMessages() {

	}
}
