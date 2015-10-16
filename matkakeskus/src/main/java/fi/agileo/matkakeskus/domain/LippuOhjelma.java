package fi.agileo.matkakeskus.domain;

import java.util.Scanner;

public class LippuOhjelma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String mjono;
		Matkustaja matkustaja = new Matkustaja();

		do {

			try { // lopettaa suorittamisen ensimmäisen virheen kohdalla

				System.out.println("Anna matkustajan etunimi: ");

				mjono = input.next();

				Matkustaja.tarkistaNimi(mjono);
				matkustaja.setNimi(mjono);

			} catch (NimiException e) {

				// System.out.println(e.getMessage());

				// System.out.println:n sijaan kokeile printStackTracea (vain
				// testailutarkoituksiin, esim. logiin tallennettavaksi)
				 e.printStackTrace();

			} 
			// finally { // tehdään jokatapauksessa
				
			// }

		} while (matkustaja.getNimi() == null);
		
//		 input.close();
		
		// System.out.println("Anna matkustajan sukunimi: ");
		// mjono = input.next();
	}


}
