package fi.agileo.matkakeskus.domain;

public class Bussi {


	public Matkustaja matkustajat[];
	
	int kymppibussi = 10;
	int maksimimaara;
	
	int nykyinenmaara = 0;	// Matkustajien nykyinen määrä
	
	
	public Bussi() {
		matkustajat = new Matkustaja[kymppibussi];
		maksimimaara = kymppibussi;
	}

	public Bussi(int maksimimaara) {	// maksimäärää voi muuttaa

		matkustajat = new Matkustaja[maksimimaara];
		this.maksimimaara = maksimimaara;

	}
	
	// 20 hengen bussi
	public void lisaaMatkustaja(Matkustaja lisays) {
		
		if (nykyinenmaara < maksimimaara) {
			
			// Ensimmäinen alkio on 0 (nykyinenmaara on ekalla kerralla 0 eli toimii just hyvin)

			// Taulukon alkioon asetetaan matkustajan olio
			matkustajat[nykyinenmaara] = lisays;
			// Matkustajien kokonaismäärä kasvaa yhdellä
			nykyinenmaara++;

		}
		else {
			System.out.println("Matkustajaa ei hyväksytty mukaan! Liikaa väkeä!");
		}
		
	}
	
	// Poistetaan viimeisin lisätty matkustaja
	public void poistaViimeinen() {
		
		// Viimeisin alkio = nykyinenmaara
		// 
		nykyinenmaara--;
		matkustajat[nykyinenmaara] = null;
	}
	

	// montako paikkaa bussissa on vielä vapaana

	
	public int vapaatPaikat() {

		int erotus = maksimimaara - nykyinenmaara;
		
		return erotus;

	}
	
	// Yhteishinta
	
	public double yhteishinta() {
		
		double hinta = 0.0f;
		
		
		for (int i = 0; i < matkustajat.length; i++) {
		
			
			if (matkustajat[i] != null) {
				
				hinta += matkustajat[i].getPaikanHinta();

			}
			
		}
		
		return hinta;
		
	}
	
	
	
}
