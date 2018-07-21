package testblock;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon {
	
	public static TestBlock testBlock; // Holds the unique instance of the block
	public static ItemBlock itemTestBlock; // Holds the item instance of the itemblock corresponding to the blocc
	
	public static void preinitCommon() {
		/*
		 * 
		 * to register items :
		 * specify the registry name and unlocalised name
		 * registry must be unique, unlocalised may not
		 * register using register methods defined in forge registries
		 * 
		 */
		
		testBlock = (TestBlock) (new TestBlock().setUnlocalizedName("testmod_testblock_unlocalised"));
		testBlock.setRegistryName("testmod_testblock_registry");
		ForgeRegistries.BLOCKS.register(testBlock);
		
		/*
		 * TODO : IMPORTANT:
		 * registryname is used to define blockstates
		 * the model resource location name is used as
		 * a prefix for the item and block models
		 */
		
		
		/*
		 * registers the block item because
		 * block in world is separated from block in
		 * hand and inventory
		 */
		// creates the item block for the block
		itemTestBlock = new ItemBlock(testBlock);
		itemTestBlock.setRegistryName(testBlock.getRegistryName());
		ForgeRegistries.ITEMS.register(itemTestBlock);
		
	}
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
}
