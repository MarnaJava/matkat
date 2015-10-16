package fi.agileo.matkakeskus.domain;

//jUnit
import org.junit.*;

import static org.junit.Assert.*;

public class LippuTest {

	private int istumapaikat = 0;

	
	@Test
	public void testLippu() {

		Kulkuneuvo istumapaikkoja = new Kulkuneuvo();
		istumapaikat = istumapaikkoja.istumapaikkojaBussi;

		// Bussin istumapaikkam��r� oikea eli sama?
		assertEquals(30, istumapaikat);
	}

	@Test
	public void testLippu2() {

		Kulkuneuvo istumapaikkoja = new Kulkuneuvo();
		istumapaikat = istumapaikkoja.istumapaikkojaJuna;

		// Junan istumapaikkam��r� oikea?
		// M��r� ei ole oikea, tultava "Failed"
		assertEquals(47, istumapaikat);
	}

}
