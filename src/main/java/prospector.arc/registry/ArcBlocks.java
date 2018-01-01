package prospector.arc.registry;

import com.google.common.base.CaseFormat;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import prospector.arc.mod.Arc;
import prospector.shootingstar.base.block.StarBlockWithEntity;

import java.util.ArrayList;
import java.util.HashMap;

public class ArcBlocks {
	protected static final ArrayList<Block> BLOCKS = new ArrayList<>();
	protected static final HashMap<String, Class<? extends TileEntity>> BLOCK_ENTITIES = new HashMap<>();

	public static Block register(StarBlockWithEntity block) {
		String machineName;
		machineName = "Arc" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, block.getName());
		block.setCreativeTab(Arc.TAB);
		BLOCKS.add(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		item.setUnlocalizedName(block.getUnlocalizedName());
		item.setCreativeTab(Arc.TAB);
		ArcItems.ITEMS.add(item);
		BLOCK_ENTITIES.put(machineName, block.getBlockEntityClass());
		return block;
	}

	public static Block register(Block block) {
		return register(block, true);
	}

	public static Block register(Block block, boolean itemBlock) {
		block.setCreativeTab(Arc.TAB);
		BLOCKS.add(block);
		if (itemBlock) {
			ItemBlock item = new ItemBlock(block);
			item.setRegistryName(block.getRegistryName());
			item.setUnlocalizedName(block.getUnlocalizedName());
			item.setCreativeTab(Arc.TAB);
			ArcItems.ITEMS.add(item);
		}
		return block;
	}

	public static Block register(Block block, Class<? extends TileEntity> blockEntity, String entityName) {
		return register(block, true, blockEntity, entityName);
	}

	public static Block register(Block block, boolean itemBlock, Class<? extends TileEntity> blockEntity, String entityName) {
		block.setCreativeTab(Arc.TAB);
		BLOCKS.add(block);
		if (itemBlock) {
			ItemBlock item = new ItemBlock(block);
			item.setRegistryName(block.getRegistryName());
			item.setUnlocalizedName(block.getUnlocalizedName());
			item.setCreativeTab(Arc.TAB);
			ArcItems.ITEMS.add(item);
		}
		BLOCK_ENTITIES.put(entityName, blockEntity);
		return block;
	}

	public static ArrayList<Block> getBlocks() {
		return BLOCKS;
	}
}
