package fi.agileo.matkakeskus.domain;

public class Matkustaja {

	private String nimi;
	private double paikanHinta;
	private String kohde; // Matkan määränpää

	public Matkustaja() {

	}

	// Käytetään harjoituksessa nr.3 !!! (ei käytetä set-metodeita)
	public Matkustaja(String nimi, double paikanHinta, String kohde) {
		super();
		this.nimi = nimi;
		this.paikanHinta = paikanHinta;
		this.kohde = kohde;
	}

	// setteri hauvat
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setPaikanHinta(double paikanHinta) {
		this.paikanHinta = paikanHinta;
	}

	public void setKohde(String kohde) {
		this.kohde = kohde;
	}

	// noutajat
	public String getNimi() {
		return nimi;
	}

	public double getPaikanHinta() {
		return paikanHinta;
	}

	public String getKohde() {
		return kohde;
	}

	// Tulostus

	public String toString() {
		return ("Matkustaja " + nimi + " kulkee kohti paikkaa nimeltä " + kohde + " hintaan " + paikanHinta
				+ " euroa.");

	}

	// Testailut

	public static void tarkistaNimi(String nimi) throws NimiException {
		if (nimi.trim().length() < 2) {

            throw new NimiException("Error: nimen tulee olla yli kaksi merkkiä: " + nimi + " > " + "Tämä ei kelpaa!");
		}
	}
}
