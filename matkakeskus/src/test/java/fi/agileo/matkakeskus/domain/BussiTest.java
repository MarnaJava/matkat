package fi.agileo.matkakeskus.domain;

import static org.junit.Assert.*;

// jUnit
import org.junit.*;


public class BussiTest {

	// Annotaation Ignore voi laittaa testeille jotka ei mene läpi:
		// @Ignore
	
	private String bussiTunnus = "";

	private String liikennoitsija = "";


	@Test
	public void testBussiTunnus() {
		Bussi liikenne = new Bussi();
		bussiTunnus = liikenne.getbussiTunnus();
		
		assertNotNull(bussiTunnus);
	}
	
	@Test
	public void testLiikennoitsija() {
		
		Bussi liikenne = new Bussi();
		liikennoitsija = liikenne.getLiikennoitsija();
		
		// ei saa olla tyhj�
		assertNotNull(liikennoitsija);
		
	}
	
}
