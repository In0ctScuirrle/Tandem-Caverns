package lu.embellishedduck.client;

import lu.embellishedduck.core.TandemCaverns;
import net.fabricmc.api.ClientModInitializer;

public class TandemCavernsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		TandemCaverns.LOGGER.info("Client-Side is good to go! Awaiting instructions.");

	}//End of Method

}//End of Class