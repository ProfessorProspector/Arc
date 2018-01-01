package prospector.arc.registry;

import net.minecraft.item.Item;
import prospector.arc.mod.Arc;
import prospector.shootingstar.base.item.StarItem;

import java.util.ArrayList;

public class ArcItems {
	protected static final ArrayList<Item> ITEMS = new ArrayList<>();

	public static final Item WRENCH = register(new StarItem(Arc.MOD_ID, "testItem"));

	public static Item register(Item item) {
		item.setCreativeTab(Arc.TAB);
		ITEMS.add(item);
		return item;
	}

	public static ArrayList<Item> getItems() {
		return ITEMS;
	}
}
