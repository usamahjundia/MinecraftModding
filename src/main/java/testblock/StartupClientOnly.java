package testblock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	
	public static void preInitClient() {
		// the following lines must be ran after the block have been registered.
		// basically everything that needs to be done for the block to render properly
		//the resource name you give is the prefix for almost all resources
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("minecrafttestmod:test_block","inventory");
		final int DEFAULT_ITEM_SUBTYPE=0;
		ModelLoader.setCustomModelResourceLocation(StartupCommon.itemTestBlock, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}	
	public static void initClient() {
		
	}	
	public static void postInitClient() {
		
	}

}
