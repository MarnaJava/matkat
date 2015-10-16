package fi.agileo.matkakeskus.domain;

import static org.junit.Assert.*;

//jUnit
import org.junit.*;

public class MatkustajaTest {

	private String nimitieto = "";

	// @BeforeClass
	// @Before

	@Test
	public void testNimitieto() {
		Matkustaja matkustaja = new Matkustaja();
		nimitieto = matkustaja.getNimi();

		// tarkistus, ettei nimitieto puutu
		assertNotNull(nimitieto);

	}

	@Test
	public void testNimiNull() {
		Matkustaja matkustaja = new Matkustaja();
		nimitieto = matkustaja.getNimi();

		// Nimitieto oltava, joten t�st� tultava "Failed"
		assertNull(nimitieto);
	}

	// @After

}
