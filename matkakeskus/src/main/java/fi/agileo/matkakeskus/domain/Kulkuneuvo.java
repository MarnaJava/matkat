package fi.agileo.matkakeskus.domain;

public class Kulkuneuvo {

	int istumapaikkojaBussi = 30;
	int istumapaikkojaJuna = 55;
	String bussiTunnus;
	String vaunutunnus;

	public void haeKulkuneuvo() {

		Bussi bussi = new Bussi();
		bussiTunnus = bussi.getbussiTunnus();

		Juna juna = new Juna();
		vaunutunnus = juna.getVaunutunnus();

	}
	
	public void setIstumapaikkojaBussi(int paikat) {
		this.istumapaikkojaBussi = paikat;
	}

	public void setIstumapaikkojaJuna(int paikat) {
		this.istumapaikkojaJuna = paikat;
	}
}
