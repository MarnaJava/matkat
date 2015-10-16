package fi.agileo.matkakeskus.domain;

// import java.sql.Time;
// import java.util.Date;

public class Lippu {
	
	//private String nimi = "";
	//private String bussitunnus = "";
	//private String vaunutunnus = "";
	
	/*
	String lippuID;
	String lahtoPaikka;
	String maaranpaa;
	Date lahtoaika;
	Date paluuaika;
	int matkankesto;
	Date voimassaolo;
	int vaihtoja;
	boolean paikkavaraus;
	int istumaPaikkaNro;
	String vuorotyyppi;
	String matkustajaluokka;
	Double loppusumma;
	Date ostoPvm;
	Time ostonKellonaika;
	boolean takaisinLunastus;
	*/
	
	
	public static void main(String[] args) {
		
		// matkustajan nimen haku
		Matkustaja matkustaja = new Matkustaja();
		System.out.println("Matkustajan nimi on: " + matkustaja.getNimi());
		
		// Bussin tiedot
		Bussi bussi = new Bussi();
		System.out.println("Bussin tunnus on: " + bussi.getbussiTunnus());
		System.out.println("Bussin liikenn�itsija on: " + bussi.getLiikennoitsija());
		
		// Junan tiedot
		Juna juna = new Juna();
		System.out.println("Junan vaununro on: " + juna.getVaunutunnus());
		
		// Istumapaikat
		Kulkuneuvo paikkamaara = new Kulkuneuvo();
		int istumapaikkojaBussi = paikkamaara.istumapaikkojaBussi;
		int istumapaikkojaJuna = paikkamaara.istumapaikkojaJuna;
		
		System.out.println("Bussin paikkam��r� on: " + istumapaikkojaBussi);
		System.out.println("Junan paikkam��r� on: " + istumapaikkojaJuna);
		
	}

}
