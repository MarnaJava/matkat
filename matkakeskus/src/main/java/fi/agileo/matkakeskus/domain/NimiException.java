package fi.agileo.matkakeskus.domain;

public class NimiException extends Exception {

	public NimiException(String msg) {
		// Kutsutaan yläluokan parametrillista konstruktoria
		super(msg);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
