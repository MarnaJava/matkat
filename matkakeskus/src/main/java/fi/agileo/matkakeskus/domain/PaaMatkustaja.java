package fi.agileo.matkakeskus.domain;

public class PaaMatkustaja {

	public static void main(String[] args) {

		Matkustaja pekka = new Matkustaja();
		pekka.setNimi("Pekka");
		pekka.setPaikanHinta(35.50);
		pekka.setKohde("Tampere");

		System.out.println(pekka);

		Matkustaja aino = new Matkustaja();
		aino.setNimi("Aino");
		aino.setPaikanHinta(14.30);
		aino.setKohde("Kerava");

		System.out.println(aino);

		Matkustaja erkki = new Matkustaja();
		erkki.setNimi("Erkki");
		erkki.setPaikanHinta(79.40);
		erkki.setKohde("Kuopio");

		System.out.println(erkki);

		Matkustaja virpi = new Matkustaja();
		virpi.setNimi("Virpi");
		virpi.setPaikanHinta(18.70);
		virpi.setKohde("Järvenpää");

		System.out.println(virpi);

		Matkustaja aimo = new Matkustaja();
		aimo.setNimi("Aimo");
		aimo.setPaikanHinta(52.80);
		aimo.setKohde("Jyväskylä");

		System.out.println(aimo);

		// Harjoitus osa 3
		Matkustaja emmi = new Matkustaja("Emmi", 38.20, "Orivesi");

		System.out.println(emmi);

		Matkustaja onni = new Matkustaja("Onni", 35.50, "Tampere");

		System.out.println(onni);
		
		
		// Osan 3 b-osa: 
		// Lisätään bussiin kuusi matkustajaa

		System.out.println("PIKABUSSIN MATKUSTAJAT: ");
		
		
		Bussi pikabussi = new Bussi(20);		// Suurempi, 20 hengen bussi

		// luodaan uusi olio
		pikabussi.lisaaMatkustaja(pekka);
		pikabussi.lisaaMatkustaja(aino);
		pikabussi.lisaaMatkustaja(erkki);
		pikabussi.lisaaMatkustaja(virpi);
		pikabussi.lisaaMatkustaja(aimo);
		pikabussi.lisaaMatkustaja(emmi);

		// ja poistetaan viimeksi lisätty
		pikabussi.poistaViimeinen();
		
		// ja lisätään vielä yksi
		pikabussi.lisaaMatkustaja(onni);
		
		// tulostuu kuuden matkustajan tiedot. (emmi poistettu).
		

		for (int i = 0; i < pikabussi.matkustajat.length; i++) {
		
			//	System.out.println("Matkustaja: " + pikabussi.matkustajat[i].getNimi());
			// Tutkitaan vain ei-tyhjät alkiot (muuten tulee NullPointerException) (kuten yllä rivillä käyp jos ei tee iffiä)
		
			if (pikabussi.matkustajat[i] != null) {
				System.out.println("Matkustaja: " + pikabussi.matkustajat[i].getNimi() + " , " + pikabussi.matkustajat[i].getPaikanHinta() + " , " + pikabussi.matkustajat[i].getKohde());
			}
			
		}
		
		// Vapaat paikat
		System.out.println("Vapaat paikat: " + pikabussi.vapaatPaikat());

		System.out.printf("Matkustajien liput maksavat yhteensä %.2f euroa", pikabussi.yhteishinta());
		
	}

}
