package proxy;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		super.preInit();
		testblock.StartupClientOnly.preInitClient();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		testblock.StartupClientOnly.initClient();
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		super.postInit();
		testblock.StartupClientOnly.postInitClient();
	}
	
	
	
}
