package prospector.arc.block;

import net.minecraft.util.IStringSerializable;

public class BlockEarthDrill {

	public enum EnumBlockType implements IStringSerializable {
		CENTER("main", 0, 0, 0);

		public final String name;
		public final int forwardRelative;
		public final int upRelative;
		public final int rightRelative;

		EnumBlockType(String name, int forwardRelative, int upRelative, int rightRelative) {
			this.name = name;
			this.forwardRelative = forwardRelative;
			this.upRelative = upRelative;
			this.rightRelative = rightRelative;
		}

		@Override
		public String getName() {
			return name;
		}
	}
}
