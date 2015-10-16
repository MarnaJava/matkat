package fi.agileo.matkakeskus.domain;

public class Bussi {

	private String bussiTunnus = "BUS 111";

	private String liikennoitsija = "Kissalan Kuljetus";

	public void setBussiTunnus(String bussiTunnus) {
		this.bussiTunnus = bussiTunnus;
	}

	public String getbussiTunnus() {
		return bussiTunnus;
	}

	public void setLiikennoitsija(String liikennoitsija) {

		this.liikennoitsija = liikennoitsija;

	}

	public String getLiikennoitsija() {
		return liikennoitsija;
	}

}
