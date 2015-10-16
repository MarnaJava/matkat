package fi.agileo.matkakeskus.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class KulkuneuvoTest {

	int istumapaikkoja = 0;
	String bussiTunnus = "";
	String vaunuTunnus = "";

	@Test
	public void testIstumaPaikkojaBussi() {
		Kulkuneuvo kulkuneuvo = new Kulkuneuvo();
		istumapaikkoja = kulkuneuvo.istumapaikkojaBussi;

		assertNotNull(istumapaikkoja);
	}

	@Test
	public void testIstumaPaikkojaJuna() {
		Kulkuneuvo kulkuneuvo = new Kulkuneuvo();
		istumapaikkoja = kulkuneuvo.istumapaikkojaJuna;

		assertNotNull(istumapaikkoja);
	}

	@Test
	public void testBussiTunnus() {
		Bussi liikenne = new Bussi();
		bussiTunnus = liikenne.getbussiTunnus();

		assertNotNull(bussiTunnus);
	}

	@Test
	public void testVaunuTunnus() {
		Juna juna = new Juna();
		vaunuTunnus = juna.getVaunutunnus();

		assertNotNull(vaunuTunnus);
	}
	
}
