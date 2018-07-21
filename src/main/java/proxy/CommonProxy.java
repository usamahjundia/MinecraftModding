package proxy;

public abstract class CommonProxy {
	
	public void preInit() {
		testblock.StartupCommon.preinitCommon();
	}
	
	public void init() {
		testblock.StartupCommon.initCommon();
	}
	
	public void postInit() {
		testblock.StartupCommon.postInitCommon();
	}
	
}
