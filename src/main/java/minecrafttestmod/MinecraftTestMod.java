package minecrafttestmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import proxy.CommonProxy;


//defines the entry point of the mod, that this class is the first thing
//the mod should look up to do mod things
@Mod(modid= MinecraftTestMod.MODID, version = MinecraftTestMod.VERSION)
public class MinecraftTestMod {
	/*
	 * every mods require at least 2 parameters to describe the mod in the annotation.
	 * the mod id and the version of the mod.
	 */
	public static final String MODID = "minecrafttestmod";
	public static final String VERSION = "dev 1.0.0";
	
	// Instane of the mod (idk what for)
	@Mod.Instance
	public static MinecraftTestMod instance;
	
	// this part decides which proxy will be applied, given a
	// base proxy class
	
	@SidedProxy(clientSide="proxy.ClientProxy",serverSide="proxy.DedicatedServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
	}
	
	
	
}
