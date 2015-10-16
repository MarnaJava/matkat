package fi.agileo.matkakeskus.domain;

import static org.junit.Assert.*;

//jUnit
import org.junit.*;

public class JunaTest {

	private String vaunu = "";

	
	@Test
	public void testVaunuTieto() {
		Juna juna = new Juna();
		vaunu = juna.getVaunutunnus();

		assertNotNull(vaunu);
	}

}
